public class MyCode {

    static int minTime(String word) {
        int result = 0;
        int current = 0;
        // If word is empty then time is 0
        if (word.length() == 0) {
            return 0;
        } else {
            // Uppercase letters go from A:65 to Z:90 in ascii code
            word = word.toUpperCase();
            for (char letter : word.toCharArray()) {

                // Map the current ordinary value in ascii code to alphabet index so A = 0
                int index = (int) letter - 65;

                // Calculate distance from current to index clockwise
                int clockwise = Math.abs(current - index);

                // Calculate distance from current to index anti clockwise
                int antiClockwise = 26 - Math.abs(current - index);

                // Add the min value to the sum result
                result += Math.min(clockwise, antiClockwise);

                // Set current pointer to the current letter
                current = (int) letter - 65;                                
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("Minimum time is " + minTime("bryan"));
    }
}