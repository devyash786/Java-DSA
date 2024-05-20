package DesignPattern.AbstractFactoryDesignPattern;

public class WebDevFactory extends AbstarctEmployeeFactory {

    @Override
    Employee createEmployee() {
       return new WebDeveloper();
    }
    
}
