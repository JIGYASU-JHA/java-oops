interface Numbers {
    int Process(int x, int y); 
}
class Sum implements Numbers {
    public int Process(int x, int y) {
        return x + y; 
    }
}

class Average implements Numbers {
    public int Process(int x, int y) {
        return (x + y) / 2; 
    }
}
public class NumbersOperation {
    public static void main(String args[]) {
        Numbers sumOperation = new Sum();
        Numbers averageOperation = new Average();
        int num1 = 10;
        int num2 = 20;
        int sum = sumOperation.Process(num1, num2);
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
        int average = averageOperation.Process(num1, num2);
        System.out.println("Average of " + num1 + " and " + num2 + " is: " + average);
    }
}
