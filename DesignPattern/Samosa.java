package DesignPattern;

public class Samosa {
    //lazy way of singleton class
    private static Samosa samosa;
    private Samosa(){

    }
    public static Samosa getSamosa(){
        if(samosa==null){
            samosa = new Samosa();
        }
        return samosa;
    }
    
}
