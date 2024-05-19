package DesignPattern.FactoryPattern;

public class EmployeeFactory {

    public static Employee getEmployee(String empType){
        if(empType.trim().equalsIgnoreCase("Android Developer")){
            return new AndroidDeveloper();
        }
        else if(empType.trim().equalsIgnoreCase("Web developer")){
            return new WebDeveloper();
        }
        else{
            return null;
        }
    }
    
}
