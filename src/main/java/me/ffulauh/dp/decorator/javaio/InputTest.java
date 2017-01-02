package me.ffulauh.dp.decorator.javaio;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by ffulauh on 2016/12/25.
 */
public class InputTest {
    public static void main(String[] args) {
        int c;
        try{
            InputStream in=new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("/Users/ffulauh/IdeaProjects/designpatterns/src/main/java/me/ffulauh/dp/decorator/javaio/test.txt")));
            while ((c=in.read())>=0){
                System.out.print((char)c);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
