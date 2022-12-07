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
public class Result {

    private long id;
    @JsonSetter("is_bot")
    private boolean isBot;
    @JsonSetter("first_name")
    private String firstName;
    @JsonSetter("username")
    private String userName;
    @JsonSetter("can_join_groups")
    private boolean canJoinGroups;
    @JsonSetter("can_read_all_group_messages")
    private boolean canReadAllGroupMessages;
    @JsonSetter("supports_inline_queries")
    private boolean supportsInlineQueries;
}
