import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Iterator;


public class FileReader {

    /*
    See if you can find something wrong with this implementation and suggest a better way
     */

    public static void main(String[] args) throws IOException {
        System.out.print(read1());
    }

    private static String read1() throws IOException{
        String content = Files.readString(Paths.get("src/main/resources/sample1.txt"));
        char[] contentChars = content.toCharArray();
        ArrayList<Character> reversed = new ArrayList<>();
        for (int x = contentChars.length-1; x > -1; x--){
           reversed.add(contentChars[x]);
        }
        return reversed.toString();
    }

}
