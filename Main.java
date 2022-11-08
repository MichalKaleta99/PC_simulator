package pl.PCsimulator;

import pl.PCsimulator.drive.Drive;
import pl.PCsimulator.drive.HDDDrive;
import pl.PCsimulator.file.File;
import pl.PCsimulator.file.imagefile.GIFImageFile;
import pl.PCsimulator.file.imagefile.JPGImageFile;
import pl.PCsimulator.file.musicfile.MP3MusicFile;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GIFImageFile gifImageFile = new GIFImageFile("nazwa1.gif", 100);
        JPGImageFile jpgImageFile = new JPGImageFile("nazwa1.jpg", 200, 5);
        MP3MusicFile mp3MusicFile = new MP3MusicFile("peja.mp3", 300, "SLU", "Głucha noc", 100);

        Drive drive = new HDDDrive();
        drive.addFile(gifImageFile);
        drive.addFile(jpgImageFile);
        drive.addFile(mp3MusicFile);

        File file = drive.findFile("nazwa1.gif");
        //System.out.println(file.getSize());


        ArrayList<Object> objects = new ArrayList<>();

        objects.add("huj");
        objects.add("test");
        objects.add("testnowy");
        System.out.println(objects);
        System.out.println();

    }



    }
