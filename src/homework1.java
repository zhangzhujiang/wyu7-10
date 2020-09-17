import java.io.*;
import java.io.File;
import java.nio.channels.FileChannel;

public class homework1 {

    public static void main(String[] args) throws IOException {
        File f = new File("D:/javazuoye/zuoyecopy");
        f.mkdirs();//创建文件夹
        File f1 = new File("D:/javazuoye/copy");
        f1.mkdirs();//创建文件夹
        File ff = new File(f,"HelloWorld.txt");
        ff.createNewFile();//创建文件

        String fileSrc="D:/javazuoye/zuoyecopy/HelloWorld.txt";
        String fileDes="D:/javazuoye/copy/HelloWorld.txt";
        FileInputStream fi = null;
        FileOutputStream fo = null;
        FileChannel in = null;
        FileChannel out = null;
        try {
            fi = new FileInputStream(fileSrc);
            fo = new FileOutputStream(fileDes);
            in = fi.getChannel();//得到对应的文件通道
            out = fo.getChannel();//得到对应的文件通道
            in.transferTo(0, in.size(), out);//连接两个通道，且从in通道读取，然后写入out通道
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try { fi.close();
                in.close();
                fo.close(); out.close();
            }catch (IOException e) {
                e.printStackTrace(); }
        }
        System.out.println("C:/JMPX/Copy文件夹文件复制成功");

    }

}
