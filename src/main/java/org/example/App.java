package org.example;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        MyFileReader myFileReader = new MyFileReader();
        myFileReader.reader();
        MyFileWriter myFileWriter =  new MyFileWriter();
        myFileWriter.writeFile(myFileReader.reader());
        System.out.println( "Hello World!" );
    }
}
