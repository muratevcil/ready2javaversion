package ready2.javaversion.domain.data.Tournament.requests;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import ready2.javaversion.infrastructure.TournamentNM.entity.abstracts.TournamentStageType;
import ready2.javaversion.infrastructure.TournamentNM.entity.concretes.Tournament;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateTournamentStageCommand {

    @NonNull
    private String tournamentId;

    @NonNull
    private String tournamentStageType;

    @NonNull
    private String tournamentStageName;

    @NonNull
    private String tournamentStageDescription;

}
