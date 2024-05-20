package DesignPattern.BuilderDesignPattern;

public class User {

    private final String email;
    private final String UserName;
    private final String Name;

    private User(UserBuilder userBuilder){
        this.Name=userBuilder.Name;
        this.UserName=userBuilder.UserName;
        this.email=userBuilder.email;
        
    }

    public String getEmail() {
        return email;
    }
    public String getUserName() {
        return UserName;
    }
    public String getName() {
        return Name;
    }

    @Override
    public String toString() {
       return this.Name+" : "+this.UserName+" : "+this.email;
    }

    static class UserBuilder{
        private String email;
        private String UserName;
        private String Name;
        
        private UserBuilder(){

        }
        public static UserBuilder getUserBuilder(){
           return new UserBuilder();
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }
        public UserBuilder setUserName(String userName) {
            this.UserName = userName;
            return this;
            
        }
        public UserBuilder setName(String name) {
            this.Name = name;
            return this;
        }
        public User build(){
            User user = new User(this);
            return user;
        }
    }
    
}
