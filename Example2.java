class Circle2{
    double r;

    Circle2(){}

    public Circle2(double a){
        r = a;
    }

    public double getArea(){
        return r * r * 3.14;
    }
}

class Circle2sub extends Circle2{

    static int nValue = 0;
    double r2 = 1.0;
    {r2=2.0;}

    public Circle2sub(double a){
        r2 = a;
        nValue += 1;
    }

    public Circle2sub(){
        r2 = 3.0;
        nValue += 1;
    }

}

class Csuper{
    
    public int f1 = 0;
    int f2 = 0;
    protected int f3 = 0;
    private int f4 = 0;   

    public void showValue(){
        System.out.println(f1);
    }

}

class Csub extends Csuper{
    public int f1 = 10;

    public void showValue(){    // 상속 받은 메소드
        System.out.println(f1);    
        System.out.println(super.f1);
    }

    public void newf1(){
        super.f1 = 50;
    }
}

public class Example2{
    static public void main (String[] args){
    
        System.out.println("Hello Wolrd!");

        Circle2sub k = new Circle2sub(0);
        Circle2sub k2 = new Circle2sub();

        System.out.println(k.r2);
        System.out.println(k.r);
        System.out.println(k2.r2);

        Csub cs1 = new Csub();
        cs1.showValue();
        cs1.newf1();
        cs1.showValue();
        

    }
}