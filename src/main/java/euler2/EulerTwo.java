package euler2;

public class EulerTwo {
    public int sumFibonacciEvenNumbers(int limit) {

        int sum = 2;
        int n1 = 1;
        int n2 = 2;
        int n3 = 0;
        while(n3 < limit) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;

            if (n3 % 2 == 0) {
                System.out.println(n3);
                sum += n3;
            }
        }
        return sum;
    }


}
