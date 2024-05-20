package DesignPattern.AbstractFactoryDesignPattern;

 public class EmployeeFactory {
    static Employee getEmployee(AbstarctEmployeeFactory abstarctEmployeeFactory){
        return abstarctEmployeeFactory.createEmployee();
    }
}
