package DesignPattern;

import java.io.Serializable;

import javax.management.RuntimeErrorException;

public class Samosa implements Serializable,Cloneable {
    //lazy way of singleton class
    private static Samosa samosa;
    private Samosa(){
        if(samosa!=null){
           throw new RuntimeErrorException(null, "You are trying to break Singleton Pattern");
        }
    }
    public static Samosa getSamosa(){
        synchronized(Samosa.class){
            if(samosa==null){
                samosa = new Samosa();
            }
        }
       
        return samosa;
    }
    public Object readResolve(){
        return samosa;
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        return samosa;
    }
    
}
