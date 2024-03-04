package ready2.javaversion.infrastructure.Tournament.entity.abstracts;


import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TournamentDates {

    @Nullable //if tournament private
    private Date announcementDate;

    private Date startingDate;

    private Date firstCheckInDate;

    private Date lastCheckInDate;

    private Date seedingDate;

    private Date endingDate;

}
