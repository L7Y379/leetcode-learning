public class ProducerAndConsumer {
    public static void main(String[] args) {
        //创建货架对象
        GoodsShelf goodsShelf = new GoodsShelf();
        //生产者消费者都是对一个货架进行操作，所以传参数都一样
        Producer producer = new Producer(goodsShelf);
        Consumer consumer = new Consumer(goodsShelf);
        //开始
        new Thread(producer).start();
        new Thread(consumer).start();
    }

}

//商品
class Iphone{
    int number;
    public Iphone(int number){
        this.number = number;
    }
}

//货架
class GoodsShelf{
    //可以放10个商品的货架
    Iphone[] iphones = new Iphone[10];
    //显示货架商品数量
    int count = 0;
    //对象调用的wait()方法时一定要在同步块或者同步方法中调用，以确保代码段不会被多个线程调用。
    public synchronized void pushIphone(Iphone iphone){
        //如果货架数量等于货架的最大容量则停止生产
        if (count == iphones.length){
            try {
                System.out.println("=============货架已满============");
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //商品放入货架
        iphones[count] = iphone;
        //商品数量加1
        count++;
        //通知消费者可以消费了
        this.notifyAll();
    }
    public synchronized Iphone popIphone(){
        //没有商品了等待生产线生产
        if (count == 0){
            try {
                System.out.println("=============货架没有商品了============");
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //产品数量减1。注意：商品的下标等于商品数量减1，所以要先减
        count--;
        //通知生产者生产
        this.notifyAll();
        return iphones[count];
    }
}

//生产者
class Producer implements Runnable{
    private final GoodsShelf goodsShelf;
    public Producer(GoodsShelf goodsShelf){
        this.goodsShelf = goodsShelf;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                //睡眠0.01秒方便观察。睡眠不释放锁
                Thread.sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            goodsShelf.pushIphone(new Iphone(i));
            System.out.printf("生产了%3d号手机\r\n",i);
        }
    }
}
//消费者
class Consumer implements Runnable{
    private final GoodsShelf goodsShelf;
    public Consumer(GoodsShelf goodsShelf){
        this.goodsShelf = goodsShelf;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                //睡眠
                Thread.sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Iphone iphone = goodsShelf.popIphone();
            System.out.printf("消费了%3d号手机\r\n",iphone.number);
        }

    }
}
