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
        setName(name);
        setSurname(surname);
        setAge(age);
        setRank(rank);
    }

    public String getName() {
        return name;
    }

    public final void setName(String name) {
        if(name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
    }

    public final String getSurname() {

        return surname;
    }

    public final void setSurname(String surname) {
        if(surname == null || surname.isEmpty()) {
            throw new IllegalArgumentException("surname cannot be null or empty");
        }
        this.surname = surname;
    }

    public final int getAge() {
        return age;
    }

    public final void setAge(int age) {
        if(age<18) {
            throw new IllegalArgumentException("age must be higher than 18");
        }
        this.age = age;
    }

    public final int getRank() {
        return rank;
    }

    public final void setRank(int rank) {
        if(rank<=0) {
            throw new IllegalArgumentException("rank cannot be negative");
        }
        this.rank = rank;
    }
    public void degrade(){
        if(rank==1) {
            throw new IllegalArgumentException("rank cannot be negative");
        }
        rank--;
    }
}
