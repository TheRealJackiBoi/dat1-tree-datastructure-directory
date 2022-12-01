package dk.cphbusiness.tog.datastructures.opgave;

import java.util.ArrayList;
import java.util.Collection;

public class DirectoryImpl  implements Directory {

    private final String name;

    private final ArrayList<DirectoryEntry> children;

    public DirectoryImpl(String name) {
        this.name = name;
        children = new ArrayList<>();
    }

    @Override
    public void addChild(DirectoryEntry entry) {
        children.add(entry);
    }

    @Override
    public Iterable<DirectoryEntry> getChildren() {
        return children;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isDirectory() {
        return true;
    }

    @Override
    public boolean isFile() {
        return false;
    }

    @Override
    public void printAllEntries(DirectoryEntry entry, int indents) {

        if(entry.isFile()) {
            System.out.println("  ".repeat(indents) + "└" + "─" + entry.getName());
        }
        else {
            System.out.println("  ".repeat(indents) + "└" + "─" + entry.getName());
            if (((Collection<DirectoryEntry>)entry.asDirectory().getChildren()).size() == 0) {
                System.out.println("  ".repeat(indents + 1) + "└" + "─");
                return;
            }
            for (DirectoryEntry e : entry.asDirectory().getChildren()) {
                printAllEntries(e, indents + 1);
            }
        }
    }
}
