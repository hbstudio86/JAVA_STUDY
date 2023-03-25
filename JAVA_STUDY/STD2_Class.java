class Csuper{   // public class는 오직 하나만 존재 해야 한다.
    public int n1;  // public 접근자는 어디에든 사용할 수 있다.
    int n2;         // 생략(default) 접근자는 동일한 프로젝트, 다른 프로젝트에서 사용이 가능하나 다른 프로젝트의 자식 클래스는 사용 불가
    protected int n3;    // proteced 접근자는 동일한 프로젝트에서만 사용이 가능하다.
    private int n4;     // private 접근자는 오직 자식 클래스만이 접근이 가능하다.

    public Csuper(){    // 생성자입니다.
        n1 = 0;
        n2 = 0;
        n3 = 0;
        n4 = 0; // 모두 초기화 시킵니다.
    }

    public void showField(){    // 메소드
        System.out.println("n1의 값은? " + n1 + "\nn2의 값은? " + n2 + "\nn3의 값은? " + n3 + "\nn4의 값은? " + this.n4);
    }
}

public class STD2_Class {
    static public void main(String args []){    // string[] args나 string args[]나 차이는 없다.
        System.out.println("Class 생성");
        Csuper cs1 = new Csuper();
        cs1.showField();
    }
}
