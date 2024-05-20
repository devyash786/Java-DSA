package DesignPattern.AbstractFactoryDesignPattern;

public class ManagerFactory extends AbstarctEmployeeFactory {

    @Override
    Employee createEmployee() {
      return new Manager();
    }

    
}
