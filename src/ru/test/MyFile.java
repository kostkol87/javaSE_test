package ru.test;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MyFile {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    protected void simpleCopy() throws IOException {

        System.out.println("Enter source path: ");
        FileInputStream source = new FileInputStream(reader.readLine());

        System.out.println("Enter destination path: ");
        FileOutputStream destination = new FileOutputStream(reader.readLine());

        while (source.available() > 0) {
            destination.write(source.read());
        }
        source.close();
        destination.close();
    }

    protected void bufferedCopy() throws IOException {

        System.out.println("Select the size of the buffer: ");
        int buff = Integer.parseInt(reader.readLine());
        if (buff == 0) buff = 4096;

        System.out.println("Enter source path: ");
        BufferedInputStream source = new BufferedInputStream(new FileInputStream(reader.readLine()));

        System.out.println("Enter destination path: ");
        BufferedOutputStream destination = new BufferedOutputStream(new FileOutputStream(reader.readLine()), buff);

        while (source.available() > 0) {
            destination.write(source.read());
        }
        source.close();
        destination.close();

    }

    protected void java7copy() throws IOException {
        System.out.println("Enter source path: ");
        Path source = Paths.get(reader.readLine());

        System.out.println("Enter destination path: ");
        Path detination = Paths.get(reader.readLine());

        Files.copy(source, detination);

    }

    protected void bufferedArrayCopy() throws IOException {

        System.out.println("Enter source path: ");
        BufferedInputStream source = new BufferedInputStream(new FileInputStream(reader.readLine()));

        System.out.println("Enter destination path: ");
        BufferedOutputStream destination = new BufferedOutputStream(new FileOutputStream(reader.readLine()));

        byte[] buff = new byte[20000];

        while (source.available() > 0) {
            source.read(buff);
            destination.write(buff);
        }
        source.close();
        destination.close();

    }
}