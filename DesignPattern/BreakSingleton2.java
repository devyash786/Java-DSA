package DesignPattern;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class BreakSingleton2 {
    public static void main(String[] args) throws IOException,ClassNotFoundException, CloneNotSupportedException {
        Samosa samosa1=Samosa.getSamosa();
        System.out.println(samosa1.hashCode());
        ObjectOutputStream osw = new ObjectOutputStream(new FileOutputStream("abc.ob"));
        osw.writeObject(samosa1);

        ObjectInputStream ois= new ObjectInputStream(new FileInputStream("abc.ob"));
        Samosa samosa2=(Samosa)ois.readObject();
        System.out.println(samosa2.hashCode());

        Samosa samosa3= (Samosa) samosa1.clone();
        System.out.println(samosa3.hashCode());

    }
}
