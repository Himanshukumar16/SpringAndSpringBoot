package Mini_Project;

import jakarta.persistence.*;

@Entity
public class Contacts {

    @Column(name = "name of person")
    private String name;
    @Id
    @Column(name = "number of person")
    private String num;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
}
