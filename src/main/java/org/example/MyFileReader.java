package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MyFileReader {
    public List<String> reader() throws IOException {
        File file = new File("src/main/resources/Doc.txt");
        ArrayList<String> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = br.readLine();
        while (line != null) {
            list.add(line);
            line = br.readLine();
        }
        br.close();
        return read(list);
    }


    public List<String> read(List<String> list1) {
        int prev = 0, next = 1, result = 0;
        ArrayList<String> list = new ArrayList<>();
        while (result < list1.size()) {
            for (int i = 0; i < list1.size(); i++) {
                result = prev + next;
                System.out.println(list);
                if (result < list1.size()) {
                    list.add(list1.get(result - 1));
                } else break;
                prev = next;
                next = result;
            }
        }
        return list;
    }
}

