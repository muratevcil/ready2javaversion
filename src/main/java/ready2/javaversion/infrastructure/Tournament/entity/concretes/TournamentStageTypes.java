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
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class TournamentStageTypes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String tournamentStageTypeId;

    private String tournamentStageTypeName;

    private String tournamentStageTypeDescription;

}
