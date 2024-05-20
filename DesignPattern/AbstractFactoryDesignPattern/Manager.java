package DesignPattern.AbstractFactoryDesignPattern;

public class Manager implements Employee {

    @Override
    public int getSalary() {
       System.out.println("Manager");
       return 150000;
    }
    
}
