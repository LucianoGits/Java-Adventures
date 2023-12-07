package javaPolymorphism;

import java.io.File;

public class RarArchiver implements Archiver{
    @Override
    public void archiveFiles(File... files) {
        System.out.println("archiveFiles() method from Rar Archiver is called. Archiver interface Implementation");
    }
}
