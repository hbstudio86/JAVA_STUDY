abstract class Shape{
    abstract public double getArea();
}
// 몸체 구현없이 형식만 존재하는 메소드
// 객체 생성이 불가능하고 오직 파생만 할 수 있다.
// 기능적으로 구현하기 어려운 메소드가 존재 : 하나의 함수에 여러가지 의미가 부여될 때, 즉 다의성 함수일 때

// 인터페이스는 모든 메소드가 추상 메소드로 구성되어 있다.
// 즉 일반 추상 클래스는 상속이 가능한 일반 메소드가 있고, 인터페이스는 100% 추상 메소드만 가짐
// 데이터 필드는 클래스 상수만 가능(public static final)

interface Movable{
    void moveUp();
    void moveDown();
    // default void moveLeft(){
    //     x--;
    // }
}
// default 메소드는 부모 인터페이스에서 선언하면 자식 인터페이스에 추가 수정없이 사용이 가능하다?

class MovablePoint implements Movable{
    private int x,y;
    public MovablePoint(int x,int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "Point at("+x+","+y+")";
    }
    public void moveUp(){y++;}
    public void moveDown(){y--;}

}

class Employee{
    int nSalary;
    String szDept = null;
    public void doJob(){
        System.out.println("Do something");
    }
}

class Sales extends Employee{
    public Sales() {szDept="Sales Dept";}
    public void doJob(){
        System.out.println("Do Sales");
    }
}

class Development extends Employee{
    public Development() {szDept="Sales Dept";}
    public void doJob(){
        System.out.println("Do development");
    }
}

public class STD5_ADT {
    static public void main(String[] args){
        Movable m1 = new MovablePoint(5,5);
        System.out.println(m1);
        //m1.moveLeft();
        //System.out.println(m1);

        Employee emp1, emp2;
        emp1 = new Sales();
        emp2 = new Development();

        emp1.doJob();
        emp2.doJob();
    }
}
