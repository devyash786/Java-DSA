package DesignPattern.FactoryPattern;

public class FactoryPattern {
    public static void main(String[] args) {
    Employee employee = EmployeeFactory.getEmployee("Android Developer");
     
    System.out.println(employee.getSalary());

    Employee employee1 = EmployeeFactory.getEmployee("web Developer");
     
    System.out.println(employee1.getSalary());
    }
    
    

}
