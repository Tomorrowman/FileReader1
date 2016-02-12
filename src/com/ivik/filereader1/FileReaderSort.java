package com.ivik.filereader1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by Eigenaar on 12-2-2016.
 */
public class FileReaderSort {

    public static void main(String[] args) throws IOException {
        String fileName = "SortNumbers.txt";
        String line;
        FileReader fileReader;
        BufferedReader bufferedReader;


        fileReader = new FileReader(fileName);
        bufferedReader = new BufferedReader(fileReader);
        line = bufferedReader.readLine();

        while (line != null) {

            String[] stringArray = line.split(" ");
            double[] doubleArray = new double[stringArray.length];

            for (int i = 0; i < stringArray.length; i++) {
                doubleArray[i] = Double.parseDouble(stringArray[i]);
            }
            Arrays.sort(doubleArray);
            for (double number : doubleArray) {
                System.out.print(number + " ");
            }
            System.out.println("");

            line = bufferedReader.readLine();



        }
        bufferedReader.close();
    }
}
