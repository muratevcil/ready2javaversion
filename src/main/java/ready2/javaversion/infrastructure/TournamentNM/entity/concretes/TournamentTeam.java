package ready2.javaversion.infrastructure.TournamentNM.entity.concretes;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TournamentTeam {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String tournamentTeamUUID;
    
}
