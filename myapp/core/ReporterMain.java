package myapp.core;

import java.io.*;
import java.util.*;

public class ReporterMain {
  
  public static void main(String[] args) throws IOException {

    String dataFile = args[0];

    ExamReporter reporter = new ExamReporter();

    Reader r = new FileReader(dataFile);
    BufferedReader br = new BufferedReader(r);

    // Remove the first line
    String data = br.readLine();

    while (null != data) {
      data = br.readLine();
      reporter.read(data);
    }

  }
}
