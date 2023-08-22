package dev.belavirag.exercises.collections;

public class SuperHero implements Comparable<SuperHero> {
    private int id;
    private int age;
    private String name;

    public SuperHero(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SuperHero{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(SuperHero other) {
        if (this.age > other.getAge()) {
            return 1;
        } else if (this.age < other.getAge()) {
            return -1;
        }

        return 0;
    }
}
