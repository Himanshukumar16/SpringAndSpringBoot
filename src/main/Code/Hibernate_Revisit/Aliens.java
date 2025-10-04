package Hibernate_Revisit;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Aliens {

    @Id
    private int aid;
    private String aname;
    private String atech;

    @Override
    public String toString() {
        return "Aliens{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", atech='" + atech + '\'' +
                '}';
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getAtech() {
        return atech;
    }

    public void setAtech(String atech) {
        this.atech = atech;
    }
}
