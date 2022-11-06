using System.Text.Json;
using Domain.Model;
using HttpClients.ClientInterfaces;

namespace HttpClients.ClientImplementations;

public class ReportServiceImpl : IReportService
{
    private readonly HttpClient client;

    public ReportServiceImpl(HttpClient client)
    {
        this.client = client;
    }

    public async Task<ICollection<Report>> GetAsync()
    {
        HttpResponseMessage response = await client.GetAsync("http://localhost:8910/reports");
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
            throw new Exception(result);
        
        ICollection<Report> reports = JsonSerializer.Deserialize<ICollection<Report>>(result,
            new JsonSerializerOptions { PropertyNameCaseInsensitive = true, WriteIndented = true})!;
        return reports;
    }
}