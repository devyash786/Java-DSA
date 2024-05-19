package DesignPattern;
public class Jalebi {
    //eager way of singleton class
    private static Jalebi jalebi=new Jalebi();

    private Jalebi(){

    }
    public static Jalebi getJalebi(){
        return jalebi;
    }
}