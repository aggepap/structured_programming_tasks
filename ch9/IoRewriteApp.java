package gr.aueb.cf.tasks.ch9;
import java.io.*;

/**
 *  The app reads a file reorganise its contents and creates a new file.
 */
public class IoRewriteApp {
    public static void main(String[] args) {
        File importText = new File("C:/temp/textin.txt");
        File exportText = new File("C:/temp/textout.txt");
        String line;

        try(BufferedReader bf = new BufferedReader(new FileReader(importText))){
            PrintWriter pw = new PrintWriter(new FileOutputStream(exportText), true);
            String city, longid, lat;
            bf.readLine();
            while((line = bf.readLine()) != null){
               String[] info =  line.split(",+");
               city = info[0];
               lat = info[1];
               longid = info[2];
               pw.printf("{ Location: %s, latitude: %s, longitude: %s },",city,lat,longid);
                pw.println();

            }
        }catch(IOException iox){
            iox.printStackTrace();
            System.out.println("File was Not Found");
        }


    }
}
