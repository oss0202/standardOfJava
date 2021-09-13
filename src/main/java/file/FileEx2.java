package file;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Optional;

public class FileEx2 {
    public static void main(String[] args) throws IOException {
        File f = new File("c:\\filetest");
        SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        File[] files = f.listFiles();
        Arrays.stream(files).forEach(file -> {
            System.out.println(file.getName());
            System.out.println(df.format(file.lastModified()));
        });
    }
}
