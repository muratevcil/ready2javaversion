package ready2.javaversion.infrastructure.Tournament.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ready2.javaversion.infrastructure.Tournament.entity.concretes.Tournament;

public interface TournamentRepository extends JpaRepository<Tournament,String> {
}
