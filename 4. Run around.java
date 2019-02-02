import java.util.Scanner;

class Digit {

    private int digit;
    private int[] intArr;
    private int digitLength;

    public Digit(int input) {
        this.digit = input;
        this.digitLength = (int) Math.log10(input) + 1;
        this.intArr = new int[digitLength];

        for (int i = this.digitLength - 1; i >= 0; i--) {
            intArr[i] = (int) input % 10;
            input /= 10;
        }
    }

    public int replaceDigit(int index) {
        int newIndex = (this.intArr[index] + index) % this.digitLength;
        this.intArr[index] = 0;
        return newIndex;
    }

    public boolean checkZeroArray() { // runabout number check
        boolean checker = true;
        for (int i = 0; i < this.digitLength; i++) {
            if (this.intArr[i] != 0) {
                return false;
            }
        }
        return true;
    }
    
    public int getArrValue(int index) {
        return this.intArr[index];
    }
}

class Solver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Digit digit = new Digit(scanner.nextInt());

        int index = 0; // initialisation
        while (!digit.checkZeroArray()) {
            int arrValue = digit.getArrValue(index);
            index = digit.replaceDigit(index);
            if (arrValue == 0) {
                break;
            }
        }
        System.out.println(digit.checkZeroArray());
    }
}
