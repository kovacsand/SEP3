package via.sep3.logic.grpcclient;

import via.sep3.logic.domain.model.Report;

import java.util.List;

public interface GrpcClient
{
    List<Report> getReports();
}
