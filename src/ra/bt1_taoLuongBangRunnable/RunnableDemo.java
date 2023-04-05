package ra.bt1_taoLuongBangRunnable;

public class RunnableDemo implements Runnable {
    private Thread t;
    private final String threadName;

    RunnableDemo(String name) {
        threadName = name;
        System.out.println("Creating: " + threadName);
    }

    // hiển thị luồng nào ddang được thực thi
    @Override
    public void run() {
        System.out.println("Running: " + threadName);
        try {
            for (int i = 10; i > 0; i--) {
                Thread.sleep(3000);
                System.out.println("Thread : " + threadName + "," + i);
                //Dừng vòng lặp trong 50ms

            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " bị gián đoạn");
        }
        System.out.println("Thread " + threadName + "exiting");
    }

    // phương thức start để tạo các luồng với tên tương ứng
    public void start() {
        System.out.println("Starting: " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }


}
