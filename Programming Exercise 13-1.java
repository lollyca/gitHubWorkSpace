import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.IOException;
public class FileStatistics {
    public static void main(String[] args) {
        Path file = Paths.get("/root/sandbox/FileStatistics.java");
        // Write your code here
      try
      {
         int count = file.getNameCount();
         System.out.println("File name is " + file.getFileName());
         System.out.println("Folder name is " + file.getName(count - 2));
         BasicFileAttributes attr = Files.readAttributes(file, BasicFileAttributes.class);
         FileTime tempo = attr.creationTime();
         System.out.println("File's size is " + attr.size());
         System.out.println("File's creation time is " + tempo);       
      }
      catch(IOException e)
      {
          System.out.println("IO Exception");
      }
    }
}
