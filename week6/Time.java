import java.util.Scanner;

class HrsException extends Exception {
    public HrsException(String message) {
        super(message);
    }
}

class MinException extends Exception {
    public MinException(String message) {
        super(message);
    }
}

class SecException extends Exception {
    public SecException(String message) {
        super(message);
    }
}

class Time {
    private int hours, minutes, seconds;
    public void setTime(int h, int m, int s) throws HrsException, MinException, SecException {
        if (h < 0 || h > 24) {
            throw new HrsException("InvalidHourException: hour should be between 0 and 24");
        }
        if (m < 0 || m > 60) {
            throw new MinException("InvalidMinuteException: minute should be between 0 and 60");
        }
        if (s < 0 || s > 60) {
            throw new SecException("InvalidSecondException: second should be between 0 and 60");
        }
        
        this.hours = h;
        this.minutes = m;
        this.seconds = s;
        System.out.println("Correct Time = " + hours + ":" + minutes + ":" + seconds);
    }
}

public class TimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Time time = new Time();

        try {
            System.out.print("Enter hours: ");
            int h = sc.nextInt();
            System.out.print("Enter minutes: ");
            int m = sc.nextInt();
            System.out.print("Enter seconds: ");
            int s = sc.nextInt();

            time.setTime(h, m, s);

        } catch (HrsException | MinException | SecException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter valid integers.");
        } finally {
            sc.close();
        }
    }
}
