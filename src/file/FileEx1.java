package file;

import java.io.File;
import java.io.IOException;

public class FileEx1 {
    public static void main(String[] args) throws IOException {
        File f = new File("c:\\filetest","first.txt");
        File dir = new File("c:\\filetest");
        File f2 = new File(dir, "second.txt");
        File f3 = new File(dir, "thrid.txt");
//        f3.createNewFile();
        f3.delete();


        String fileName = f.getName();
        int pos = fileName.lastIndexOf(".");

        System.out.println("경로를 제외한 파일 이름 : " + fileName);
        System.out.println("확장자를 제외한 파일 이름 : " + fileName.substring(0, pos));
        System.out.println("확장자 : " + fileName.substring(pos + 1));
        
        System.out.println("파일의 절대경로 : " + f.getAbsolutePath());
        System.out.println("파일의 정규경로 : " + f.getCanonicalPath());

        System.out.println("user.dir : " + System.getProperty("user.dir"));
        System.out.println("sun.boot.class.path : " + System.getProperty("sun.boot.class.path"));

    }
}
