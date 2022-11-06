package via.sep3.logic.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Report
{
    private LocalDate date;
    private LocalTime time;
    private byte[] proof;       //this allows one image as of now
    private String description;
    private String status;

    public Report(LocalDate date, LocalTime time, byte[] proof, String description, String status)
    {
        this.date = date;
        this.time = time;
        this.proof = proof;
        this.description = description;
        this.status = status;
    }

    public LocalDate getDate()
    {
        return date;
    }

    public LocalTime getTime()
    {
        return time;
    }

    public byte[] getProof()
    {
        return proof;
    }

    public String getDescription()
    {
        return description;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }
}
