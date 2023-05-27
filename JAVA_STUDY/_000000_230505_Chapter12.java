class MyThread1 extends Thread {
    public void run(){
        for (int i = 0; i < 10; i++){
            System.out.println(getName());
            Thread.yield(); // ruuning --> runnable 상태로 변경
        }
    }
}

class MyThread2 implements Runnable{    // 이것은 구현과 상속을 동시에 할 수 잇다? 위에것도 마찬가지 아닌가?
    public void run(){
        for (int i = 0; i < 10; i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}

public class _000000_230505_Chapter12 {

    // thread
    // Main thread 말고 다른 thred (자식 thread)를 생성해서 진행 한다
    // 결국 이것은 시분할 처리를 말하는 것이지 않겠는가?! 

    // start 메소드를 상속 받은거네?

    // Thread 상태 변화 : startable --> runnable --> running --> dead / not ruuning

    // synchronized : 동기화 시켜주는 접근자? 두 개 이상의 thread가 하나의 공유 자원을 접근할 때 하나씩 접근하도록 한다.

    public static void main(String args[]){
        Thread t1 = new MyThread1(); t1.start();
        Thread t2 = new MyThread1(); t2.start();
        Thread t5 = new Thread(new MyThread1()); t5.start();
        //t1.join();
        // t5.join();
        System.out.println("Main");
        
        // 실행 순서를 보장 할 수 없음.

        Thread t3 = new Thread(new MyThread2()," thd0 "); t3.start();
        Thread t4 = new Thread(new MyThread2()," thd1 "); t4.start();
        System.out.println("MAIN");

    }
    
}
