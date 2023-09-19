package it.cascella.EsDepInj;

public class Samurai extends Person{
    private SamuraiItemSelector samuraiSelector;

    public Samurai(String name,SamuraiItemSelector samuraiSelector) {
        super(name,samuraiSelector);
    }
}
