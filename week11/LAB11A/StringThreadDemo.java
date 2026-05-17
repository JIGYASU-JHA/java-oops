import java.util.*;
class SubstringThread extends Thread {
    private String str;

    public SubstringThread(String str) {
        this.str = str;
    }

    public void run() {
        for (int i = 1; i <= str.length(); i++) {
            System.out.println(str.substring(0, i));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class ReverseThread extends Thread {
    private String str;

    public ReverseThread(String str) {
        this.str = str;
    }

    public void run() {
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class StringThreadDemo {
    public static void main(String[] args) {
        String[] strs = {"KIIT", "SCE", "CSE", "IT", "CSSE", "CSCE"};

        for (String str : strs) {
            SubstringThread st = new SubstringThread(str);
            ReverseThread rt = new ReverseThread(str);

            st.start();
            rt.start();

            try {
                st.join();
                rt.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

