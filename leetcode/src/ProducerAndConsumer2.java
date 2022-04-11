public class ProducerAndConsumer2{
    public static void main(String[] args) {
        Factory factory=new Factory(10);

        xiaofei xf=new xiaofei(factory);
        shengchan sc=new shengchan(factory);
        new Thread(sc).start();
        new Thread(xf).start();

    }
}
class cake{
    int number;
    public cake(int number){
        this.number=number;
    }
}
class Factory{
    int len;
    int now=0;
    cake[] arr;
    public Factory(int len){
        this.len=len;
        arr=new cake[len];
    }
    public synchronized void create(cake c) throws InterruptedException {
        if(now==len){
            System.out.println("=============货架已满============");
            this.wait();
        }
        arr[now]=c;
        now++;
        this.notifyAll();
    }
    public synchronized cake eat() throws InterruptedException{
        if(now==0){
            System.out.println("=============货架没有商品了============");
            this.wait();
        }

        now--;
        this.notifyAll();
        cake take=arr[now];
        arr[now]=null;
        return take;
    }
}
class xiaofei implements Runnable{

    public final Factory factory;
    public xiaofei(Factory factory){
        this.factory=factory;
    }
    @Override
    public void run() {
        for(int i=0;i<100;i++) {
            try {
                cake cc=factory.eat();

                System.out.println("消费了"+cc.number+"蛋糕");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
class shengchan implements Runnable{
    public final Factory factory;
    public shengchan(Factory factory){
        this.factory=factory;
    }
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            cake c=new cake(i);
            try {
                factory.create(c);
                System.out.println("生产了"+i+"蛋糕");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}