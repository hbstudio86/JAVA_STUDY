class ArrayList <E> {
    public E numbers;

    public void dataSet(E number){
        this.numbers = number;
    }
}

// 제네릭 클래스는 기본 자료형을 이용할 수가 없음.
// 참조형을 사용할 수 있다. int = integer , double = double, char = character

// 람다식 구문
// 인터페이스 객체변수 = (매개변수목록)->{실행문목록}
// Runnable runnable = () -> {...};

interface Addable{
    int add(int a, int b);
}

public class STD6_GenericLambda {
    static public void main(String[] args){

        // 제네릭클래스 제네릭 인터페이스 제네릭 메소드
        // 일반화된 클래스

        ArrayList<Integer> tal1 = new ArrayList<>();
        tal1.dataSet(0);
        
        System.out.println(tal1.numbers);

        Addable ad1 = (int a, int b) -> {   // Lambda식은 결국 인라인 함수같이 쓸 수 있다는 말인가?
            return (a+b);
        };

        Addable ad2 = (a,b) -> (a-b);
        
        System.out.println(ad1.add(10,20));
        System.out.println(ad2.add(50,10));
    }
    
}
