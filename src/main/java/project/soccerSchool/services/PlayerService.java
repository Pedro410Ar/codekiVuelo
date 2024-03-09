package project.soccerSchool.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.soccerSchool.models.Player;
import project.soccerSchool.repository.PlayerRepository;

import java.util.List;

@Service
public class PlayerService {

    @Autowired
    PlayerRepository playerRepository;

    public void createPlayer(Player player) {
        playerRepository.save(player);
    }

    public List<Player> readPlayer() {
        return playerRepository.findAll();
    }

    public Player readPlayerById (Integer id) {
        return playerRepository.findById(id).orElse(null);
    }

    public Player updatePlayer (Player player) {
        playerRepository.save(player);
        return playerRepository.findById(player.getId()).orElse(null);
    }

    public void deletePlayer (Integer id) {
        playerRepository.deleteById(id);
    }



}
