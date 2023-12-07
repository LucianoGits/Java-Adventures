package javaPolymorphism;

public class ContentManager extends User{
    @Override
    public void validateAccessRights() {
        System.out.println("I am a content Manager and I don't have the access rights to withdraw money.");
    }

    @Override
    public ProfileInformationData getProfileInformation(Profile profile) {
        return new AccountInfo();
    }
}
