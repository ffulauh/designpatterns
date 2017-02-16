package me.ffulauh.dp.singleton;


/**
 * Created by ffulauh on 2017/1/2.
 */
public class Singleton {
    //    用"双重检查锁"，在getInstance()中减少使用同步
    private volatile static Singleton uniqueInstance;
    public static Singleton getInstance(){
        if(uniqueInstance==null){
            synchronized (Singleton.class){
                if(uniqueInstance==null){
                    uniqueInstance=new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

    //其他有用的实例化的变量
    private Singleton(){}

    //    同步会降低性能
//    private static Singleton uniqueInstance;
//    public static synchronized Singleton getInstance(){
//        if(uniqueInstance==null){
//            uniqueInstance=new Singleton();
//        }
//        return uniqueInstance;
//    }

//    使用'急切'创建实例，而不用延迟实例化的做法
//    private static Singleton uniqueInstance=new Singleton();
//    public static Singleton getInstance(){
//        return uniqueInstance;
//    }

}
