import java.util.Scanner;

class BalanceArray {
    private int leftSum;
    private int rightSum;
    private int[] intArr;

    public BalanceArray(int[] arr) {
        this.intArr = arr;
        this.leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            this.rightSum += arr[i];
        }
    }

    public boolean balanceCheck(int index) {
        if (this.leftSum == this.rightSum) {
            return true;
        } else if (index >= intArr.length) {
            return false;
        } else {
            this.leftSum += intArr[index];
            this.rightSum -= intArr[index];
            return balanceCheck(index + 1);
        }
    }
}

class Solver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arrLen = sc.nextInt();
        int[] intArr = new int[arrLen];
        for (int i = 0; i < arrLen; i++) {
            intArr[i] = sc.nextInt();
        }

        BalanceArray solve = new BalanceArray(intArr);
        System.out.println(solve.balanceCheck(0));
    }
}
