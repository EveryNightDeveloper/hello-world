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
        long limit = list.size();
        for (int i = list.size() - 1; ; i = i - 1) {
            if (limit-- == 0) break;
            writer.write(list.get(i) + "\n");
        }
        writer.flush();
    }
}
