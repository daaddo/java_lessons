package it.cascella.esercizio1;

import java.util.ArrayList;
import java.util.List;

public class Army {

    private List<Soldier> soldiers;
    private Soldier commander;
    private String name;

    public Army() {
    }
    public List<Soldier> getSoldiers() {
        return soldiers;
    }

    public Army(String name) {
        this.name = name;
    }
    public void setSoldiers(List<Soldier> soldiers) {
        this.soldiers = soldiers;
    }

    public Soldier getCommander() {
        return commander;
    }

    public void setCommander(Soldier commander) {
        this.commander = commander;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Army(List<Soldier> soldiers, Soldier commander, String name) {
        this.soldiers = soldiers;
        this.commander = commander;
        this.name = name;
    }

    /**
     * This method add a soldier to the army
     * Check that the input soldier is a valid soldier
     * A soldier is valid if:
     * - name and surname are not null and not empty
     * - age is > 18
     * - rank is > 1
     * @param soldier
     * The soldier to add
     */
    public void addSoldier(Soldier soldier){
        this.soldiers.add(soldier);

    }

    public Soldier findOldestSoldier(){
        Soldier oldest = null;
        for (Soldier soldato: soldiers) {
            if (oldest == null) {
                oldest = soldato;
            }
            if (soldato.getAge() > oldest.getAge()) {
                oldest = soldato;
            }
        }
        return oldest;
    }

    public List<Soldier> findAllSoldierYoungerThan(int limitAge){
        List <Soldier> soldatiMinori= new ArrayList();
        for (Soldier soldato: soldiers) {
            if(soldato.getAge()<=limitAge){
                soldatiMinori.add(soldato);
            }

        }
        return soldatiMinori;
    }

    /**
     * Promote all soldier with baseRank to newRank
     * @param baseRank
     * @param newRank
     */
    public void promote(int baseRank, int newRank){

    }

    /**
     * Find the soldiers in input in the army and degrade them subtracting 1 to their rank
     * If the new rank is 0, the soldier is removed from the army
     * @param soldiers
     */
    public void degradate(List<Soldier> soldiers){

    }
}
