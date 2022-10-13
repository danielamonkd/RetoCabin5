
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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="cabin")
public class CabinModel implements Serializable{   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="name")
    private String name;
    @Column(name="brand")
    private String brand;
    @Column(name="rooms")
    private Integer rooms;
    @Column(name="description")
    private String description;
    
    @ManyToOne
    @JoinColumn(name="idCategory")
    @JsonIgnoreProperties("cabins")
    public CategoryModel category;


    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "cabin")
    @JsonIgnoreProperties({"cabin","messages","reservations","client"})
    private List<MessagesModel> messages;

    @OneToMany(cascade={CascadeType.PERSIST},mappedBy="cabin")
    @JsonIgnoreProperties({"cabin","messages"})
    private List<ReservationsModel> reservations;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getRooms() {
        return rooms;
    }

    public void setRooms(Integer rooms) {
        this.rooms = rooms;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CategoryModel getCategory() {
        return category;
    }

    public void setCategory(CategoryModel category) {
        this.category = category;
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
