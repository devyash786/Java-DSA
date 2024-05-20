package DesignPattern.PrototypePattern;

public class Pattern {
    public static void main(String[] args) throws InterruptedException {
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp("192.168.0.0");
        networkConnection.getImportantData();
        System.out.println(networkConnection);
        try {
            NetworkConnection networkConnection2 = (NetworkConnection)networkConnection.clone();
            System.out.println(networkConnection2);
        } catch (CloneNotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}
