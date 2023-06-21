// java 종합적인 연습
class SuperA{   // 시초
    private int n1;
    public SuperA(){this.n1 = 0;}   //필드 초기화
    public SuperA(int n){this.n1 = n;}
    public void showdata(){
        System.out.println(this.n1);
    }
    protected int getValue(){
        return n1;
    }
}

// 자손 1
class SuperB extends SuperA {
    private int m1;
    public SuperB(){
        super();
        this.m1 = 0;
    }
    public SuperB(int num){
        super(num);
        this.m1 = num * 2;
    }
    public void showdata(){
        System.out.println("m1 :" + m1 + " n1: " + getValue());
    }
}

public class _000000_TOTAL_Practice {
    public static void main(String[] args){
        SuperA sa1 = new SuperA(10);
        sa1.showdata();
        
        //평범한 방법
        SuperB sb1 = new SuperB(10);
        sb1.showdata();
        //자식의 덕을 보는 경우
        SuperA sa2 = new SuperB();
        sa2.showdata();

    }
}
