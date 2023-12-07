package javaPolymorphism;

public class AdminUser extends User {
    private final String userGroup = "admin";
    @Override
    public void validateAccessRights() {
        System.out.println("I am an Admin User. I have access rights to do anything :)");
    }

    @Override
    public AccountInfo getProfileInformation(Profile profile){
//        userGroup = "default";
//        Profile = new UserProfile();
        return new AccountInfo();
    }
}
