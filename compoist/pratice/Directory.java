package compoist.pratice;

import java.util.ArrayList;
import java.util.List;

public class Directory extends AbstractFile {
    private List<AbstractFile> files = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    public void addEntry(AbstractFile entry) {
        entry.setDepth(getDepth() + 1);
        files.add(entry);
    }

    public int getSize() {
        int totalSize = 0;
        for (AbstractFile entry : files) {
            totalSize += entry.getSize();
        }
        return totalSize;
    }

    public void print() {
        for (int i = 0; i < getDepth(); i++) {
            System.out.println("\t");
        }
        System.out.println("[Directory] " + getName() + ", Size: " + getSize());
        for (AbstractFile entry : files) {
            entry.print();
        }
    }
}
