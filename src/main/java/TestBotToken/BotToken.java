package TestBotToken;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

public class BotToken {

    @SneakyThrows
    public static GetMe getMe(String response) {
        return new ObjectMapper().readValue(response, GetMe.class);
    }
}
