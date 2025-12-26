public class evenNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arr.length; i++) {
            int number = arr[i];
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }
}