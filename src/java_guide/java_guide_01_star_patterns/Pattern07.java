package java_guide.java_guide_01_star_patterns;

public class Pattern07 {

    public static void printPattern01(int n) {
        /**
         * Java program to print below patterns
         * Pattern 1 - >
                        *
                        **
                        ***
                        ****
         */
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void printPattern02(int n) {
        /**
         * Java program to print below patterns
                        ****
                        ***
                        **
                        *
         */

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printPattern03(int n) {
        /**
         * Java program to print below patterns
                        *
                        **
                        ***
                        ****
                        ****
                        ***
                        **
                        *
         */
        for (int i = 1; i <= 2 * n; i++) {
            int stars = i;
            if (i > n) {
                stars = 2 * n + 1 - i;
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }

    public static void printPattern04(int n) {
        /**
         * Java program to print below patterns
                        *
                        **
                        ***
                        ****
                        ***
                        **
                        *
         */
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;
            if (i > n) {
                stars = 2 * n - i;
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printPattern05(int n) {
        /**
         * * Java program to print below patterns
                        *
                        **
                        ***
                        ****
         * 
         */
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printPattern06(int n) {
        /**
         * * Java program to print below patterns
                        ****
                        ***
                        **
                        *
                        * 
         * 
         */
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printPattern07(int n) {
        /**
         * * Java program to print below patterns
                        *
                        **
                        ***
                        ****
                        ***
                        **
                        *
         * 
         */
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;
            if (i > n) {
                stars = 2 * n - i;
            }
            // spaces
            for (int j = 0; j < n - stars; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void printPattern08(int n) {
        /**
         * * Java program to print below patterns
                           * 
                          ***
                         *****
                        *******
         * 
         */
        for (int i = 0; i < n; i++) {
            // spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    public static void printPattern09(int n) {
        /**
         * * Java program to print below patterns
         * 
                            *******
                             *****
                              ***
                               *
        * 
        */
        for (int i = 0; i < n; i++) {
            // spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 0; j < 2 * (n - i) - 1; j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    public static void printPattern10(int n) {
        /**
         * * Java program to print below patterns
                 *   
                ***  
               ***** 
              *******
              *******
               ***** 
                ***  
                 *   
         * 
         */
        printPattern08(n);
        printPattern09(n);
    }

    public static void printPattern11(int n) {
        /**
         * * Java program to print below patterns
                        ********
                        *** ***
                        **   **
                        *     *
         */
        int initSpaces = 0;
        for (int i = 0; i < n; i++) {
            // stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 0; j < initSpaces; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            initSpaces += 2;
            System.out.println();
        }
    }

    public static void printPattern12(int n) {
        /**
         * * Java program to print below patterns
                        *      *
                        **    **
                        ***  ***
                        ********
         */
        int initSpaces = 8;
        for (int i = 0; i <= n; i++) {
            // stars
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 0; j < initSpaces; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            initSpaces -= 2;
            System.out.println();
        }

    }

    public static void printPattern13(int n) {
        /**
         * * Java program to print below patterns
                            ********
                            ***  ***
                            **    **
                            *      *
                            *      *
                            **    **
                            ***  ***
                            ********
        
         */
        printPattern11(n);
        printPattern12(n);
    }

    public static void printPattern14(int n) {
        /**
         * * Java program to print below patterns
                        *      *
                        **    **
                        ***  ***
                        ********
                        ********
                        ***  ***
                        **    **
                        *      *
         */
        printPattern12(n);
        printPattern11(n);
    }

    public static void printPattern15(int n) {
        /**
         * * Java program to print below patterns
                        ****
                        *  *
                        *  *
                        ****
         */
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
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
        printPattern08(4);
        System.out.println(" ");
        printPattern09(4);
        System.out.println(" ");
        printPattern10(4);
        System.out.println(" ");
        printPattern11(4);
        System.out.println(" ");
        printPattern12(4);
        System.out.println(" ");
        printPattern13(4);
        System.out.println(" ");
        printPattern14(4);
        System.out.println(" ");
        printPattern15(4);
    }

}
