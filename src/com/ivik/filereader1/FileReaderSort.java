package com.ivik.filereader1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Eigenaar on 12-2-2016.
 */
public class FileReaderSort {

    public static void main(String[] args) throws IOException {
        String fileName = "SortNumbers.txt";
        String line;
        FileReader fileReader;
        BufferedReader bufferedReader;
        int num = 0;


        fileReader = new FileReader(fileName);
        bufferedReader = new BufferedReader(fileReader);
        line = bufferedReader.readLine();

        while (line != null) {

            num = Integer.parseInt(line.trim());

            line = bufferedReader.readLine();

        }
        System.out.println(num);

        bufferedReader.close();



    }
}
