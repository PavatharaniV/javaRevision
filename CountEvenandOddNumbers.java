public class CountEvenandOddNumbers {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int a = 0;
        int b = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                a = a + 1;
            } else {
                b = b + 1;
            }

        }
        System.out.println("Even Numbers : " + a);
        System.out.println("Odd Numbers : " + b);
    }
}
