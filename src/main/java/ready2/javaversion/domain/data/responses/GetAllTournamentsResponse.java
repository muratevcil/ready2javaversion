package ready2.javaversion.domain.data.responses;


import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;
import ready2.javaversion.infrastructure.Tournament.entity.abstracts.TournamentDates;
import ready2.javaversion.infrastructure.Tournament.entity.abstracts.TournamentStageNums;
import ready2.javaversion.infrastructure.Tournament.entity.abstracts.TournamentTeamTypes;
import ready2.javaversion.infrastructure.Tournament.entity.concretes.Country;
import ready2.javaversion.infrastructure.Tournament.entity.concretes.TournamentGame;
import ready2.javaversion.infrastructure.Tournament.entity.concretes.TournamentStage;
import ready2.javaversion.infrastructure.Tournament.entity.concretes.TournamentUser;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GetAllTournamentsResponse {
    private String tournamentId;
    private String tournamentName;
    private String tournamentDescription;
    private TournamentGame tournamentGame;
    private TournamentDates tournamentDates;
    private TournamentStageNums tournamentStageType;
    private TournamentTeamTypes tournamentTeamTypes;
    private List<TournamentStage> tournamentStageList;
    private List<TournamentUser> tournamentUserList;
    private List<TournamentUser> suspendedUsers;
    private List<Country> suspendedCountries;
}
