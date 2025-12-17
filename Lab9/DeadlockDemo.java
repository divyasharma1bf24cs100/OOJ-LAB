class DeadlockDemo{
    static final Object A=new Object();
    static final Object B=new Object();
    public static void main(String[] args){
        Thread t1=new Thread(()->{
            synchronized (A){
                System.out.println("Thread 1 locked A");
                try{Thread.sleep(100);}catch(Exception e){}
                synchronized (B){
                    System.out.println("Thread 1 locked B");
                }
            }
        });
        Thread t2=new Thread(()->{
            synchronized (B){
                System.out.println("Thread 2 locked B");
                try{Thread.sleep(100);}catch(Exception e){}
                synchronized (A){
                    System.out.println("Thread 2 locked A");
                }
            }
        });
        t1.start();
        t2.start();
    }
}
