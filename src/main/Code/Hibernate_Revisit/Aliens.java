package Hibernate_Revisit;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Aliens {

    @Id
    private int aid;
    private String aname;
    private String atech;
    @ManyToMany
    private List<Laptop> laptop;

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

    public List<Laptop> getLaptop() {
        return laptop;
    }

    public void setLaptop(List<Laptop> laptop) {
        this.laptop = laptop;
    }

    @Override
    public String toString() {
        return "Aliens{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", atech='" + atech + '\'' +
//                ", laptop=" + laptop +
                '}';
    }
}
