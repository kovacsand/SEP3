using Domain.Model;

namespace HttpClients.ClientInterfaces;

public interface IReportService
{
    Task<ICollection<Report>> GetAsync();
}