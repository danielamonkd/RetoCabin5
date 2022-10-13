
package com.ProyectCabin.repository;


import com.ProyectCabin.model.ClientModel;
import com.ProyectCabin.model.ReservationsModel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.ProyectCabin.model.custom.CountClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository
public class ReservationsRepository {
    @Autowired
    private ReservationsCrudRepository reservationsCrudRepository;
    
     public List<ReservationsModel> getAllReservationsModels(){
        return (List<ReservationsModel>)reservationsCrudRepository.findAll();
    }

    public Optional<ReservationsModel> getReservationsById(Integer idReservations){
        return  reservationsCrudRepository.findById(idReservations);
   }
   
    public ReservationsModel save(ReservationsModel reservationsModel){
        return reservationsCrudRepository.save(reservationsModel);
    }
    
    public ReservationsModel update(ReservationsModel reservationsModel){
        return reservationsCrudRepository.save(reservationsModel);
    }
    
    public boolean delete(Integer idReservations){
        reservationsCrudRepository.deleteById(idReservations);
        return true;
    }

    public List<CountClient> getTopClients(){
         List<CountClient>res=new ArrayList<>();
         List<Object[]>report=reservationsCrudRepository.countTotalReservationsByClient();
         for(int i=0;i< report.size();i++){
             res.add(new CountClient((Long)report.get(i)[1],(ClientModel)report.get(i)[0]));
         }
         return res;
    }

    public List<ReservationsModel> getReservationPeriod(Date a, Date b){
         return reservationsCrudRepository.findAllByStartDateAfterAndStartDateBefore(a,b);
    }

    public List<ReservationsModel> getReservationsByStatus(String status){
         return reservationsCrudRepository.findAllByStatus(status);
    }
}
