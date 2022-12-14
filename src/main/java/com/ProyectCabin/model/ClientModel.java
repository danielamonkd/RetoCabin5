
package com.ProyectCabin.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="client")
public class ClientModel implements Serializable{   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idClient;
    @Column(name="email")
    private String email;
    @Column(name="password")
    private String password;
    @Column(name="name")
    private String name;

    
    @Column(name="age")
    private Integer age;
    
    @OneToMany(cascade = {CascadeType.REMOVE}, mappedBy = "client")
    @JsonIgnoreProperties({"client","messages"})
    private List<MessagesModel> messages;


    @OneToMany(cascade = {CascadeType.REMOVE}, mappedBy = "client")
    @JsonIgnoreProperties("client")
    private List<ReservationsModel> reservations;

   
    public Integer getIdClient() {
        return idClient;
    }

    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<MessagesModel> getMessages() {
        return messages;
    }

    public void setMessages(List<MessagesModel> messages) {
        this.messages = messages;
    }

    public List<ReservationsModel> getReservations() {
        return reservations;
    }

    public void setReservations(List<ReservationsModel> reservations) {
        this.reservations = reservations;
    }

    


    
}
