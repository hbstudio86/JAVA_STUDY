import java.io.*;

public class _000000_230419_Chapter9_Stream {
    // 입력 스트림은 데이터 생산자(소스)와 연결 
    // 추력 스트림은 데이터 소비자(목적지)와 연결

    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("C:\\windows");
        File files[] = file.listFiles();
        int i = 0;
        while(i < files.length){
            System.out.print(files[i].getPath());
            System.out.println("\t"+files[i].length());
            i++;
        }
        RandomAccessFile raf = new RandomAccessFile("C:\\Users\\Alexander\\JAVA\\files.txt", "rw");
        System.console();
    }
}
