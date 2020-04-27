package org.example;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class MyFileWriter {
    public boolean writeFile(List<String> list) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(new File("src/main/resources/output.txt")));
        for (int i = 1; i <= list.size(); i++) {
            writer.write(list.get(list.size() - i) + "\n");
        }
        writer.flush();
        return true;
    }
}
