package Hibernate_Revisit;

import jakarta.persistence.*;
import java.util.List;

//@Embeddable
@Entity
@Cacheable(value = true)
public class Laptop {
    @Id
    private int lid;
    private String lname;
    private String lmodel;
    private int lram;

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getLmodel() {
        return lmodel;
    }

    public void setLmodel(String lmodel) {
        this.lmodel = lmodel;
    }

    public int getLram() {
        return lram;
    }

    public void setLram(int lram) {
        this.lram = lram;
    }

//    public List<Aliens> getAlien() {
//        return alien;
//    }
//
//    public void setAlien(List<Aliens> alien) {
//        this.alien = alien;
//    }

    @Override
    public String toString() {
        return "Laptop{" +
                "lid=" + lid +
                ", lname='" + lname + '\'' +
                ", lmodel='" + lmodel + '\'' +
                ", lram=" + lram +
                '}';
    }
}
