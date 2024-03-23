package ready2.javaversion.infrastructure.TournamentNM.entity.concretes;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class TournamentDates {

    private Date announcementDate;

    private Date startingDate;

    private Date firstCheckInDate;

    private Date lastCheckInDate;

    private Date seedingDate;

    private Date endingDate;

}
