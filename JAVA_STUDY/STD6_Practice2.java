interface STD6_if{
    int add6(int a, int b);
}

public class STD6_Practice2 {
    static public void main(String[] args){
        // 람다 lambda는 결국 인터페이스의 메서드의 형태만 만들고 그 정의는 인라인에서 새로 부여 한다는 개념인가?
        STD6_if sif1 = (int a,int b) -> {
            return (a * 2) + (b * 1);
        };
        System.out.println(sif1.add6(10,20));
    }
}
