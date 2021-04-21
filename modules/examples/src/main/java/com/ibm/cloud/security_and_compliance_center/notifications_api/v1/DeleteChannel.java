package com.ibm.cloud.security_and_compliance_center.notifications_api.v1;

import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.IamAuthenticator;
import com.ibm.cloud.security_and_compliance_center.notifications_api.v1.model.ChannelDelete;
import com.ibm.cloud.security_and_compliance_center.notifications_api.v1.model.DeleteNotificationChannelOptions;

public class DeleteChannel {
    protected DeleteChannel() {
    }

    public static String apiKey = System.getenv("API_KEY");
    public static String accountId = System.getenv("ACCOUNT_ID");
    public static String iamUrl = System.getenv("IAM_URL");
    public static String apiUrl = System.getenv("FINDINGS_API_URL");
    public static String testString = "testString";

    public static Authenticator authenticator = new IamAuthenticator(apiKey, iamUrl, null, null, true, null);
    public static NotificationsApi service = new NotificationsApi("notifications-api", authenticator);

    public static void main(String[] args) {
        Authenticator authenticator = new IamAuthenticator(apiKey);

        NotificationsApi notificationsApi = new NotificationsApi("notifications_api", authenticator);
        notificationsApi.setServiceUrl(apiUrl);

        DeleteNotificationChannelOptions opts = new DeleteNotificationChannelOptions.Builder()
        .accountId(accountId)
        .channelId(testString)
        .build();

        Response<ChannelDelete> resp = notificationsApi.deleteNotificationChannel(opts).execute();
        System.out.println(resp.getResult());
    }
}