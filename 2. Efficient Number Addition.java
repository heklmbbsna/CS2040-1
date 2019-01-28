import java.util.Scanner;
import java.util.Arrays;

class Array {
    private int[] cumulativeSum; 

    public Array(int[] input) {
        int[] array = new int[input.length + 1];
        cumulativeSum = array;
        cumulativeSum[0] = 0;
        for (int i = 1; i <= input.length; i++) {
            cumulativeSum[i] = input[i - 1] + cumulativeSum[i - 1];
        }
    }
    public int[] getArray() {
        return cumulativeSum;
    }
}

class Query {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first index");
        int index1 = scanner.nextInt();
        System.out.println("Enter the second index");
        int index2 = scanner.nextInt();

        int[] sampleArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        // for testing

        Array array = new Array(sampleArray);
        int[] cumulativeList = array.getArray();
        int sum = cumulativeList[index2 + 1] - cumulativeList[index1];
        System.out.println(sum);
    }
}
