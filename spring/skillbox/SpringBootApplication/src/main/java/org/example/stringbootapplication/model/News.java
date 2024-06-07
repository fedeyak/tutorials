package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@AllArgsConstructor
public class News {

    private final Long id;
    private final String title;
    private final String text;
    private final Instant date;

    public boolean isValid() {
        return title != null || text != null || date != null;
    }
}
