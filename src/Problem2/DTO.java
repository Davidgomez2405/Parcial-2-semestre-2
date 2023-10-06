package Problem2;
import java.io.Serializable;
import java.io.*;
import java.util.ArrayList;
public class DTO implements Serializable {
public Integer id;
private String localName;
private String category;
private int schedule;

    public DTO(Integer id, String localName, String category, int schedule) {
        this.id = id;
        this.localName = localName;
        this.category = category;
        this.schedule = schedule;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLocalName() {
        return localName;
    }

    public void setLocalName(String localName) {
        this.localName = localName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getSchedule() {
        return schedule;
    }

    public void setSchedule(int schedule) {
        this.schedule = schedule;
    }
    public static void writeToFile(ArrayList<DTO> local, String fileName) {
        try {
            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(local);
            out.close();
            fileOut.close();
            System.out.println("The array list has been saved in: " + fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<DTO> readFromFile(String fileName) {
        ArrayList<DTO> local = new ArrayList<>();
        try {
            FileInputStream fileIn = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            local = (ArrayList<DTO>) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("The arraylist has been loaded from: " + fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return local;
    }
}

