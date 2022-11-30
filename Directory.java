package dk.cphbusiness.tog.datastructures.opgave;

import java.util.ArrayList;

public interface Directory extends DirectoryEntry
{
	void addChild(DirectoryEntry entry);
	Iterable<DirectoryEntry> getChildren();

	public void printAllEntries(DirectoryEntry entry, int indents);
}
