import java.util.Arrays;

public class Median {
    public static void main(String[] args) {
        double[] arr = { 10, 20, 30, 50, 40, 70, 60 };
        double median;
        Arrays.sort(arr);
        if (arr.length % 2 == 1)
            median = arr[arr.length / 2];
        else
            median = (arr[arr.length / 2 - 1] + arr[arr.length / 2]) / 2;

        System.out.println(median);
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }
}
