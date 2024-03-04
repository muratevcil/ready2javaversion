package ready2.javaversion.infrastructure.Tournament.entity.concretes;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TournamentHub {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String tournamentHubId;

    private String tournamentHubName;

    private String tournamentHub;


}
