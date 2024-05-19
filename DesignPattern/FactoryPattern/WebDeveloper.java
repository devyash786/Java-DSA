package DesignPattern.FactoryPattern;

public class WebDeveloper implements Employee {

    public int getSalary(){
        System.out.println("Getting web developer salary");
        return 50000;
    }
    
}
