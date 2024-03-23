package ready2.javaversion.domain.data.Tournament.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ready2.javaversion.infrastructure.TournamentNM.entity.abstracts.TournamentStageNum;
import ready2.javaversion.infrastructure.TournamentNM.entity.abstracts.TournamentStageType;
import ready2.javaversion.infrastructure.TournamentNM.entity.abstracts.TournamentTeamType;
import ready2.javaversion.infrastructure.TournamentNM.entity.concretes.*;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateTournamentCommand {

    private TournamentHub tournamentHub;

    private String tournamentName;

    private String tournamentDescription;

    private TournamentGame tournamentGame;

    private TournamentDates tournamentDates;

    private TournamentTeamType tournamentTeamType;

    private TournamentStageNum tournamentStageNum;

}
