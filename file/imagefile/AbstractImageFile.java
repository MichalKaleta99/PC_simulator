package pl.PCsimulator.file.imagefile;

import pl.PCsimulator.file.AbstractFile;
import pl.PCsimulator.file.FileType;

public abstract class AbstractImageFile extends AbstractFile {
    protected AbstractImageFile(String name, int size) {
        super(name, size);
    }

    @Override
    public FileType getType() {
        return FileType.IMAGE;
    }
}
