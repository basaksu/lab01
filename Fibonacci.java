public class Fibonacci {
    public static void main(String[] args) {
        IntBag fibNo = new IntBag();
        fibNo.add(0);
        fibNo.add(1);

        for (int i = 2; i < 40; i++) {
            int fib = fibNo.getValue(i - 1) + fibNo.getValue(i - 2);
            fibNo.add(fib);
        }

        System.out.println(fibNo);
    }
}
