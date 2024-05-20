package DesignPattern.AbstractFactoryDesignPattern;

public class WebDeveloper implements Employee {

    @Override
    public int getSalary() {
      System.out.println("Web Developer");
      return 30000;
    }
    
}
