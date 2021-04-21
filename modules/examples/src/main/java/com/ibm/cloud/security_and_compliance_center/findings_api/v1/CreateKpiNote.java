package com.ibm.cloud.security_and_compliance_center.findings_api.v1;

import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.IamAuthenticator;
import com.ibm.cloud.security_and_compliance_center.findings_api.v1.model.ApiNote;
import com.ibm.cloud.security_and_compliance_center.findings_api.v1.model.CreateNoteOptions;
import com.ibm.cloud.security_and_compliance_center.findings_api.v1.model.KpiType;
import com.ibm.cloud.security_and_compliance_center.findings_api.v1.model.Reporter;

public class CreateKpiNote {
    protected CreateKpiNote() {
    }

    public static String apiKey = System.getenv("API_KEY");
    public static String accountId = System.getenv("ACCOUNT_ID");
    public static String iamUrl = System.getenv("IAM_URL");
    public static String apiUrl = System.getenv("FINDINGS_API_URL");
    public static String testString = "testString";

    public static Authenticator authenticator = new IamAuthenticator(apiKey, iamUrl, null, null, true, null);
    public static FindingsApi service = new FindingsApi("findings_api", authenticator);

    public static void main(String[] args) {

        service.setServiceUrl(apiUrl);

        Reporter reporter = new Reporter.Builder().id(testString).title(testString).url(testString).build();

        KpiType kpi = new KpiType.Builder().aggregationType("SUM").build();

        CreateNoteOptions opts = new CreateNoteOptions.Builder().accountId(accountId).providerId(testString)
                .shortDescription(testString).longDescription(testString).kind("KPI").id(testString)
                .reportedBy(reporter).kpi(kpi).build();

        Response<ApiNote> resp = service.createNote(opts).execute();
        System.out.println(resp.getResult());
    }
}