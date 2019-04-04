package XPrimes;

public class XPrimes {
    public static void main(String[] args) {
        String primes = new XPrimes().getXPrimes(10);
        System.out.println(primes);
    }

    public String getXPrimes(int position){
        String prime = "";

        for(int i = 2; i < position; i++){
            boolean isPrime = true;
            for(int j = 2; j < position; j++){
//                System.out.println(i + " % " + j + " = " + (i%j));
                if(i % j == 0 && i != j){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
                prime += i + " ";
        }

        return prime;
    }
}
