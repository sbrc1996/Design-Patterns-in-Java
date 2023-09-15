package org.example.FileSystemWithoutComposite;

import java.util.ArrayList;
import java.util.List;

public class Directory {
    String directoryName;
    List<Object> objectList;

    public Directory(String directoryName) {
        this.directoryName = directoryName;
        this.objectList = new ArrayList<>();
    }

    public void add(Object object){
        objectList.add(object);
    }

    public void ls(){
        System.out.println("Directory Name : " + this.directoryName);
        for(Object obj : objectList){
            if(obj instanceof File)
                ((File) obj).ls();
            else if(obj instanceof Directory)
                ((Directory) obj).ls();
        }
    }
}
