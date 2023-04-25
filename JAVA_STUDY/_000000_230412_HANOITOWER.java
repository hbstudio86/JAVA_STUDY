import java.util.Scanner;

class CHNT{
    private int DiskCNT;
    public CHNT(int n){
        this.DiskCNT = n;
    }
    public void fHNT(int n,String from,String by,String to){
        if(n==1){
            System.out.println("Disk" + n +": "+from+"에서 "+to+"로 이동.");
            return;
        }
        fHNT(n-1, from, to, by);
        System.out.println("Disk" + n +": "+from+"에서 "+to+"로 이동.");
        fHNT(n-1, by,from,to);
    }
}

public class _000000_230412_HANOITOWER {
    static public void main(String[] args){
        // 하노이 타워 만들기!!
        Scanner sc1 = new Scanner(System.in);
        int nDisk;
        CHNT nht1;
        System.out.println("Disk의 수를 입력하세요");
        
        while(true){
            if(sc1.hasNextInt()){
                nDisk = sc1.nextInt();
                nht1 = new CHNT(nDisk);
                System.out.println(nDisk+"를 입력하셨습니다.");
                nht1.fHNT(nDisk, "A","B", "C");
            }
            else {
                System.out.println("END");
                break;
            }

        }
    }
}
