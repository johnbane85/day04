package myapp.core;
import java.io.*;
import java.util.*;

public class Test {
  public static void main(String[] args){
    List<List<String>> records = new ArrayList<>();
    try (BufferedReader br = new BufferedReader(new FileReader("exams.csv"))) {
    String line;

    while ((line = br.readLine()) != null) {
        String[] values = line.split(",");
        records.add(Arrays.asList(values));
    }

    System.out.println(records.get(0));
  } catch (FileNotFoundException ex){
    System.out.println(ex.getMessage());
  } catch (IOException ex) {
    System.out.println(ex.getMessage());
}




}
}

