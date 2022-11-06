package via.sep3.logic.webapi;

import via.sep3.logic.model.Report;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ReportsController
{
    @GetMapping("/reports")
    public List<Report> getReports()
    {
        List<Report> reports = new ArrayList<>();
        reports.add(new Report(LocalDate.now(), LocalTime.now(), null, "it is a report", "Under Review"));
        return reports;
    }
}
