package it.cascella.enums.genders;

public enum Generation {
    BABY_BOOOMER(1946,1966),
    BOOMER(1967,1980),
    X(1981,1997),
    Z(1998,2013),
    MILLENNIALS(2013,2025);

    private int start;
    private int end;

    Generation(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public static Generation of(int yearOfBirth) {

        if(yearOfBirth >= Generation.BABY_BOOOMER.getStart() && yearOfBirth <= Generation.BABY_BOOOMER.getEnd()) {
            return Generation.BABY_BOOOMER;
        } else if(yearOfBirth >= Generation.BOOMER.getStart() && yearOfBirth <= Generation.BOOMER.getEnd()) {
            return Generation.BOOMER;
        } else if(yearOfBirth >= Generation.X.getStart() && yearOfBirth <= Generation.X.getEnd()) {
            return Generation.X;
        } else if(yearOfBirth >= Generation.Z.getStart() && yearOfBirth <= Generation.Z.getEnd()) {
            return Generation.Z;
        } else if(yearOfBirth >= Generation.MILLENNIALS.getStart() && yearOfBirth <= Generation.MILLENNIALS.getEnd()) {
            return Generation.MILLENNIALS;
        } else {
            return null;
        }
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public void setStart(int start) {
        this.start = start;
    }
}
