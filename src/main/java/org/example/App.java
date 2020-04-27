package org.example;

import java.io.IOException;

public class App 
{
    public static void main( String[] args ) throws IOException {
        MyFileWriter myFileWriter =  new MyFileWriter();
        myFileWriter.writeFile(new MyFileReader().reader());
    }
}
