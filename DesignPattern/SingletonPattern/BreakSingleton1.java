package DesignPattern.SingletonPattern;

import java.lang.reflect.Constructor;

public class BreakSingleton1 {
    public static void main(String[] args) throws Exception{
        Samosa s1=Samosa.getSamosa();
        System.out.println(s1.hashCode());
        Constructor<Samosa> s2 = Samosa.class.getDeclaredConstructor();
        s2.setAccessible(true);
        Samosa samosa=s2.newInstance();
        System.out.println(samosa.hashCode());

    }
   

}
