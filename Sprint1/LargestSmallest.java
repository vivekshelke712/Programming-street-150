package Sprint1;

public class LargestSmallest {
    public static void main(String[] args) {
        int[] arr = { 49, 56, 33, 55, 99, 103, 23 };
        int Min = Integer.MAX_VALUE;
        int Max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > Max) {
                Max = arr[i];
            } else {
                Min = arr[i];
            }
        }
        System.out.println("The Min Value is " + Min + " The MAx Value is " + Max);
    }
}
