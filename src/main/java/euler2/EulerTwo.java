package euler2;

public class EulerTwo {
    public int sumFibonacciEvenNumbers(int limit) {

        int sum = 0;
        int fibonacci1 = 0;
        int fibonacci2 = 1;
        int fibonacci3 = 0;

        while(fibonacci3 < limit) {
            fibonacci3 = fibonacci1 + fibonacci2;
            fibonacci1 = fibonacci2;
            fibonacci2 = fibonacci3;

            if (fibonacci3 >= limit){
                return sum;
            }
            if (fibonacci3 % 2 == 0) {
                System.out.println(fibonacci3);
                sum += fibonacci3;
            }
        }
        return sum;
    }
}
