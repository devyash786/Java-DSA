package DesignPattern.AbstractFactoryDesignPattern;

public class AndroidDevFactory extends AbstarctEmployeeFactory{

    @Override
    Employee createEmployee() {
       return new AndroidDeveloper();
    }
    
}
