package pl.PCsimulator.drive;

import pl.PCsimulator.file.File;

public interface Drive {

    void addFile(File file);
    void listFiles();

    File findFile(String name);

}
