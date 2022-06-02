package myapp.core;

import java.io.FileNotFoundException;
import java.io.*;

public class ReaderMain {

  // java ReaderMain text_file
  public static void main(String[] args) throws FileNotFoundException, IOException {
    String srcFile = args[0];

    Reader reader = new FileReader(srcFile);
    BufferedReader br = new BufferedReader(reader);

    String line="";
    int lineNum = 0;

    while(line != null) {
      line = br.readLine();
      lineNum++;
      //System.out.printf("%d: %s\n", lineNum, line.toUpperCase());
      System.out.printf("%d: %s\n", lineNum, line);
    }
  }
}