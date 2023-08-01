public class Main {
    public static void main(String[] args) {
        pattern1(5);
        System.out.println();
        pattern2(5);
        System.out.println();
        pattern3(5);
        System.out.println();
        pattern4(5);
        System.out.println();
        pattern5(5);
        System.out.println();
        pattern6(5);
        System.out.println();
        pattern7(5);
    }

    static void pattern1(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n; col++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + "\t");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {

        for (int row = 1; row <= 2*n - 1; row++) {
                for (int col = 1; row <= n && col <= row; col++) {
                    System.out.print("*\t");
                }

                for (int col = row; row > n && col <= 2*n - 1; col++) {
                    System.out.print("*\t");
                }

            System.out.println();
        }
    }

    static void pattern6(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n - row - 1; col++) {
                System.out.print("\t");
            }

            for (int col = n - row - 1; col < n; col++) {
                System.out.print("*\t");
            }

            System.out.println();
        }
    }

    static void pattern7(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print("\t");
            }

            for (int col = row; col < n; col++) {
                System.out.print("*\t");
            }

            System.out.println();
        }
    }
}
