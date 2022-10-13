
package com.ProyectCabin.service;


import com.ProyectCabin.model.ReservationsModel;
import com.ProyectCabin.model.custom.CountClient;
import com.ProyectCabin.model.custom.StatusAmount;
import com.ProyectCabin.repository.ReservationsRepository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationsService {
    @Autowired
    private ReservationsRepository reservationsRepository;
    
    public List<ReservationsModel> getAllReservationsModels(){
        return reservationsRepository.getAllReservationsModels();
    }
    
    public Optional<ReservationsModel> getReservationsById(Integer idReservations) {
        return reservationsRepository.getReservationsById(idReservations);
    }
    
    public ReservationsModel saveReservationsModel(ReservationsModel reservationsModel){
        return reservationsRepository.save(reservationsModel);
    }
    
    public boolean deleteReservationsModel(Integer idReservations) {
       return reservationsRepository.delete(idReservations);
}
    public ReservationsModel update(ReservationsModel reservationsModel){
        return reservationsRepository.update(reservationsModel);
    }

    public List<CountClient> getTopClients(){return reservationsRepository.getTopClients();}

    public List<ReservationsModel> getReservationsPeriod(String dateA, String dateB){
        SimpleDateFormat parser=new SimpleDateFormat("yyyy-MM-dd");
        Date a=new Date();
        Date b=new Date();
        try{
           a= parser.parse(dateA);
           b= parser.parse(dateB);
        }catch (ParseException e){
            e.printStackTrace();
        }
        if(a.before(b)){
            return reservationsRepository.getReservationPeriod(a,b);
        }else{
            return new ArrayList<>();
        }
    }

    public StatusAmount getReservationsStatusReport(){
        List<ReservationsModel>completed=reservationsRepository.getReservationsByStatus("completed");
        List<ReservationsModel>cancelled=reservationsRepository.getReservationsByStatus("cancelled");
        return new StatusAmount(completed.size(),cancelled.size());
    }
}
