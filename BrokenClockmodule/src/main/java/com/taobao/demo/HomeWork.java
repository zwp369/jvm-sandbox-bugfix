package com.taobao.demo;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import static java.lang.Thread.sleep;


public class HomeWork {

    public static void main(String[] args) throws InterruptedException{
        //HomeWork writefile = new HomeWork();
        for (int i =0;i<1000;i++){
            //writefile.writeFile();
            writeFile();

            System.out.println("写入第"+i+"次");
            getstoptime();

        }

    }



    public static void getstoptime() throws InterruptedException {
       /* try {
            sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
       sleep(10000);

    }

    public static void writeFile(){
            try{
                // 准备文件lol2.txt其中的内容是空的
                File f = new File("/tmp/lol2.txt");
                // 准备长度是2的字节数组，用88,89初始化，其对应的字符分别是X,Y
                byte data[] = { 88, 89 };

                // 创建基于文件的输出流
                FileOutputStream fos = new FileOutputStream(f);
                // 把数据写入到输出流
                fos.write(data);
                // 关闭输出流
                fos.close();}
            catch (IOException e){
                e.printStackTrace();
            }

        }
}
