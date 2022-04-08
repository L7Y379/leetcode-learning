public class thread10 {
    public static void main(String[] args) {
        for (int i=0;i<10;i++){
            printnum pp=new printnum(i);
            new Thread(pp).start();
        }
    }

}
class printnum implements Runnable{
    private int num;
    public printnum(int num){
        this.num=num;
    }
    @Override
    public void run() {
        System.out.println(num);
    }
}
