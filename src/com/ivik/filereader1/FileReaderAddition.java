package com.ivik.filereader1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Tomorrowman on 10-2-2016.
 */
public class FileReaderAddition {

    public static void main(String[] args) throws IOException {
        String fileName = "AdditionIntegers.txt";
        String line;
        FileReader fileReader;
        BufferedReader bufferedReader;


            fileReader = new FileReader(fileName);
            bufferedReader = new BufferedReader(fileReader);
            line = bufferedReader.readLine();

            while (line != null) {

                int num = Integer.parseInt(line);
                int sum = 0;
                while (num > 0) {
                    sum = sum + num % 10;
                    num = num / 10;
                }

                System.out.println(sum);

                line = bufferedReader.readLine();
            }
            bufferedReader.close();



    }
}