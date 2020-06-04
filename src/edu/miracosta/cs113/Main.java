package edu.miracosta.cs113;

public class Main {

    public static void main(String[] args) {

        System.out.println("2^" + powerOfTwo(1));
        System.out.println("2^" + powerOfTwo(4));
        System.out.println("2^" + powerOfTwo(2));
        //System.out.println("2^" + powerOfTwo(7));
        if (powerOfTwo(7) == -1){
            System.out.println("This is not a power of two.");
        }

        System.out.println("2^" + powerOfTwo(-5));
        System.out.println("2^" + powerOfTwo(6));
        System.out.println("2^" + powerOfTwo(1024));

        System.out.println(recPowerOfTwo(1));
        System.out.println(recPowerOfTwo(4));
        System.out.println(recPowerOfTwo(2));
        System.out.println(recPowerOfTwo(7));
        System.out.println(recPowerOfTwo(-5));
        System.out.println(recPowerOfTwo(6));
    }

    public static boolean recPowerOfTwo(int n) {
        //base cases
        if (n == 1) {
            return true;
        }
        if (n < 1) {
            return false;
        }
        if (n%2 == 0) {
            //change n to n/2 result
            return recPowerOfTwo(n / 2);
        }
        else {
            return false;
        }
    }

    /**
     * special cases: if number is 1 it is a power of two (2^0) and anything negative or 0 is false
     * while true, check if there's a remainder
     * if there is no remainder, it means it evenly divides
     *      set n to n / 2
     *      check if it equals 1
     *          if yes, return true
     *     else return false (if there is a remainder, it's not a power of tqo)
     * @param n
     * @return boolean
     */
    public static int powerOfTwo(int n){
        int loopCounter = 0;
        //special cases
        if (n == 1) {
            //return true;
            return 0;
        }
        if (n < 1) {
            //return false;
            return -1;
        }

        while (true) {
            //if it evenly divides with remainder 0
            if (n%2 == 0) {
                loopCounter ++;
                //change n to new division result
                n = n/2;
                if (n == 1){
                    //it is a power of two!
                   // return true;
                    return loopCounter;
                }
            }
            else {
                //return false;
                return -1;
            }
        }
    }
}


