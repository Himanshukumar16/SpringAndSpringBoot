import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Students {
    @Id
    private int sid;
    private String sname;
    private double sgpa;

//    public Students(int sid,String sname , double sgpa) {
//        this.sid = sid;
//        this.sname = sname;
//        this.sgpa = sgpa;
//    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public double getSgpa() {
        return sgpa;
    }

    public void setSgpa(double sgpa) {
        this.sgpa = sgpa;
    }

    @Override
    public String toString() {
        return "Students{" + "sid=" + sid + ", sname='" + sname + '\'' + ", sgpa=" + sgpa + '}';
    }
}
