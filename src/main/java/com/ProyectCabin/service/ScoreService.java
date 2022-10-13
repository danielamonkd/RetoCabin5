
package com.ProyectCabin.service;


import com.ProyectCabin.model.ScoreModel;
import com.ProyectCabin.repository.ScoreRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScoreService {
    @Autowired
    
    private ScoreRepository scoreRepository;
    
    public List<ScoreModel> getAllScoreModels(){
        return scoreRepository.getAllScoreModels();
    }
    
    public Optional<ScoreModel> getScoreById(Integer idScore) {
        return scoreRepository.getScoreById(idScore);
    }
    
    public ScoreModel saveScoreModel(ScoreModel scoreModel){
        return scoreRepository.save(scoreModel);
    }
    
    public boolean deleteScoreModel(Integer idScore) {
       return scoreRepository.delete(idScore);
}
    public ScoreModel update(ScoreModel scoreModel){
        return scoreRepository.update(scoreModel);
    }
}
