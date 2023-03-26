class Csuper3{  // 부모 클래스
    public int n1 = 0;

    public void fshow(){
        System.out.println("n1=" + this.n1);
    }
}

public class STD3_ClassEx {
    static public void main(String[] args){
        System.out.println("Class 상속");
        Csuper3 cs3 = new Csuper3();
        cs3.fshow();
    }
}
