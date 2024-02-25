public class NumberExtractor {
    public static void main(String[] args) {
        String s = "12surya1jaya321";
        int sum = sumNumbersInString(s);
        System.out.println("Sum of numbers in the string: " + sum);
    }

    public static int sumNumbersInString(String s) {
        int sum = 0;
        int currentNumber = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                int j = c - '0';              
                currentNumber = currentNumber * 10 + j; // Accumulate the digit
            } else {
                sum += currentNumber; // Add the accumulated number to sum
                currentNumber = 0; // Reset the accumulated number
            }
        }

        // Add the last accumulated number (if any)
        sum += currentNumber;

        return sum;
    }
}
