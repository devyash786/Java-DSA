package DesignPattern.AbstractFactoryDesignPattern;

public class Pattern {
    public static void main(String[] args) {
        Employee e1 = EmployeeFactory.getEmployee(new AndroidDevFactory());
        Employee e2 = EmployeeFactory.getEmployee(new WebDevFactory());
        Employee e3 = EmployeeFactory.getEmployee(new ManagerFactory());
        System.out.println(e1.getSalary());
        System.out.println(e2.getSalary());
        System.out.println(e3.getSalary());
    }
}
