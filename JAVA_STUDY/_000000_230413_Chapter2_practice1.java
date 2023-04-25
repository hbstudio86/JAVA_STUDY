import java.util.Scanner;

public class _000000_230413_Chapter2_practice1 {
    static public void main(String[] args){
        // 1. 배열
        // 1차원 배열
        int arr1[]; // 고전적인 형태
        int[] arr2; // java 스타일
        //int arr3[10]; // 오류다. java에서는 c/c++과 같이 그 크기를 지정할 수 없다... 왜?
        //int arr4[0] = 1;  // 오류다. 생성 이후에 초기화가 이루어져야 한다. 그래? => 이러면 index에 할당하는 꼴이 된다. 

        // 2차원 배열
        int arr3[][];   // 고전적인 형태
        int[][] arr4;   // java 스타일
        int[] arr5[];   // 가능은 하나 좋지 않은 표현이다. ... 이런것 까지 되다니...

        // 배열의 초기화
        int[] arr6 = {1,2,3,4}; // 선언과 동시에 초기화를 시켜주는 경우 (이건 기존 문법과 같다.)
        // arr2 = {3,4,5,6};       // 선언된 배열을 초기화 하는 경우 , 안된다 선언과 동시에 초기화가 이루어 져야한다...

        // 선언만 된 배열은 그럼 어떤 정보를 가지고 있지??

        // 배열의 동적 할당
        int arr7[] = new int[5];    // 메모리를 할당한다. 
        arr1 = new int[3];          // 이런식으로 선언만된 배열에 공간을 할당할 수 있다. 
        arr2 = new int[3];
        arr3 = new int[2][2];
        arr4 = new int[2][3];
        arr5 = new int[3][3];

        // 따로 초기화하지 않아도 자동으로 0이 들어가 있다. 
        System.out.print(arr1[0] + "/" + arr2[0] + "/" + arr3[0][0] + "/" + arr4[0][0] + "?" + arr5[0][1] +"/"+ arr6[1] +"?"+ arr7[0] + "\n");

        // 2. 문자열
        // 객체로 이루어져 있다. 
        String szStr1 = "JAVA Application";
        String szStr2, szStr3;
        szStr2 = "JAVA APPLET";
        szStr3 = szStr2;

        System.out.println(szStr1+" "+szStr2+" "+szStr3);

        // 생서자를 이용한 초기화
        String szStr4 = new String("HELLO World! JAVA");
        System.out.println(szStr4);

        // +연산자
        String szStr5;

        szStr5 = szStr1 + 2;    // 뒤에 오는 2가 문자열로 형변환 되었다.
        System.out.println(szStr5);

        // 원래 있던 문자열을 바꾼다면??
        szStr2 = "JAVA is " + szStr5;
        System.out.println(szStr2);

        // Scanner를 통한 입력
        Scanner sc1 = new Scanner(System.in);

        //sc1.hasNextLine();
        System.out.println(sc1.nextLine());
        System.out.println(sc1.nextLine());
        
        // .hasNextLine()함수는 입려이 계속 끝났는지 확인하기 위해사용하는 메소드 : EOF를 체크만 해주는 역할을 하는구나...
        // 실질적으로 입력 스트림으로 부터 받은 입력 값은 모두 nextline으로 받는군...

        sc1.nextLine(); // 입력 스트림으로 받은 값을 객체에 저장한다.
        System.out.println(sc1);    // 그리고 프린트로 출력할 수 있다.

        System.out.print("정수를 입력해보세요...");
        sc1.nextInt();      // 정수를 입력받는다고 되어 있는데 정수가 아닌 값을 넣으면? => 예외처리가 발생
        System.out.println(sc1);

        Scanner sc2 = new Scanner(System.in);
        int sc2Test;

        sc2Test = sc2.nextInt();    // 리턴 값으로 출력을 할 수 있구나!
        System.out.println(sc2Test);
        // 그래서 hasNextLine or hasNextInt 와 같은 메서드들은 사용자 입력이 정확한지를 파악하기 위해 존재 하는구나...

    }
}
