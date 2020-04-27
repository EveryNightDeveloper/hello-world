package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyFileReader {
    public List<String> reader() throws IOException {
//        FileReader fileReader = new FileReader("Doc.txt");
        File file = new File("src/main/resources/Doc.txt");
//        Scanner scanner = new Scanner(fileReader);
        ArrayList<String> list = new ArrayList<>();
//        int counter = 0;
//        while (scanner.hasNextLine()){
//            scanner.next();
//            counter++;
//        }
//        return read(counter, scanner);

        BufferedReader br = new BufferedReader(new FileReader(file));
        int prev = 0;
        int next = 1;
        int result = 0;
        int count = 0;
        String line = br.readLine();
        while (line != null) {

            list.add(line);

            line = br.readLine();
            count++;
        }
        br.close();
        return read(count, list);
    }


        public List<String> read (int n, List<String> list1) {
            int prev = 0, next = 1, result = 0;
            ArrayList<String> list = new ArrayList<>();
            while (result < list1.size()) {
                for (int i = 0; i < list1.size(); i++) {
                    result = prev + next;
                    System.out.println(list);
                    if(result < list1.size()) {
                        list.add(list1.get(result - 1));
                    }
                    else break;
                    prev = next;
                    next = result;
                }
            }
            return list;
        }
    }

