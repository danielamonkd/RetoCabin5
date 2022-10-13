
package com.ProyectCabin.repository;

import com.ProyectCabin.model.ReservationsModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;


public interface ReservationsCrudRepository extends CrudRepository<ReservationsModel, Integer>{
    
    @Query("SELECT c.client, COUNT(c.client) from ReservationsModel AS c group by c.client order by COUNT(c.client) DESC")
    public List<Object[]> countTotalReservationsByClient();

    public List<ReservationsModel> findAllByStartDateAfterAndStartDateBefore(Date dateOne,Date dateTwo);

    public List<ReservationsModel> findAllByStatus(String status);

}
