package it.cascella.enums.singletonEnum;

public enum DatabaseManager {
    INSTANCE;
    private DatabaseManager() {
        System.out.println("DatabaseManager created");
    }
    public void connect() {
        System.out.println("Connected to the database");
    }
}

