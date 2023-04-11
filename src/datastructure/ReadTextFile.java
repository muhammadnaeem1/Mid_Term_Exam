package datastructure;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {

             public static void main(String[] args) {

                 FileReader fr = null;
                 try {
                     fr = new FileReader("C:\\Users\\naeem\\IdeaProjects\\Mid_Term_Exam\\src\\data\\self-driving-car");

                 } catch (FileNotFoundException e) {
                     throw new RuntimeException(e);
                 }
                 BufferedReader br = new BufferedReader(fr);
                 String line = null;
                 try {
                     while ((line = br.readLine()) != null) {
                         System.out.println(line);
                     }
                 } catch (IOException e) {
                     throw new RuntimeException(e);
                 }
             }


}
