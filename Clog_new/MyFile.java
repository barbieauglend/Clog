import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyFile {

    FileReader fr;
    FileWriter fw;
    BufferedReader br;
    BufferedWriter bw;

    public MyFile(){
        try {
            fw = new FileWriter("blog.txt");
            fr = new FileReader("blog.txt");
            bw = new BufferedWriter(fw);
            br = new BufferedReader(fr);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MyFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MyFile.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void save(Text text) {
        try {
            bw.write(text.toSave());
            bw.flush();
        } catch (IOException ex) {
            Logger.getLogger(MyFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String load() {
        try {
            return br.readLine();
        } catch (IOException ex) {
            Logger.getLogger(MyFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "fehler";
    }
}

