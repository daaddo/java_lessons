package it.cascella.serializable;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Unit implements Serializable {
    private String name;
    private static final long serialVersionUID = 1L;
    private String serializationTime;

    public Unit(String name) {
        this.name = name;
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        serializationTime = dateFormat.format(new Date());
        out.writeObject(serializationTime);
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        serializationTime = (String) in.readObject();
    }

    public String getSerializationTime() {
        return serializationTime;
    }

    public void setSerializationTime(String serializationTime) {
        this.serializationTime = serializationTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " [name=" + name + ", serializationTime=" + serializationTime + "]";
    }


}
