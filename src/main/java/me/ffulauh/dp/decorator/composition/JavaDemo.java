package me.ffulauh.dp.decorator.composition;


import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ffulauh on 2017/2/9.
 */
public class JavaDemo {
    public static void main(String[] args) {
        System.out.println("请输入一句话：");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(System.in);
        String msg = "wocao";
        try {
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(bufferedInputStream));
            msg = bufferedReader.readLine();
        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("输入的是：" + msg);
    }
}
