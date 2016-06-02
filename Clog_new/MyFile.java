import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

public class MyFile {

    FileReader fr;
    FileWriter fw;
    BufferedReader br;
    BufferedWriter bw;
    PrintStream out;

    public MyFile(){
        try {
            fw = new FileWriter("blog.txt");
            fr = new FileReader("blog.txt");
            bw = new BufferedWriter(fw);
            br = new BufferedReader(fr);
            out = new PrintStream(System.out);
            
        } catch (FileNotFoundException e) {
                    out.println("File Not Found");
        } catch (IOException ex) {
            out.println("IO");
        }
}
    public void save(Text text) {
        try {
            bw.write(text.toSave());
            bw.flush();
        } catch (IOException ex) {
            out.println("IO");
        }
    }
    public String load() {
        try {
            while((zeile = br.readLine()) =! null){
            out.println(text);}
        } catch (IOException ex) {
            out.println("IO");
        }
        return "fehler";
    }
}

