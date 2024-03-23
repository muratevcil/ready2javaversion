package ready2.javaversion.domain.data.Tournament.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ready2.javaversion.domain.data.Tournament.entities.TournamentUserDTO;
import ready2.javaversion.infrastructure.TournamentNM.entity.abstracts.TournamentStageType;
import ready2.javaversion.infrastructure.TournamentNM.entity.abstracts.TournamentTeamType;
import ready2.javaversion.infrastructure.TournamentNM.entity.concretes.TournamentDates;
import ready2.javaversion.infrastructure.TournamentNM.entity.concretes.TournamentEncounter;
import ready2.javaversion.infrastructure.TournamentNM.entity.concretes.TournamentGroup;
import ready2.javaversion.infrastructure.TournamentNM.entity.concretes.TournamentStage;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetTournamentByIdResponse {

    private String tournamentUUID;

    private String tournamentName;

    private String tournamentDescription;

    private int gameId;

    private String gameSlug;

    private TournamentDates tournamentDates;

    private TournamentStageType tournamentStageType;

    private TournamentTeamType tournamentTeamType;

    private List<TournamentStage> tournamentStageList;

    private List<TournamentGroup> tournamentGroupList;

    private List<TournamentEncounter> tournamentEncounter;

    private String hubUUID;

    private List<TournamentUserDTO> tournamentUsers;

}
