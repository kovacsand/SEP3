using Domain.Model;
using ReportRepo;

namespace GrpcServer.Services;
using Grpc.Core;

public class ReportService:Report.ReportBase
{
    private readonly FileContext context;
    
    public Task<ReportList> GetReports(ReportFilter request, ServerCallContext context)
    {
        return base.GetReports(request, context);
    }


}