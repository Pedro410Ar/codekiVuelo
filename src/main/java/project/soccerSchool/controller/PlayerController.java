package project.soccerSchool.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.soccerSchool.models.Player;
import project.soccerSchool.services.PlayerService;

import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayerController {

    @Autowired
    PlayerService playerService;

    @PostMapping("/create")
    public void createPlayer (@RequestBody Player player) {
        playerService.createPlayer(player);
    }

    @GetMapping("")
    public List<Player> getAllPlayers() {
        return playerService.readPlayer();
    }

    @GetMapping("/{id}")
    public Player readPlayerById (@PathVariable Integer id){
        return playerService.readPlayerById(id);
    }

    @PutMapping("/update")
    public Player updatePlayer (@RequestBody Player player) {
        return playerService.updatePlayer(player);
    }

    @DeleteMapping("/delete{id}")
    public void deletePlayer (@PathVariable Integer id) {
        playerService.deletePlayer(id);
    }

}
