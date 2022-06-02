package myapp.core;

import java.util.*;
import java.io.*;
import java.nio.file.Paths;
import java.nio.file.*;

// java IOMain <src><dest>
//java IOMain myfile myfile.dup

public class IOMain {
  
  public static void main(String[] args) {

    // Path p = Paths.get("/opt/tmp/hosts");
    // // File object
    // File f = p.toFile();

    // // File object
    // File hostFile = new File("/opt/tmp/hosts");
    // File etcDir = new File("/etc");
    // System.out.printf("%s directory? %b\n", hostFile.getAbsolutePath(), hostFile.isDirectory());
    // System.out.printf("%s directory? %b\n", etcDir.getAbsolutePath(), etcDir.isDirectory());

    String srcFile = args[0];
    String dstFile = args[1];

    // 1K byte buffer
    byte[] buff = new byte[1024];
    int size = 0;
    try {
      InputStream is = new FileInputStream(srcFile);
      System.out.printf("%s file opened\n", srcFile);

      OutputStream os = new FileOutputStream(dstFile);
      System.out.printf("%s file opened\n", srcFile);

      while (size >=0) {
      size = is.read(buff);
      System.out.printf("read: %d\n", size);
      if (size >0) {
        os.write(buff, 0, size);
      }
    }

      is.close();

      os.flush();
      os.close();

    } catch (FileNotFoundException ex) {
      System.err.printf("Error: %s\n",ex.getMessage());
    } catch (IOException ex) {
      System.err.printf("Error: %s\n",ex.getMessage());
    }
  }
}
