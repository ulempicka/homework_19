package euler2;

public class Main {
    public static void main(String[] args) {
        EulerTwo eulerTwo = new EulerTwo();
        int sum = eulerTwo.sumFibonacciEvenNumbers(4000_000);
        System.out.println("suma parzystych wartości ciągu Fibonacciego których wartość nie przekracza 4 milionów wynosi " + sum);
    }
}
