public class MyRunable implements Runnable {
    public static void main(String[] args) {
        Runnable r = new MyRunable();
        Thread thObj = new Thread(r);
        thObj.start();
    }

    @Override
    public void run() {

    }
}
