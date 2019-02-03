import java.util.Scanner;

class Number {
    private int[] intArr;

    public Number(int[] input) {
        this.intArr = input;
    }

    public void sort() {
        for (int i = 0; i < intArr.length - 1; i++) {
            for (int j = i; j < intArr.length; j++) {
                String AB = this.intArr[i] + "" + this.intArr[j];
                String BA = this.intArr[j] + "" + this.intArr[i];
                if (AB.compareTo(BA) > 0) {
                    int temp = this.intArr[i];
                    this.intArr[i] = this.intArr[j];
                    this.intArr[j] = temp;
                }
            }
        }
    }

    public long biggestNum() {
        String concat = "";
        for (int i = this.intArr.length - 1; i >= 0; i--) {
            concat += this.intArr[i];
        }
        return Long.parseLong(concat);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numArr = scanner.nextInt();
        int[] input = new int[numArr];

        for (int i = 0; i < numArr; i++) {
            input[i] = scanner.nextInt();
        }

        Number run = new Number(input);
        run.sort();

        System.out.println(run.biggestNum());
    }
}
