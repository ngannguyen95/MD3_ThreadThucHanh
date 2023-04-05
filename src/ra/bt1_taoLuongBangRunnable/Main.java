package ra.bt1_taoLuongBangRunnable;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread đang chạy..");
        RunnableDemo runnableDemo1=new RunnableDemo("thread-1-HR-Database");
        runnableDemo1.start();

        RunnableDemo runnableDemo2=new RunnableDemo("thread-2-send-Email");
        runnableDemo2.start();

        System.out.println("Dừng main thread");
    }
}
