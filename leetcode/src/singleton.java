public class singleton {
    public static volatile singleton singleton_duixiang;

    private singleton() {

    }
//
//    public static synchronized void method(){
//
//    }
//    public synchronized void method2(){
//
//    }volatile

    public static singleton getduixiang(){
        //先判断对象是否已经实例过，没有实例化过才进入加锁代码
        if(singleton_duixiang==null){
            //类对象加锁
            synchronized (singleton.class){
                if(singleton_duixiang==null){
                    singleton_duixiang=new singleton();
                }
            }
        }
        return singleton_duixiang;
    }
}
