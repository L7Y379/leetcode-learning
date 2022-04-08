class PrintThread implements Runnable {

    private static final Object lock = new Object();
    private int number;

    public PrintThread(int number) {
        this.number = number;
    }

    public static void beginPrint() {
        synchronized (PrintThread.lock) {
            PrintThread.lock.notify();
        }
    }

    @Override
    public void run() {
        synchronized (lock) {
            while (number <= 100) {
                try {
                    System.out.println(number + " " + Thread.currentThread());
                    lock.wait();
                    number += 10;
                    lock.notify();
                    // 需要先被其他线程使用notify()唤醒，唤醒后还需要等待获得锁
                    // 线程从waiting状态变成blocked状态，之后变成runnable状态
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}

public class PrintNumber {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 10; ++i) {
            PrintThread print = new PrintThread(i);
            new Thread(print).start();
            Thread.sleep(10);
            // 保证线程按序进入wait状态，HotSpot虚拟机中，线程时按序唤醒的。
        }

        PrintThread.beginPrint();
    }
}
