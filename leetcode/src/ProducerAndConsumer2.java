public class ProducerAndConsumer2 {

    public static void main(String[] args) {
        IPhone iPhone = new IPhone();
        new PhoneConsumer(iPhone).start();
        new PhoneProducer(iPhone).start();
    }
}

//操作的对象
class IPhone{
    private int number;
    //标志变量
    boolean flag = true;

    public synchronized void makeAPhone(int number){
        if (!flag){
            try {
                //等待消费者消费
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.number = number;
        System.out.println("+生产了"+number+"号手机");
        //修改标志变量，并通知消费者消费
        this.flag = !this.flag;
        this.notifyAll();
    }

    public synchronized void sellAPhone(){
        if (flag){
            try {
                //等待生产者生产
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("-卖出了"+number+"号手机");
        //修改标志变量，并通知生产者生产
        this.flag = !this.flag;
        this.notifyAll();
    }
}
//生产者
class PhoneProducer extends Thread{

    IPhone iPhone;
    public PhoneProducer(IPhone iPhone){
        this.iPhone = iPhone;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            iPhone.makeAPhone(i);
        }
    }
}
//消费者
class PhoneConsumer extends Thread{
    IPhone iPhone;
    public PhoneConsumer(IPhone iPhone){
        this.iPhone = iPhone;
    }
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            iPhone.sellAPhone();
        }
    }
}
