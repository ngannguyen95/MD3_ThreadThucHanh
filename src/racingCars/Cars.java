package racingCars;

import java.util.Random;

import static racingCars.Main.DISTANCE;
import static racingCars.Main.STEP;

public class Cars implements Runnable {
    // khai báo tên của xe đua
    private String name;

    public Cars(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        //khởi tạo điểm start hay km ban đầu
        int runDistance = 0;
        //Khởi tạo time bắt đầu cuộc đua
        long startTime = System.currentTimeMillis();

        //kiểm tra chừng nào còn xe chưa kết thúc quãng
        // đường đua thì vẫn tiếp tục chạy
        while (runDistance < DISTANCE) {
            try {
                //random speed km/h
                int speed = (new Random()).nextInt(20);
                //tính quãng đường đã đi
                runDistance += speed;
                // Build result graphic-xây dựng đồ họa kết quả
                String log = "|";
                int percentTravel = (runDistance * 100) / DISTANCE;
                for (int i = 0; i < DISTANCE; i += STEP) {
                    if (percentTravel >= i + STEP) {

                    }
                }

            }
        }
    }
}
