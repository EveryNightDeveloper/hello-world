package org.example;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class MyFileWriter {
    public void writeFile(List<String> list) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(new File("src/main/resources/output.txt")));

        //Here cycle to reverse and write list to "output.txt"
        for (int i = 0; i <list.size() ; i++) {
            writer.write(new StringBuffer(list.get(i) + "\n").reverse().toString());
        }
        writer.flush();
    }
}
