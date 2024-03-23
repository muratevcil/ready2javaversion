package ready2.javaversion.infrastructure.TournamentNM.rules;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import ready2.javaversion.infrastructure.TournamentNM.repository.TournamentRepository;
import ready2.javaversion.infrastructure.TournamentNM.repository.TournamentStageRepository;
import ready2.javaversion.domain.utils.exceptions.BusinessException;


@AllArgsConstructor
@NoArgsConstructor
@Service
@Log4j2
public class TournamentBusinessRules {
    @Autowired
    private TournamentRepository tournamentRepository;
    @Autowired
    private TournamentStageRepository tournamentStageRepository;
    public void checkIfTournamentExistsById(String tournamentId) throws BusinessException {
        if(!tournamentRepository.existsById(tournamentId)){
            throw new BusinessException("Tournament not exists.");
        }
    }

    public void checkIfTournamentNotExistsById(String tournamentId) throws BusinessException{
        if(tournamentRepository.existsById(tournamentId)){
            throw new BusinessException("Tournament you trying to create is exists.");
        }
    }

    public void checkIfTournamentStageCreatable(String tournamentId) throws BusinessException{
        if(tournamentStageRepository.getTournamentStageCount(tournamentId)>=2){
            throw new BusinessException("tournamentStage limit is full. Contact your manager to grow the limit.");
        }
    }


}
