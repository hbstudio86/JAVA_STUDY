import java.util.Scanner;   // 어디에 있는 패키지를 사용하는지에 대한 명확한 표시를 한다. #include <stdio.h>와 같다.

class Grade{
    int math;
    int science;

    public void output_grade(){
        System.out.print((math+science));
    }
}

class Circle{
    private int r;

    public Circle(int n){   // 사용자 생성자 사용이 가능하다
        r = n;
    }

    public Circle(){
        r = 0;
    }

    public void print_cirr(){
        System.out.println("Circle r :" + r);
    }

    public double getArea(){
        return r * r * 3.14;
    }
}

public class Example1{
    static public void main(String args[]){
        Grade james = new Grade();
        Grade tomas = new Grade();
        james.math = 30;
        tomas.math = 35;
        james.science = 40;
        tomas.science = 60;
        System.out.println("Math+Science Point");
        james.output_grade();
        tomas.output_grade();

        int arrInts[] = {1,2,3,4,5,6};
        System.out.println(" ");
        for(int i:arrInts){
            System.out.println(i);
        }

        int[] arrInts2 = new int[5];
        int[][] arrInts3 = {{1,2},{3,4,5}};

        System.out.printf("array Length : %d\n",arrInts2.length);
        System.out.printf("array Length : %d\n",arrInts3.length);

        System.out.println("arrInts2 Length : " + arrInts2.length);
        System.out.println("arrInts3 Length : " + arrInts3.length);

        for(int i = 0; i < arrInts3.length;i++){
            for(int j = 0;j < arrInts3[i].length;j++){
                System.out.println(arrInts3[i][j]);
            }
        }

        Scanner sc = new Scanner(System.in);

        Circle c1 = new Circle(30);
        Circle c2 = new Circle();
        c1.print_cirr();
        c2.print_cirr();
        
        int a[] = {1,2,3,4};
        int[][] b = {{1,2},{1,2,3,4}};
        for(int i = 0; i < b.length;i++){
            for(int j = 0; j < b[i].length; j++){
                System.out.println(b[i][j]);
            }
        }

        String s1 = "JAVA";
        String s2 = new String("JAVA");
        String s3 = null;   // 참조형 변수는 null을 지정할 수 있는 점을 이용한다.

        System.out.println("result="+" "+s1);
        System.out.println("A"+0);  // 문자열 + 숫자는 문자열로 변환하여 출력
        System.out.println('A'+1);  // 문자 + 숫자는 문자에 숫자를 더한다음 해당하는 문자가 출력함

        s3 = sc.next(); // nextXXX로 메서드가 종류별로 있음
        System.out.println(s3);
        s3 = sc.nextLine();
        System.out.println(s3);

        if(sc.hasNextInt()){
            System.out.println("True!!!");
        }
    }
}
