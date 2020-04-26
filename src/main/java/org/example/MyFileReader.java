package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyFileReader {
    public List<String> reader() throws IOException {
        Path path = Paths.get("src/main/resources/Doc.txt");
        List<String> list;
        try (Stream<String> lineStream = Files.newBufferedReader(path).lines()) {
            list = lineStream.collect(Collectors.toList());
        }
        System.out.println(list);
        return read(list);

    }


    public List<String> read(List<String> list1) {
        ArrayList<String> list = new ArrayList<>();
        Stream.iterate(new int[]{1, 1}, t -> new int[]{t[1], t[0]+ t[1]})
                .skip(1)
                .limit(10)
                .map(t -> t[0])
                .filter(x -> x < list1.size())
                .forEach(x -> list.add(list1.get(x-1)));
        return list;
    }
}

