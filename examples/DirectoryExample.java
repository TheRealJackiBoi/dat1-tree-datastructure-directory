package dk.cphbusiness.tog.datastructures.opgave.examples;

import dk.cphbusiness.tog.datastructures.opgave.Directory;
import dk.cphbusiness.tog.datastructures.opgave.DirectoryImpl;
import dk.cphbusiness.tog.datastructures.opgave.FileImpl;

import java.util.ArrayList;

public class DirectoryExample {

    public static void main(String[] args) {

        Directory root = new DirectoryImpl("root");


        Directory desktop = new DirectoryImpl("desktop");
        desktop.addChild(new FileImpl("Hello World", "Hello World!"));
        desktop.addChild(new FileImpl("cheatsForLegoStarWars", "asdoi1292\nuiwe21j21u\n788nweq2"));
        desktop.addChild(new DirectoryImpl("SchoolFiles"));

        Directory programs = new DirectoryImpl("programs");
        programs.addChild(new FileImpl("CS:GO", "*pew pew*"));
        programs.addChild(new FileImpl("Call of Duty: Morden Warfare 2", "*pew pew* *bang bang*"));
        programs.addChild(new FileImpl("IntelliJ", "*nerding* *computing*"));

        Directory user = new DirectoryImpl("user");
        user.addChild(desktop);
        user.addChild(programs);
        Directory bin = new DirectoryImpl("bin");

        root.addChild(user);
        root.addChild(bin);


        root.printAllEntries(root, 0);
    }

}
