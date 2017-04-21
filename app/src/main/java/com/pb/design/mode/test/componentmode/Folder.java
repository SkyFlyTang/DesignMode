package com.pb.design.mode.test.componentmode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by skytang on 2017/4/20.
 */

public class Folder extends File {
    private List<File> files;

    public Folder(String name) {
        super(name);
        files = new ArrayList<>();
    }

    public void add(File file) {
        files.add(file);
    }

    public void remove(File file) {
        files.remove(file);

    }

    @Override
    public void display() {
        for (File file : files) {
            file.display();

        }

    }
}
