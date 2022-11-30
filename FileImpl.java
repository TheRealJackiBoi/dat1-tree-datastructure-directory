package dk.cphbusiness.tog.datastructures.opgave;

public class FileImpl implements File{

    private final String name;

    private final String content;

    public FileImpl(String name, String content) {
        this.name = name;
        this.content = content;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isDirectory() {
        return false;
    }

    @Override
    public boolean isFile() {
        return true;
    }


    @Override
    public String getContent() {
        return content;
    }
}
