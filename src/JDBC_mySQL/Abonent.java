package JDBC_mySQL;

import java.util.Objects;

public class Abonent extends Entity {

   private int phone;
   private String name;

    public Abonent(int id, int phone, String name) {
        super(id);
        this.phone = phone;
        this.name = name;
    }


    public int getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Abonent abonent = (Abonent) o;
        return phone == abonent.phone && Objects.equals(name, abonent.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phone, name);
    }

    @Override
    public String toString() {
        return "Abonent{" +
                "phone=" + phone +
                ", name='" + name + '\'' +
                '}';
    }
}
