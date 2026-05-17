class CheckArgument extends Exception {
    public CheckArgument(String message) {
        super(message);
    }
}

public class ArgumentCheck {
    public static void main(String args[]) {
        try {
            if (args.length < 4) {
                throw new CheckArgument("CheckArgument: At least four arguments are required.");
            }
            int sumOfSquares = 0;
            for (String arg : args) {
                int num = Integer.parseInt(arg);
                sumOfSquares += num * num;
            }
            System.out.println(sumOfSquares);
            
        } catch (CheckArgument e) {
            System.out.println("Exception occurred - " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter only integer numbers.");
        }
    }
}
