package TestBotToken;

import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class GetMe {

    private String ok;
    private Result result;
    @JsonSetter("error_code")
    private int errorCode;
    private String description;
}
