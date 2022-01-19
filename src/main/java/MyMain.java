public class MyMain {
    // Examples From Class:

    // This is the example problem that we did in class
    // This uses recursion to count the total number
    // of digits in a positive number
    public static int numDigits(int x) {
        // Base case
        if (x == 0) {
            return 0;
        }
        // Recursive call
        else {
            return 1 + numDigits(x / 10);
        }
    }

    // This is a wrapper method. It just calls the
    // tail recursive version of num digits!
    public static int numDigits2(int x) {
        return numDigitsTR(x, 0);
    }

    // This is a tail recursive version of numDigits
    // This method should never be called directly;
    // rather the wrapper method numDigits2 should be called
    public static int numDigitsTR(int x, int count) {
        // Base case
        if (x == 0) {
            return count;
        }
        // Recursive call
        else {
            return numDigitsTR(x / 10, count + 1);
        }
    }


    // In-class Practice Problems

    // Write a method that uses recursion to calculate the number
    // of "big" digits in a number
    // A big digit is any digit that is at least 5
    // Examples:
    // countBigDigits(1234) => 0
    // countBigDigits(99999) => 5
    // countBigDigits(521931) => 2
    public static int countBigDigits(int x) {
//        // YOUR CODE HERE
//        return -1;
        // Base case
        if (x == 0) {
            return 0;
        }
        // Recursive call
        else if (x % 10 >= 5){
            return 1 + countBigDigits(x / 10);
        }
        else {
            return countBigDigits(x / 10);
        }
    }

    // Write a method that uses recursion to calculate whether
    // the number contains more odd digits than even digits
    // You will almost certainly need to use **tail recursion!**

    // Hint: what additional parameters will you need to add?

    // Hint 2: you might want to keep track of both the number
    // of odd numbers and the number of even numbers

    // Examples:
    // moreOddThanEven(1234) => false because 2 of each
    // moreOddThanEven(99999) => true because 5 odd and 0 even
    // moreOddThanEven(521931) => true because 5 odd and 1 even
    public static boolean moreOddThanEven(int x) {
//        // YOUR CODE HERE
//        return false;
        return moreOddThanEvenTR(x, 0, 0);
    }

    public static boolean moreOddThanEvenTR(int x, int odd, int even) {
        if (x == 0) {
            return odd > even;
        }
        // Recursive call
        else if (x % 2 == 0){
            return moreOddThanEvenTR(x / 10, odd, even + 1);
        }
        else {
            return moreOddThanEvenTR(x / 10, odd + 1, even);
        }
    }

    // Write a method that is given a String containing a single pair
    // of matched parentheses containing some characters. This method
    // should use recursion to "trim" off all the extra characters until
    // only the parentheses and their contents remain
    // You can assume that the String always contains this pair of parens
    // Examples:
    // parenTrim("xyz(abc)123") => "(abc)"
    // parenTrim("x(hello)") => "(hello)"
    // parenTrim("(xy)1") => "(xy)"
    public static String parenTrim(String str) {
//        // YOUR CODE HERE
//        return "";
        char c0 = str.charAt(0);
        char c9 = str.charAt(str.length()-1);

        if (c0== '(' && c9 == ')') {
            return str;
        }
        else if (c0 != '(' && c9 != ')') {
            return parenTrim(str.substring(1, str.length()-1));
        }
        else if (c0 != '(') {
            return parenTrim(str.substring(1));
        }
        else {
            return parenTrim(str.substring(0, str.length()-1));
        }
    }





    // Methods for homework:

    // This method adds up the values of all digits
    // in x, recursively
    // Examples:
    // countBigDigits(1234) => 10
    // countBigDigits(99999) => 45
    // countBigDigits(521931) => 21
    public static int addDigits(int x) {
//        // YOUR CODE HERE
//        return -1;
        if (x < 10) {
            return x;
        }
        else {
            return (x % 10) + addDigits(x/10);
        }
    }


    // This method checks if a String is a palindrome
    // (e.g. "racecar", "madam"), recursively
    // Remember that a palindrome is a word that is the same forwards
    // and backwards, so the first letter must match the last letter,
    // the second letter must match the second to last letter, and so on
    // Examples:
    // isPalindrome("racecar") => true
    // isPalindrome("madam") => true
    // isPalindrome("racecars") => false
    public static boolean isPalindrome(String str) {
//        // YOUR CODE HERE
//        return false;
        if (str.length() <= 1) {
            return true;
        }
        else if(str.charAt(0) == str.charAt(str.length()-1)) {
            return isPalindrome(str.substring(1, str.length()-1));
        }
        else {
            return false;
        }
    }

    // This method returns the orignal string reversed;
    // tail recursion could be helpful, but it not required!
    // Examples:
    // reverse("desserts") => stressed
    // reverse("racecar") => racecar
    public static String reverse(String str) {
//        // YOUR CODE HERE
//        return "";
        if (str.length() == 0) {
            return "";
        }
        else {
            return reverse(str.substring(1)) + str.charAt(0);
        }
    }



    public static void main(String[] args) {
        // Optional: Write some code here to test your methods!
    }
}
