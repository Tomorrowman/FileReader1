package com.ivik.filereader1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Eigenaar on 11-2-2016.
 */
public class FileMaker {

    public static void main(String[] args) throws IOException {
        String fileName = "SortNumbers.txt";
        char[] in = new char[100];
        FileWriter fileWriter;
        FileReader fileReader;
        fileWriter = new FileWriter("SortNumbers.txt");
        fileWriter.write("70.920 -38.797 14.354 99.323 90.374 7.581\n-37.507 -3.263 40.079 27.999 65.213 -55.552");
        fileWriter.flush();
        fileWriter.close();

        fileReader = new FileReader(fileName);
        fileReader.read(in);

        for (char c : in) {
            System.out.print(c);
        }
        fileReader.close();
    }
}