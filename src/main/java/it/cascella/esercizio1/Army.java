package it.cascella.esercizio1;

import java.util.List;

public class Army {

    private List<Soldier> soldiers;
    private Soldier commander;
    private String name;


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

    }

    public Soldier findOldestSoldier(){
        return null;
    }

    public List<Soldier> findAllSoldierYoungerThan(int limitAge){
        return null;
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
