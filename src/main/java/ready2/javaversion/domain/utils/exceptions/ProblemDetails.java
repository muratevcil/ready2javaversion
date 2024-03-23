package ready2.javaversion.domain.utils.exceptions;


import lombok.*;
import org.springframework.stereotype.Service;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProblemDetails {

    private int statusCode;

    private String message;

}
