import java.util.Scanner;

class Number {
    private int _digit;
    private int[] bigFreqArr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    private int[] smallFreqArr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    private int _biggest = 0;
    private int _smallest = 0;

    public Number(int input) {
        _digit = input;
    }

    public boolean Checker(int digit) {
        return digit % 1111 != 0;
    } // returns false if all digits are the same
    
    public void freqList(int digit) { // not sure if it's considered sort so
        int forth = digit % 10;
        int third = (digit % 100) / 10;
        int second = (digit % 1000) / 100;
        int first = digit / 1000;

        int[] numbers = {first, second, third, forth};
        for (int number : numbers) {
            bigFreqArr[number]++;
            smallFreqArr[number]++;
        }
    }

    public void biggest() {
        for (int j = 0; j < 4; j ++) { // 1 loop for each digit
            for (int i = 9; i >= 0; i--) {
                if (bigFreqArr[i] > 0) {
                    _biggest = _biggest * 10 + i;
                    bigFreqArr[i]--;
                    break;
                } else {}
            }
       }
    }
    public void smallest() { 
        for (int j = 0; j < 4; j++) { // 1 loop for each digit
            for (int i = 0; i < 10; i++) {
                if (smallFreqArr[i] > 0) {
                    _smallest = _smallest * 10 + i;
                    smallFreqArr[i]--;
                    break;
                } else {}
            }
        }
    }
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your 4 digit number: ");
        Number number = new Number(scanner.nextInt());

        if (number.Checker(number._digit)) {
            number.freqList(number._digit);
            number.biggest();
            number.smallest();
            System.out.println("Biggest number: " + number._biggest);
            System.out.println("Smallest number: " + number._smallest);
        } else {}
    }
}
