package kpicourier.com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "couriers")
public class Courier {
    @javax.persistence.Id
    @Column(name = "ID")
    private int Id;
    @Column(name = "USERNAME")
    private String username;
    @Column(name = "PASS")
    private String pass;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "MOBILE")
    private String mobile;
    @Column(name = "VALID")
    private int valid;
    @Column(name = "totalPoints")
    private int totalPoints;
    @Column(name = "average_points")
    private int averagePoints;
    @Column(name = "card")
    private String card;

    public Courier() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getValid() {
        return valid;
    }

    public void setValid(int valid) {
        this.valid = valid;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    public int getAveragePoints() {
        return averagePoints;
    }

    public void setAveragePoints(int averagePoints) {
        this.averagePoints = averagePoints;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Courier courier = (Courier) o;

        if (Id != courier.Id) return false;
        if (valid != courier.valid) return false;
        if (totalPoints != courier.totalPoints) return false;
        if (averagePoints != courier.averagePoints) return false;
        if (username != null ? !username.equals(courier.username) : courier.username != null) return false;
        if (pass != null ? !pass.equals(courier.pass) : courier.pass != null) return false;
        if (email != null ? !email.equals(courier.email) : courier.email != null) return false;
        if (mobile != null ? !mobile.equals(courier.mobile) : courier.mobile != null) return false;
        return card != null ? card.equals(courier.card) : courier.card == null;

    }

    @Override
    public int hashCode() {
        int result = Id;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (pass != null ? pass.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (mobile != null ? mobile.hashCode() : 0);
        result = 31 * result + valid;
        result = 31 * result + totalPoints;
        result = 31 * result + averagePoints;
        result = 31 * result + (card != null ? card.hashCode() : 0);
        return result;
    }
}
