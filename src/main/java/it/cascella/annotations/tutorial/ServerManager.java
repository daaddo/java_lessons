package it.cascella.annotations.tutorial;

@DoNotTouch
public class ServerManager {
    private static ServerManager instance = null;
     @DoNotTouch
    private ServerManager() {
    }

    public static ServerManager getInstance() {
        if (instance == null) {
            instance = new ServerManager();
        }
        return instance;
    }
    @Deprecated(since = "1.0", forRemoval = true)
    public boolean connect() {
        System.out.println("Connecting to server");
        return true;
    }
    public boolean connect(int timeout){
        System.out.println("Connecting to server with timeout "+timeout);
        return true;
    }
}
