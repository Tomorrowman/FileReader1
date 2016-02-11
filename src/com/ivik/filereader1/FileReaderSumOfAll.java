package com.ivik.filereader1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Eigenaar on 11-2-2016.
 */
public class FileReaderSumOfAll {

    public static void main(String[] args) throws IOException {
        String fileName = "SumOfAllIntegers.txt";
        String line;
        FileReader fileReader;
        BufferedReader bufferedReader;
        int sum = 0;


        fileReader = new FileReader(fileName);
        bufferedReader = new BufferedReader(fileReader);
        line = bufferedReader.readLine();

        while (line != null) {

            int num = Integer.parseInt(line);
            sum = sum + num;

            line = bufferedReader.readLine();

        }
        System.out.println(sum);

        bufferedReader.close();



    }
}
