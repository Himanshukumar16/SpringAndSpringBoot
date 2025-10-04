package Hibernate_Revisit;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

//@Embeddable
@Entity
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
