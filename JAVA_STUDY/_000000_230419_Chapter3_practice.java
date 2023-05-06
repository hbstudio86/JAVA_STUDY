class Myclass{
    private int nMyFeild = 0;
    static private int nMyValue;
    static public int nMyNumber = 0;
    {nMyValue = 0;}
    public void setMyFeild(int nNewField){
        this.nMyFeild = nNewField;
    }
    public int getMyField(){
        return nMyFeild;
    }
    static public void setMyValue(int nNewValue){
        nMyValue = nNewValue;
    }
    static public int getMyValue(){
        return nMyValue;
    }
}


public class _000000_230419_Chapter3_practice {
    static public void main(String args[]){
        // 접근제한자 종류
        /*
         * default : 기본 접근 제한자로 생략가능. 같은 패키지에 있는 다른 클래스에서 사용이 가능하지만 
         * 다른 패키지에서는 사용이 불가능 하다.
         * public : 어디에서든 사용이 가능하지만, 하나의 소스파일에는 하나의 public 클래스가 존재해야한다.
         * 또한 public 클래스의 이름과 소스파일 이름은 동일해야 한다.
         * private : 오직 클래스 속 에서 특정 클래스를 정의 할때만 사용한다.
         * protected : 내부 패키지에서 사용이 기본적으로 가능하고 다른 패키지에서도 가능하지만 상속은 안됨
         */
        _000000_230419_Chapter3_practice2 test1 = new _000000_230419_Chapter3_practice2();
        System.out.println(test1.getVoltage());

        _000000_230419_Chapter3_practice2 test2 = new _000000_230419_Chapter3_practice2(3);
        System.out.println(test2.getVoltage());

        // static 필드와 static 메서드
        Myclass mc1,mc2;
        mc1 = new Myclass();
        mc2 = new Myclass();

        mc1.nMyNumber = 10;
        System.out.println("mc1의 mynumber값: " + mc1.nMyNumber);
        System.out.println("mc2의 mynumber값: " + mc2.nMyNumber);
        mc2.nMyNumber = 20;
        System.out.println("mc2의 mynumber값: " + mc2.nMyNumber);
        System.out.println("mc1의 mynumber값: " + mc1.nMyNumber);

        // 또한 static 필드는 특정 객체가 소유하고 있지 않기 때문에 클래스이름으로 접근이 가능하다... 우와!

        Myclass.nMyNumber = 30;
        System.out.println("mc2의 mynumber값: " + mc2.nMyNumber);
        System.out.println("mc1의 mynumber값: " + mc1.nMyNumber);
    }

}
