package storage;

import java.io.*;
import java.util.ArrayList;

public class ReadWriteFile<E> {
    public void WriteFileData(ArrayList<E> arrayList, String name){
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File(name)));
            objectOutputStream.writeObject(arrayList);
            objectOutputStream.close();
        }catch (IOException e) {
            System.err.printf(e.getMessage());
        }
    }
    public ArrayList<E> readFileData(String name) {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(name));
            return (ArrayList<E>) objectInputStream.readObject();
        }catch (IOException | ClassNotFoundException e) {
            System.out.println();
        }
        return null;
    }
}
