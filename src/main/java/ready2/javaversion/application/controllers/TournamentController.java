package ready2.javaversion.application.controllers;


import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ready2.javaversion.domain.data.responses.GetAllTournamentsResponse;
import ready2.javaversion.domain.ports.api.TournamentAPIService;
import ready2.javaversion.infrastructure.Tournament.entity.concretes.Tournament;

import java.util.List;

@RestController
@RequestMapping("/tournament")
public class TournamentController {

    private TournamentAPIService tournamentAPIService;

    @GetMapping("/getAllTournaments")
    public List<GetAllTournamentsResponse> getAllTournaments(){
        return this.tournamentAPIService.getAllTournaments();
    }

}
// http://localhost:8080/tournament/getAllTournaments