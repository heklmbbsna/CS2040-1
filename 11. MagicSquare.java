import java.util.Scanner;

class MagicSquare {
    private int n;
    private int[][] square;

    public MagicSquare(int N) {
        if (N % 2 == 0) {
            System.out.println("N must be odd.");
        } else {
            this.n = N;
            this.square = new int[N][N];
        }
    }

    public boolean downCheck(int i, int j) {
        int newJ = (j + 1) % this.n;
        return  this.square[i][newJ] == 0;
    }
    public boolean diagCheck(int i, int j) {
        int newI = (i + 1) % this.n;
        int newJ = (j - 1 + this.n) % this.n;
        return this.square[newI][newJ] == 0;
    }

    public void fillNum(int i, int j, int currNum) {
        if (currNum > Math.pow(this.n, 2)) {
        } else {
            this.square[i][j] = currNum;
            if (diagCheck(i, j)) {
                int newI = (i + 1) % this.n;
                int newJ = (j - 1 + this.n) % this.n;
                fillNum(newI, newJ, currNum + 1);
            } else if (downCheck(i, j)) {
                int newJ = (j + 1) % this.n;
                fillNum(i, newJ, currNum + 1);
            } else {
                // done
            } 
        }
    }
    public void printArr() {
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.n; j++) {
                if (j == this.n - 1) {
                    System.out.println(this.square[j][i] + " ");
                } else {
                    System.out.print(this.square[j][i] + " ");
                }
            }
        } 
    }
}

class Solver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        MagicSquare solver = new MagicSquare(N);

        int mid = N / 2;
        solver.fillNum(mid, 0, 1);
        solver.printArr();
    }
}
