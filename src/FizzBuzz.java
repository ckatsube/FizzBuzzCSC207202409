/**
 * Solve the FizzBuzz challenge.
 *
 * Task 1
 *
 * Assignment
 *  - Types (boolean int void)
 *
 * Expressions
 *  - Operators (% &&)
 *
 * Loops
 *  - Initialization / Condition / Update
 *
 * Conditionals
 *  - if / else if / else
 *
 * Functions
 *  - public static void main
 *  - Printing
 *
 * Syntax
 *  - brackets
 *  - indentation
 *  - comments
 */
class FizzBuzz {

    public static void main(String[] args) {

        /**
         * How can we convert this for loop to a while loop?
         *  - Initialization
         *  - Condition
         *  - Update
         *
         * Two ways:
         *  - post-body incrementing
         *  - within-condition incrementing
         *
         * Food for thought: how does this relate to Python's range function?
         *  - for i in range(1, 100)
         */
        int i = 0;
        while (++i < 100) doFizzBuzz(i);
    }

    /**
     * Does the private keyword here relate to any Python concepts?
     * What happens if we remove static here?
     *
     * How much more testable is this function?
     *  - How is it different from before
     *  - How can we still improve it
     */
    private static void doFizzBuzz(int i) {
        // Find out which numbers divide i.
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) {

            System.out.println("Fizz Buzz");

        } else if (divisibleBy3) {

            System.out.println("Fizz");

        } else if (divisibleBy5) {

            System.out.println("Buzz");

        } else {

            System.out.println(i);

        }
    }
}
