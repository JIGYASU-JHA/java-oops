class Time {
    int hr, min, sec;
    Time() {
        hr = 0;
        min = 0;
        sec = 0;
    }
    Time(int hr, int min, int sec) {
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }

    void display() {
        System.out.println("Time: " + hr + " hours " + min + " minutes " + sec + " seconds");
    }

    Time add(Time t) {
        int totalSeconds = this.sec + t.sec;
        int totalMinutes = this.min + t.min + (totalSeconds / 60);
        int totalHours = this.hr + t.hr + (totalMinutes / 60);
        totalSeconds = totalSeconds % 60;
        totalMinutes = totalMinutes % 60;
        totalHours = totalHours % 24; 
        return new Time(totalHours, totalMinutes, totalSeconds);
    }
}

public class TimeTest {
    public static void main(String[] args) {
        Time time1 = new Time(5, 45, 30);  
        Time time2 = new Time(2, 30, 40);  
        System.out.println("First Time:");
        time1.display();
        System.out.println("Second Time:");
        time2.display();
        Time addedTime = time1.add(time2);
        System.out.println("\nTime after adding:");
        addedTime.display();
    }
}
