/*WAP to create two user defined threads which performs following task respectively:

i) Prints all possible substrings of a given string starting from the first character of the string. After printing each substring, it sleeps for 500 milliseconds (task-1) [If the string is KIIT, it will print K, KI and KII. ]

ii) Prints the reverse of each strings present in the string array. After printing reverse of each string in the array, it sleeps for 1000 milliseconds (Task-2)
    Input: {KIIT, SCE, CSE, IT, CSSE, CSCE}
    Output: {TIIK, ECS, ESC, TI, ESSC, ECSC} */

class SubstringThread extends Thread {
    private String str;

    SubstringThread(String str) {
        this.str = str;
    }

    public void run() {
        try {
            for (int i = 1; i <= str.length(); i++) {
                System.out.println(str.substring(0, i));
                Thread.sleep(500);
            }
        } catch (Exception e) {
            System.out.println("The exception has been caught" + e);
        }
    }
}

class ReverseThread extends Thread {
    String[] str;

    ReverseThread(String[] str) {
        this.str = str;
    }

    public void run() {
        try {
            for (int i = 0; i < str.length; i++) {
                String rev = "";
                for (int j = str[i].length() - 1; j >= 0; j--) {
                    rev = rev + str[i].charAt(j);
                }
                System.out.println(rev);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("The exception has been caught" + e);
        }
    }
}

public class Demo4 {
    public static void main(String[] args) {
        String s = "KIIT";
        String[] arr = { "KIIT", "SCE", "CSE", "IT", "CSSE", "CSCE" };

        SubstringThread sth = new SubstringThread(s);
        ReverseThread rth = new ReverseThread(arr);

        sth.start();
        rth.start();
    }
}