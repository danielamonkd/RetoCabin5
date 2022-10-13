
package com.ProyectCabin.controller;


import com.ProyectCabin.model.ReservationsModel;
import com.ProyectCabin.model.custom.CountClient;
import com.ProyectCabin.model.custom.StatusAmount;
import com.ProyectCabin.service.ReservationsService;
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
@RequestMapping("/api/Reservation")
@CrossOrigin(origins = "*")
public class ReservationsController {
    @Autowired private ReservationsService reservationsService;

    @GetMapping("/all")
    public List<ReservationsModel> getAllReservationsModels(){
        return reservationsService.getAllReservationsModels();
    }

    @GetMapping("/{id}")
    public Optional<ReservationsModel> getReservationsById(@PathVariable("id") Integer id) {
        return reservationsService.getReservationsById(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public ReservationsModel save (@RequestBody ReservationsModel reservationsModel){
        reservationsService.saveReservationsModel(reservationsModel);
        return reservationsService.saveReservationsModel(reservationsModel);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public ReservationsModel update(@RequestBody ReservationsModel reservationsModel) {
        return reservationsService.update(reservationsModel);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") Integer id) {
        return reservationsService.deleteReservationsModel(id);
    }

    @GetMapping("/report-clients")
    public List<CountClient> getReservationsReportClient(){return reservationsService.getTopClients();}

    @GetMapping("/report-dates/{dateOne}/{dateTwo}")
    public List<ReservationsModel> getReservationsReportDates(@PathVariable("dateOne") String dateOne,@PathVariable("dateTwo") String dateTwo){
        return reservationsService.getReservationsPeriod(dateOne,dateTwo);
    }

    @GetMapping("/report-dates/amount/{dateOne}/{dateTwo}")
    public Integer getReservationsDateAmount(@PathVariable("dateOne") String dateOne,@PathVariable("dateTwo") String dateTwo){
        return reservationsService.getReservationsPeriod(dateOne,dateTwo).size();
    }

    @GetMapping("/report-status")
    public StatusAmount getReservationsStatusReport(){
        return reservationsService.getReservationsStatusReport();
    }


}
