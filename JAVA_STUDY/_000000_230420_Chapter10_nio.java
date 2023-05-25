import java.nio.file.*;;

class TempClass<T>{
    T datas;

    TempClass(T inData){

    }
}

public class _000000_230420_Chapter10_nio {
    static public void main(String[] args){
        FileSystem fs = FileSystems.getDefault();
        int[] iArrays = {1,2,3,4,5};
        for(int n : iArrays){
            System.out.println(n);
        }
        
    }
}
