public class SumOfFirst1000Primes {
    public static void main(String[] args) {
        int count = 0;//variable keeps track of the number of prime numbers that have been
        // found so far. The while loop in the program continues until 1000 primes have been found.
        int sum = 0;//variable is used to accumulate the sum of the prime numbers that have been found so
        // far. Every time a prime number is found, it is added to the sum.
        int num = 2; // start checking for primes from 2

        //method to add first 1000 prime numbers
        while (count <= 1000) {//loop until 1000 prime numbers are found
            if (isPrime(num)) {//check if a number is prime
                sum += num;
                count++;
            }
            num++;
        }
        System.out.println("The sum of first 1000 prime number: "+sum);
    }

    //method to check if a number is prime
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i=2; i<=Math.sqrt(num); i++){
            if (num%i==0){
                return false;
            }
        }
        return true;
    }
}
