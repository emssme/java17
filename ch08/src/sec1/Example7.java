package sec1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Example7 {
    //파일처리 작업은 반드시 try~catch~ 예외처리가 필수
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream ois = null;

        try{
            fis = new FileInputStream("infile.text");
            try {
                ois = new FileOutputStream("outfile.text");
                try{
                    Class clazz = Class.forName("maria.jdbc.driver");
                }catch (Exception e3){
                    System.out.println(e3.getMessage());
                }
            } catch (FileNotFoundException e2){
                System.out.println("해당 파일 없음");
            }
        } catch(FileNotFoundException e){
            System.out.println("해당 파일이 존재하지 않음");
            System.out.println(e.getMessage());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
