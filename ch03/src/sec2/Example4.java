package sec2;

public class Example4 {
    public static void main(String[] args) {
        //중첩for문

         /*
        1   2   3   4   5   6   7
        8   9   10  11  12  13  14
        15  16  17  18  19  20  21
        22  23  24  25  26  27  28
        29  30  31
         */

        for (int a = 1; a < 6; a++) {
            for (int b = 1; b <= 7; b++) {

                if (7 * (a - 1) + b >= 32) {
                    break;
                } else {
                    System.out.print(7 * (a - 1) + b + "\t");
                }

            }
            System.out.print("\n");
        }

        /*
        강사님

        int cnt =0;
        for(int i=1; i<6;i++){
            for(int j=1;j<7;j++){
                cnt++;
                if(cnt>31) {
                    break;
                }
                System.out.printf("%e2d\t", cnt);
            }
            System.out.print("\n");
        }
        */




        /*
         *
         **
         ***
         ****
         *****
         */

        for (int a = 1; a < 6; a++) {
            for (int b = 1; b <= a; b++) {

                System.out.print("*");
            }
            System.out.print("\n");
        }



        /*
         *****
         ****
         ***
         **
         *
         */

        for (int a = 5; a > 0; a--) {
            for (int b = 1; b <= a; b++) {

                System.out.print("*");
            }
            System.out.print("\n");
        }

        /*
        강사님

        System.out.println();
        for(int i=1; i<=5;i++){
            for(int j = 1; j<=6-i; i++) {
                System.out.print("*");
            System.out.print("\n");
            }
        }
        */



        /*
        구구단
        2X1=2   3X1=3   ....... 9X1=9
        ........................9X2=18
        ..............................
        2X9=18  3X9=27  ....... 9X9=81
         */

        for (int a = 1; a < 10; a++) {
            for (int b = 2; b <10; b++) {

                System.out.printf("%d*%d=%2d    ", b,a,a*b);
            }
            System.out.printf("\n");
        }
        //강사님
        for(int i=1; i<=9;i++){
            for(int j=2;j<=9;j++){
                System.out.printf("%d*%d=%2d\t    ", j,i,j*i);
            }
            System.out.println();
        }
    }
}


