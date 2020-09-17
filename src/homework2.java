import java.io.FileWriter;
import java.io.IOException;
public class homework2 {
    public static void main(String[] args) {
        try {
            FileWriter fw=new FileWriter("hello.txt");

            //写出时文件如不存在时程序会创建新文件，如文件已存在则会清空原文件内容重新写入。
            fw.write("你好\r\n");
            fw.write("hhhhhhh");

            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}

