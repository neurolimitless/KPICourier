package kpicourier.com.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "CLIENTS")
public class Client {

    @javax.persistence.Id
    @GeneratedValue
    @Column(name = "ID")
        private int Id;
    @Column(name = "USERNAME")
    private String username;
    @Column(name = "PASS")
    private String pass;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "mobile")
    private String mobile;
    @Column(name = "valid")
    private int valid;

    public Client(){}

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



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (Id != client.Id) return false;
        if (valid != client.valid) return false;
        if (username != null ? !username.equals(client.username) : client.username != null) return false;
        if (pass != null ? !pass.equals(client.pass) : client.pass != null) return false;
        if (email != null ? !email.equals(client.email) : client.email != null) return false;
        return mobile != null ? mobile.equals(client.mobile) : client.mobile == null;

    }

    @Override
    public int hashCode() {
        int result = Id;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (pass != null ? pass.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (mobile != null ? mobile.hashCode() : 0);
        result = 31 * result + valid;
        return result;
    }
}
