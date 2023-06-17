package it.cascella;

public class Frazione {
    private int numeratore;
    private int denominatore;

    public int getNumeratore() {
        return numeratore;
    }

    public void setNumeratore(int numeratore) {
        this.numeratore = numeratore;
    }

    public int getDenominatore() {
        return denominatore;
    }

    public void setDenominatore(int denominatore) {
        this.denominatore = denominatore;
    }

    public Frazione(int numeratore, int denominatore) {
        this.numeratore = numeratore;
        this.denominatore = denominatore;
    }
    public void sum(Frazione that){
        int a = this.numeratore;
        int b = this.denominatore;
        int c = that.numeratore;
        int d = that.denominatore;

        this.denominatore= that.denominatore*this.denominatore;
        this.numeratore= (this.denominatore/b*a)+(this.denominatore/d*c);

    }
    public void simplify(){
        if(this.numeratore == this.denominatore){
            this.numeratore = 1;
            this.denominatore = 1;
        } else if (this.numeratore < this.denominatore){
            for (int i=2; i<(this.numeratore/2);i++){
                while((this.numeratore%i)==0 && (this.denominatore%i)==0){
                    this.numeratore= this.numeratore/i;
                    this.denominatore= this.denominatore/i;
                }
            }
        }
        else if (this.numeratore > this.denominatore){
            for (int i=2; i<(this.denominatore/2);i++){
                while((this.numeratore%i)==0 && (this.denominatore%i)==0){
                    this.numeratore= this.numeratore/i;
                    this.denominatore= this.denominatore/i;
                }
            }
        }
    }
    public void moltiplicazione(Frazione that){
        this.numeratore=this.numeratore*that.numeratore;
        this.denominatore=this.denominatore*that.denominatore;
        this.simplify();
    }
    public void divisione(Frazione that){
        this.numeratore=this.numeratore*that.denominatore;
        this.denominatore=this.denominatore*that.numeratore;
        this.simplify();
    }
    @Override
    public String toString() {
        return ""+this.numeratore+"/"+this.denominatore;

    }

}
