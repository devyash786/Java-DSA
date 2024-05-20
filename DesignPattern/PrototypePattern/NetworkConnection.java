package DesignPattern.PrototypePattern;

public class NetworkConnection implements Cloneable {
    
    public String ip;
    public String importantData;
    public void setIp(String ip) {
        this.ip = ip;
    }
    public void setImportantData(String importantData) {
        this.importantData = importantData;
    }
    public void getImportantData() throws InterruptedException{
        this.importantData = "Very omp data";
        Thread.sleep(5000);
    }
    @Override
    public String toString() {
      
        return this.ip+" : "+this.importantData;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
}
