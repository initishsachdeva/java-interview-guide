package java_guide.java_guide_02_number_pattern;

public class NumberPattern08 {

    public static void printPattern01(int n) {
        /**
         * Java program to print below patterns
         * Pattern 1 - >
                        1
                        12
                        123 
                        1234
         */
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

    public static void printPattern02(int n) {
        /**
         * Java program to print below patterns
                        1
                        23
                        456
                        78910
         */
        int count = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <=i; j++) {
                count = count + 1;
                System.out.print(count);
            }
            System.out.println();
        }
    }

    public static void printPattern03(int n) {
        /**
         * Java program to print below patterns
                        1
                        22
                        333
                        4444
         */
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(i);
            }
            System.out.println();

        }

    }

    public static void printPattern04(int n) {
        /**
         * Java program to print below patterns
                        1
                        2 1
                        3 2 1
                        4 3  2 1
         */
        for (int i = 1; i <= n; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();    
    }
}

    public static void printPattern05(int n) {
        /**
         * * Java program to print below patterns
                    1
                    1 2 1
                    1 2 3 2 1
                    1 2 3 4 3 2 1
         * 
         */
        for(int i=1;i<=n;i++){
            // increasing part
            for(int j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            // decreasing part
            for(int j=i-1;j>=1;j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void printPattern06(int n) {
        /**
         * * Java program to print below patterns
                        4 3 2 1
                        4 3 2
                        4 3
                        4
         * 
         */
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print(j);
            }
            System.out.println();
        }
       
    }

    public static void printPattern07(int n) {
        /**
         * * Java program to print below patterns
                          1
                          4 5 6
                          2 3
                          7 8 9 10
         * 
         */
        int a = 1;
        int t = 4;
        int oddCount = 1;    // length for 1st odd row = 1, next odd = 2, ...
        int evenCount = 1;  // length for 1st even row = 3, next even = 4, ...


        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                int len = oddCount++;
                for (int j = 0; j < len; j++) {
                    System.out.print(a++ + " ");
                }
            } else {
                int len = evenCount++ + 2;
                for (int j = 0; j < len; j++) {
                    System.out.print(t++ + " ");
                }
            }
            System.out.println();
        }
    }

    public static void printPattern08(int n) {
        /**
         * * Java program to print below patterns
                        12345
                        1234
                        123
                        12
                        1
         * 
         */
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }

    public static void printPattern09(int n) {
        /**
         * * Java program to print below patterns
         * 
                            1
                            0 1
                            1 0 1
                            0 1 0 1
                            1 0 1 0 1 
        * 
        */
       int start =1;
        for (int i = 0; i < n; i++) {
            if(i% 2 == 0){
                start =1;
            } else {
                start =0;
            }
            for(int j=0; j<=i; j++){
                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println();
        }        
    }

    public static void printPattern10(int n) {
        /**
         * * Java program to print below patterns
                        1      1
                        12    12
                        123  123
                        12341234
         * 
         */
        int initSpaces = 6;
        for (int i = 1; i <= n; i++) {
            // numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // spaces
            for (int j = 1; j <= initSpaces; j++) {
                System.out.print(" ");
            }
            // numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            initSpaces -= 2;
            System.out.println();
        }
       
    }

    public static void printPattern11(int n) {
        /**
         * * Java program to print below patterns
                        1      1
                        12    21
                        123  321
                        12344321
         */
        int initSpaces = 6;
        for (int i = 1; i <= n; i++) {
            // numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // spaces
            for (int j = 1; j <= initSpaces; j++) {
                System.out.print(" ");
            }
            // numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            initSpaces -= 2;
            System.out.println();
        }
    }

    public static void printPattern12(int n) {
        /**
         * * Java program to print below patterns
                        4444444
                        4333334
                        4322234
                        4321234
                        4322234
                        4333334
                        4444444
         */
        for(int i=0; i<2*n-1;i++){
            for(int j =0; j<2*n-1;j++){
                int top = i;
                int left = j;
                int right = (2*n -2) - j;
                int bottom = (2*n -2) - i;
                int min = Math.min(Math.min(top, bottom), Math.min(left, right));
                System.out.print(n - min);
            }
            System.out.println();
        }
    }

    public static void printPattern13(int n) {
        /**
         * * Java program to print below patterns
                            A
                            AB
                            ABC
                            ABCD
                            ABCDE
         */
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                char ch = (char)('A' + j);
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    public static void printPattern14(int n) {
        /**
         * * Java program to print below patterns
                        ABCDE
                        ABCD
                        ABC
                        AB
                        A
         */
        for(int i=1;i<=n;i++){
            for(int j=0;j<n-i+1;j++){
                char ch = (char)('A' + j);
                System.out.print(ch);
            }
            System.out.println();
        }
        
    }

    public static void printPattern15(int n) {
        /**
         * * Java program to print below patterns
                        A
                        B B
                        C C C
                        D D D D
                        E E E E E
         */
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                char ch = (char)('A' + i);
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern01(4);
        System.out.println(" ");
        printPattern02(4);
        System.out.println(" ");
        printPattern03(4);
        System.out.println(" ");
        printPattern04(4);
        System.out.println(" ");
        printPattern05(4);
        System.out.println(" ");
        printPattern06(4);
        System.out.println(" ");
        printPattern07(4);
        System.out.println(" ");
        printPattern08(5);
        System.out.println(" ");
        printPattern09(5);
        System.out.println(" ");
        printPattern10(4);
        System.out.println(" ");
        printPattern11(4);
        System.out.println(" ");
        printPattern12(4);
        System.out.println(" ");
        printPattern13(5);
        System.out.println(" ");
        printPattern14(5);
        System.out.println(" ");
        printPattern15(5);
    }

}
