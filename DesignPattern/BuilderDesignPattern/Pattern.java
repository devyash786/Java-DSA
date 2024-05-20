package DesignPattern.BuilderDesignPattern;

public class Pattern {
    public static void main(String[] args) {
        User user1 = User.UserBuilder.getUserBuilder()
        .setEmail("email123")
        .setName("Devops").setUserName("sew1").build();

        System.out.println(user1.toString());

        User user2 = User.UserBuilder.getUserBuilder()
        .setEmail("email121323")
        .setUserName("sew1231").build();

        System.out.println(user2.toString());

    }
    
}
