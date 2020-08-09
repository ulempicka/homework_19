package euler1;

public class Main {
    public static void main(String[] args) {
        Euler euler = new Euler();
        int sum = euler.sumMultipleThreeAndFive(1000);
        System.out.println("suma wszystkich wielokrotności 3 lub 5 poniżej 1000 wynosi " + sum);
    }
}
