package javaPolymorphism;

import java.io.File;

public class ZipArchiver implements Archiver {
    @Override
    public void archiveFiles(File... files){
        System.out.println("Method of Zip Archiver is called. Implementation of Archiver interface");
    }

    public void archiveFiles(int maxArchive, File... files){
        System.out.println("This is the Zip archiver archiveFiles() methods.");
    }
}
