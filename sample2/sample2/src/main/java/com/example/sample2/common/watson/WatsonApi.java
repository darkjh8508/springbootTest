package com.example.sample2.common.watson;

public class WatsonApi {
    public void watsonConnector() {

    }
}


/*
public class ConnectWatsonAssistant {

	public static void main(String[] args) {

		String apiKey = "rH*****************************8nV";
		String version = "2021-08-18";
		String serviceUrl = "https://api.us-south.assistant.watson.cloud.ibm.com/instances/******************";
		String assistantId = "25**********************5";
		
		IamAuthenticator authenticator = new IamAuthenticator(apiKey);
		Assistant assistant = new Assistant(version, authenticator);
		assistant.setServiceUrl(serviceUrl);
		CreateSessionOptions options = new CreateSessionOptions.Builder(assistantId).build();
		assistant.createSession(options);
		SessionResponse response = assistant.createSession(options).execute().getResult();

		System.out.println("Session="+response);

		MessageInput input = new MessageInput.Builder().text("I am not feeling well.").build();
		MessageOptions messageOptions = new MessageOptions.Builder().assistantId(assistantId)
				.sessionId(response.getSessionId()).input(input).build();
		MessageResponse messageResponse = assistant.message(messageOptions).execute().getResult();

		System.out.println("ResponseFromWatson=" + messageResponse);

	}

}
*/

/*
public static void main(String[] args) {
    IamOptions iamOptions = new IamOptions.Builder().apiKey("{apikey}").build();
    Assistant service = new Assistant("2018-09-20", iamOptions);
    service.setEndPoint("https://gateway.watsonplatform.net/assistant/api");

    String workspaceId = "{workspaceId}";
    InputData input = new InputData.Builder("다이하드 보러갈래?").build();

    MessageOptions options = new MessageOptions.Builder(workspaceId)
      .input(input)
      .build();

    MessageResponse response = service.message(options).execute();
    System.out.println(response);
}
*/

/*
String version = "2018-07-10";
String username = "xxx";
String password = "xxx";

String workspaceId = "xxx";

Assistant service = new Assistant(version);
service.setUsernameAndPassword(username, password);

InputData input = new InputData.Builder("Hi").build();

// MessageOptions options = new
// MessageOptions.Builder(workspaceId).input(input).build();
MessageOptions options = new MessageOptions.Builder(workspaceId).build();

// sync
MessageResponse response = service.message(options).execute();
System.err.println(response);

System.err.println("---");

System.err.println(response.getOutput().getText());
*/