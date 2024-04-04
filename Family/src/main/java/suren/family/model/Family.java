package suren.family.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Family
{
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int age;
    private String relation;

    public Family(String name, int age, String relation) {
        this.name = name;
        this.age = age;
        this.relation = relation;
    }

    public Family() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Name set");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println("Name set");
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
        System.out.println("Name set");
    }
}
