package org.example.FileSystemWithComposite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{
    String directoryName;
    List<FileSystem> objectList;

    public Directory(String directoryName) {
        this.directoryName = directoryName;
        this.objectList = new ArrayList<>();
    }

    public void add(FileSystem fileSystem){
        objectList.add(fileSystem);
    }
    @Override
    public void ls() {
        System.out.println("Directory Name : " + this.directoryName);
        for(FileSystem fileSystemObject : objectList){
            fileSystemObject.ls();
        }
    }
}
