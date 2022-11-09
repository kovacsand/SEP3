using Domain.Model;

namespace ReportRepo;



public class DataContainer
{
    public ICollection<Report> Reports { get; set; }
    public ICollection<Location> Locations { get; set; }
}