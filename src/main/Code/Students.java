import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Students {
    @Id
    @Column(name = "Student_id")
    private int sid;
    @Column(name = "Student_Name")
    private String sname;
    @Column(name = "Student_CGPA")
    private double sgpa;
    private Subjects subject;

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
