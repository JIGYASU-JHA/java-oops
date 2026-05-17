import java.util.*;

class MeanThread extends Thread {
    private int[] numbers;
    public MeanThread(int[] numbers) {
        this.numbers = numbers;
    }
    
    public void run() {
        try {
            Thread.sleep(1000);
            double sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            double mean = sum / numbers.length;
            System.out.println("Mean: " + mean);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class MedianThread extends Thread {
    private int[] numbers;
    public MedianThread(int[] numbers) {
        this.numbers = numbers;
    }
    
    public void run() {
        try {
            Thread.sleep(5000);
            Arrays.sort(numbers);
            double median;
            int n = numbers.length;
            if (n % 2 == 0) {
                median = (numbers[n / 2 - 1] + numbers[n / 2]) / 2.0;
            } else {
                median = numbers[n / 2];
            }
            System.out.println("Median: " + median);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ModeThread extends Thread {
    private int[] numbers;
    
    public ModeThread(int[] numbers) {
        this.numbers = numbers;
    }
    
    public void run() {
        try {
            Thread.sleep(10000);
            Map<Integer, Integer> frequencyMap = new HashMap<>();
            for (int num : numbers) {
                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            }
            int mode = numbers[0];
            int maxCount = 0;
            for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
                if (entry.getValue() > maxCount) {
                    maxCount = entry.getValue();
                    mode = entry.getKey();
                }
            }
            System.out.println("Mode: " + mode);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class StatisticsThread {
    public static void main(String[] args) {
        int[] numbers = {4, 1, 2, 2, 3, 5, 6, 2, 4};
        
        MeanThread meanThread = new MeanThread(numbers);
        MedianThread medianThread = new MedianThread(numbers);
        ModeThread modeThread = new ModeThread(numbers);
        
        meanThread.start();
        medianThread.start();
        modeThread.start();
    }
}
