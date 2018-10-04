package sample_gcp_project;

import com.google.api.gax.paging.Page;
import com.google.cloud.bigquery.BigQuery;
import com.google.cloud.bigquery.BigQueryOptions;
import com.google.cloud.bigquery.Job;

public class BigQueryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigQuery service = BigQueryOptions.newBuilder().setProjectId(args[0]).build().getService();
		Page<Job> jobPage = service.listJobs(BigQuery.JobListOption.allUsers());
		
		for (Job job : jobPage.getValues()) {
			System.out.println("status: " + job.getStatus());
		}

	}

}
