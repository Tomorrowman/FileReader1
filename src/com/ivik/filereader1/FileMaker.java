package com.ivik.filereader1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Eigenaar on 11-2-2016.
 */
public class FileMaker {

    public static void main(String[] args) throws IOException {
        String fileName = "SumOfAllIntegers.txt";
        char[] in = new char[50];
        FileWriter fileWriter;
        FileReader fileReader;
        fileWriter = new FileWriter("SumOfAllIntegers.txt");
        fileWriter.write("23\n77\n25");
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