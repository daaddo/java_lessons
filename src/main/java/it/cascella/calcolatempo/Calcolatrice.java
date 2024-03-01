package it.cascella.calcolatempo;

public class Calcolatrice {
    private int ore;
    private int minuti;

    public Calcolatrice(int ore, int minuti) {
        this.ore = ore;
        this.minuti = minuti;
    }

    public Calcolatrice moltiplicaTempo(int moltiplicatore){
        int salvaminuti = this.minuti;
        int salvaore= this.ore;
        salvaminuti =salvaminuti*moltiplicatore;
        salvaore = salvaore*moltiplicatore;
        while(salvaminuti>=60){
            salvaminuti= salvaminuti-60;
            salvaore++;
        }
        this.minuti=salvaminuti;
        this.ore = salvaore;
        return this;
    }
    public int ritornoGiorni(){
        int days = 0;
        int salvaore = this.ore;
        while(salvaore >=24){
            salvaore = salvaore-24;
            days++;
        }
        return days;
    }

    //write a method tha return the number of days

    public int getOre() {
        return ore;
    }

    public void setOre(int ore) {
        this.ore = ore;
    }

    public int getMinuti() {
        return minuti;
    }

    public void setMinuti(int minuti) {
        this.minuti = minuti;
    }

    
    public static void main(String[] args) {
        Calcolatrice calcolatrice = new Calcolatrice(4, 48);
        calcolatrice.moltiplicaTempo(500);
        System.out.println(" ore: "+calcolatrice.ore+" e: "+calcolatrice.minuti+" minuti");
        System.out.println("giorni :"+calcolatrice.ritornoGiorni());

    }

}
