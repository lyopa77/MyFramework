import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class files {
    public static void main(String[] args) throws IOException {
        File fi3 = new File("C:\\Users\\lyopa\\IdeaProjects\\MyFramework\\src\\test\\list3.csv");
      // System.out.println( fi2.getAbsolutePath());
        //System.out.println(fi2.exists());
       // System.out.println(fi2.getName());
       // System.out.println(fi2.canWrite());
        if (fi3.exists()){
            System.out.println("created "+ fi3.exists());
            System.out.println(fi3.getAbsolutePath());
            System.out.println(fi3.getName());
        }
        FileWriter fw2 = new FileWriter(fi3);

        fw2.write("bread, sauce");
        fw2.close();
        Scanner sc = new Scanner(fi3);
        while (sc.hasNext()){
            System.out.println(sc.next());
        }
        fi3.delete();
        if (fi3.delete()){
        System.out.println(fi3.exists());}



    }
}
