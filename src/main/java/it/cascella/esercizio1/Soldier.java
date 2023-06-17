package it.cascella.esercizio1;


/**
 * A soldier cant contain null or empty name and surname and age must be > 18, and rank > 1
 * If any of this condition is met, an IllegalArgumentException is thrown
 * example of how trhow an exception:
 * <pre>
 *     {@code
 *       if(name == null || name.isEmpty()){
 *              throw new IllegalArgumentException("Name cannot be null or empty");
 *       }
 *    }
 *</pre>
 */
public class Soldier {

    private String name;
    private String surname;
    private int age;
    private int rank;

    public Soldier() {
    }

    public Soldier(String name, String surname, int age, int rank) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
