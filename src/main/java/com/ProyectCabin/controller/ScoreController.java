
package com.ProyectCabin.controller;


import com.ProyectCabin.model.ScoreModel;
import com.ProyectCabin.service.ScoreService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Score")
@CrossOrigin(origins = "*")

public class ScoreController {
    @Autowired private ScoreService scoreService;

    @GetMapping("/all")
    public List<ScoreModel> getAllScoreModels(){
        return scoreService.getAllScoreModels();
    }

    @GetMapping("/{id}")
    public Optional<ScoreModel> getScoreById(@PathVariable("id") Integer id) {
        return scoreService.getScoreById(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public ScoreModel save (@RequestBody ScoreModel scoreModel){
        scoreService.saveScoreModel(scoreModel);
        return scoreService.saveScoreModel(scoreModel);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public ScoreModel update(@RequestBody ScoreModel scoreModel) {
        return scoreService.saveScoreModel(scoreModel);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") Integer id) {
        return scoreService.deleteScoreModel(id);
    }
}
