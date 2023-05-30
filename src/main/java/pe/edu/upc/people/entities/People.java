package pe.edu.upc.people.entities;

import javax.persistence.*;

@Entity
@Table(name = "peoples")
public class People {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPeople;
    @Column(name = "name", length = 60, nullable = false)
    private String name;
    @Column(name = "lastname", length = 35, nullable = false)
    private String lastname;
    @Column(name = "age", nullable = false)
    private int age;
    @Column(name = "genre", length = 10, nullable = false)
    private String genre;

    public People(){

    }
    public People(int idPeople, String name, String lastname, int age, String genre) {
        this.idPeople = idPeople;
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.genre = genre;
    }

    public int getIdPeople() {
        return idPeople;
    }

    public void setIdPeople(int idPeople) {
        this.idPeople = idPeople;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
