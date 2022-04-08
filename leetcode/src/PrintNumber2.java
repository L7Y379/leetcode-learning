class PrintThread2 implements Runnable {

    private int number;

    public PrintThread2(int number) {
        this.number = number;
    }


    @Override
    public void run() {
        synchronized (this) {
            while (number <= 100) {
                try {
                    System.out.println(number + " " + Thread.currentThread());
                    this.wait();
                    number += 10;
                    this.notify();
                    // 需要先被其他线程使用notify()唤醒，唤醒后还需要等待获得锁
                    // 线程从waiting状态变成blocked状态，之后变成runnable状态
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}

public class PrintNumber2 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 10; ++i) {
            PrintThread2 print = new PrintThread2(i);
            new Thread(print).start();
            Thread.sleep(10);
            // 保证线程按序进入wait状态，HotSpot虚拟机中，线程时按序唤醒的。
        }

    }
}
