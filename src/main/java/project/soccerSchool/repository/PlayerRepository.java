package project.soccerSchool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.soccerSchool.models.Player;

@Repository
public interface PlayerRepository extends JpaRepository <Player, Integer> {


}
