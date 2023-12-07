package javaPolymorphism;

public class Main {
    //polymorphism means many forms of behavior
    public static void main(String[] args){
        User contentManager = new ContentManager();
        User admin = new AdminUser();

        contentManager.validateAccessRights();
        admin.validateAccessRights();

        contentManager.getProfileInformation(new UserProfile());

        System.out.println("========================================================");
        Archiver zipArchiver = new ZipArchiver();
        Archiver rarArchiver = new RarArchiver();

        zipArchiver.archiveFiles();
        rarArchiver.archiveFiles();

    }
}
