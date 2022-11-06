package via.sep3.logic.webapi;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import via.sep3.logic.domain.model.Location;
import via.sep3.logic.domain.model.Report;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;


@RestController
public class ReportsController
{
    @GetMapping("/reports")
    public String getReports()
    {
        List<Report> reports = new ArrayList<>();
        reports.add(new Report(LocalDate.now(), LocalTime.now(), null, "it is a report", "Under Review", new Location(1.1, 2.2, (byte) 1)));

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        mapper.registerModule(new JavaTimeModule());

        String reportsAsJson;

        try
        {
            reportsAsJson = mapper.writeValueAsString(reports);
        } catch (JsonProcessingException e)
        {
            //We should talk about this
            throw new RuntimeException(e);
        }

        System.out.println(reportsAsJson);
        return reportsAsJson;
    }
}
