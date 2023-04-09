class GeneClass<T> {
    T numbers;  // 기본 초기화
    public GeneClass (){    // 기본 생성자
        numbers = null;
        System.out.println("기본생성자생성,필드에 0으로 초기화");
    }

    public GeneClass (T num){ // 기본 생성자
        numbers = num;
        System.out.println("사용자생성자1 생성, 입력"+num+"가 필드에 저장");
    }

    public void showField(){
        System.out.println("Fileld Value : " + numbers);
    }
}

public class STD6_Practice1 {
    static public void main(String args[]){
        System.out.println("Int형 제네릭");
        GeneClass<Integer> gc1 = new GeneClass<>();
        gc1.showField();
        
        GeneClass<Double> gc2 = new GeneClass<Double>(20.1);    // 이런 형태도 상관은 없네
        gc2.showField();
    }
}
