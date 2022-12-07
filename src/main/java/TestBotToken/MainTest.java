package TestBotToken;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class MainTest {

    private static final String API = "https://api.telegram.org/bot";

    public static void main(String[] args) {
        System.out.println(getMe("5211613790:AAHgfJFwdLcZ63dNDVB2PHPclELn-9fQYc0"));
    }

    public static GetMe getMe(String token) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(API + token + "/getMe"))
                .build();
        HttpResponse<String> response;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(response.body());
        return BotToken.getMe(response.body());
    }
}
