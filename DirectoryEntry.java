package dk.cphbusiness.tog.datastructures.opgave;

public interface DirectoryEntry
{
	String getName();
	boolean isDirectory();
	boolean isFile();

	default File asFile() {
		if(isFile()) {
			return (File) this;
		}
		return null;
	}
	default Directory asDirectory() {
		if(isDirectory()) {
			return (Directory) this;
		}
		return null;
	}

}
