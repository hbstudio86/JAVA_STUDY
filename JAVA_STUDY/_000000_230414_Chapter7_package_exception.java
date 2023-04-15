import com.vehicle.Car;

public class _000000_230414_Chapter7_package_exception {
    static public void main(String[] args){
        /* 패키지의미 : 관련있는 클래스와 인터페이스의 묶음
         * 
         * 
         */
        Car c1 = new Car();
        c1.fShow();

        // Error는 심각한 오류
        // Exception은 경미한 오류

        // 메소드를 수행할 때 예외가 발생하면 예외 객체를 만들어 던짐
        // checked exception, unchecked exception

        int excNumber = 1 /0;

        // main 함수에서 예외를 전파하게 되면, 어디서 받아 먹냐?
    }
}
