class CSuper4{
    public CSuper4(){
        
    }
    public String toString(){
        return "This is Csuper CLass";
    }
}

public class _000000_230416_Chapter8_javalang {
    static public void main(String[] args){
        // java.lang 패키지는 import를 쓸 필요 없다
        // object, system, math, string, stringbuffer thread exception throwable 등...

        // object class는 모든 클래스의 조상 클래스
        // 모든 클래스는 자동으로 object class를 상속 받는다.
        CSuper4 cs1 = new CSuper4();
        cs1.toString();
        System.out.println(cs1);
        System.out.println(String.valueOf(123));    // 자체적인 메소드

        StringBuffer sb1 = new StringBuffer();
        // String의 경우, 리터널의 값을 삭제 (메모리 삭제)하지 않고 유지를 하는데
        // 이럴경우 문자열을 많이 사용했을 때 컴퓨팅자원을 많이 소비 한다.
        // 이럴때 stringbuffer를 사용해야 한다.

        String szStr4 = new String("Hewllo");

        szStr4 = szStr4 + " World";

        System.out.println(szStr4);

        szStr4 = szStr4.concat("!!");

        System.out.println(szStr4);

        //sb1 = sb1 + "Hello";  // + 연산자 오버로딩이 안된다.

        System.out.println(sb1);

        sb1 = sb1.append(" World!");

        System.out.println(sb1);

        //system.nanotime();    ==> 시간 값을 얻을 수 있다.

        String szStr5 = new String("Jovo");
        szStr5.replace('o','a');
        System.out.println(szStr5);
        
    }
}
