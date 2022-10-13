
package com.ProyectCabin.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="score")
public class ScoreModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idScore;
    @Column(name ="messagesText")
    private String messagesText;
    @Column(name="starts")
    private Integer starts;   
    
    @OneToOne 
    @JsonIgnoreProperties("Score")
    private ReservationsModel reservation;

    

    public Integer getIdScore() {
        return idScore;
    }

    public void setIdScore(Integer idScore) {
        this.idScore = idScore;
    }

    public String getMessagesText() {
        return messagesText;
    }

    public void setMessagesText(String messagesText) {
        this.messagesText = messagesText;
    }

   
    public Integer getStarts() {
        return starts;
    }

    public void setStarts(Integer starts) {
        this.starts = starts;
    }

    public ReservationsModel getReservation() {
        return reservation;
    }

    public void setReservation(ReservationsModel reservation) {
        this.reservation = reservation;
    }

    
    
    
}
