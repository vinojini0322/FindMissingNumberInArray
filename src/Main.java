public class Main {
    public static void main(String args[]) {
        int[] testArray = {1, 2, 3, 4, 5, 6, 7, 8,9, 10,11,12,13,14,15,17,18};
        int start = 1;
        int end = 18;
        missingNumber(testArray, start, end);

    }


    public static void missingNumber(int[] arr, int str, int end) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum1 = sum1 + arr[i];
        }
        for (int i = str; i <= end; i++) {
            sum2 = sum2 + i;
        }
        System.out.println(sum1);
        System.out.println(sum2);
        int missingNumber = sum2 - sum1;
        System.out.println("Missing number is : " + missingNumber);

    }

}
