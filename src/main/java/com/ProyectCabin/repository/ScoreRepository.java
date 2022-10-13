
package com.ProyectCabin.repository;


import com.ProyectCabin.model.ScoreModel;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ScoreRepository{
    @Autowired
    private ScoreCrudRepository scoreCrudRepository;
    
     public List<ScoreModel> getAllScoreModels(){
        return (List<ScoreModel>)scoreCrudRepository.findAll();
    }

    public Optional<ScoreModel> getScoreById(Integer idScore){
        return  scoreCrudRepository.findById(idScore);
   }
   
    public ScoreModel save(ScoreModel scoreModel){
        return scoreCrudRepository.save(scoreModel);
    }
    
    public ScoreModel update(ScoreModel scoreModel){
        return scoreCrudRepository.save(scoreModel);
    }
    
    public boolean delete(Integer idScore){
        scoreCrudRepository.deleteById(idScore);
        return true;
    }
}
