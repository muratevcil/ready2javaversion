package ready2.javaversion.domain.data.Tournament.responses;


import lombok.*;
import ready2.javaversion.domain.data.Tournament.entities.TournamentStageDTO;
import ready2.javaversion.domain.data.Tournament.entities.TournamentUserDTO;
import ready2.javaversion.infrastructure.TournamentNM.entity.abstracts.TournamentStageNum;
import ready2.javaversion.infrastructure.TournamentNM.entity.abstracts.TournamentTeamType;
import ready2.javaversion.infrastructure.TournamentNM.entity.concretes.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class GetAllTournamentsResponse{

    private String tournamentUUID;

    private String tournamentName;

    private String tournamentDescription;

    private int gameId;

    private String gameSlug;

    private TournamentDates tournamentDates;

    private TournamentTeamType tournamentTeamType;

    private List<TournamentStageDTO> tournamentStageList;

    private String hubUUID;

    private List<TournamentUserDTO> tournamentUsers;

    private TournamentStageNum tournamentStageNum;

    @Override
    public String toString() {
        return "GetAllTournamentsResponse{" +
                "tournamentUUID='" + tournamentUUID + '\'' +
                ", tournamentName='" + tournamentName + '\'' +
                ", tournamentDescription='" + tournamentDescription + '\'' +
                ", gameId=" + gameId +
                ", tournamentDates=" + tournamentDates +
                ", tournamentTeamType=" + tournamentTeamType +
                ", tournamentStageList=" + tournamentStageList +
                ", hubUUID='" + hubUUID + '\'' +
                '}';
    }


}
