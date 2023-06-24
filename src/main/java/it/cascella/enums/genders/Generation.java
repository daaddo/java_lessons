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
