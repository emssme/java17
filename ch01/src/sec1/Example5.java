package sec1;

public class Example5 {
    public static void main(String[] args) {
        byte b1 = 104;
        //byte b2 = -129; 해당 표현범위보다 작음(언더플로우)
        //byte b3 = 128; 해당 표현범위보다 큼(오버플로우)

        char c1 = 'k'; //2byte
        //char c2 = -1;
        //char c3 = 655350;

        short d1 = 13153;
        //short d2 = -32769;
        //short d3 = +32768

        int e1 = 1616161;
        //int e2 = -9223372036854775809;
        //int e3 = +92233720368547758070;

        long f1 = 113113513;
        //long f2 = -13.354130000000000;
        //long f3 = +13.13135131355

        double g1 = -6.6161664111;//double underflow, overflow 찾아보기
        //double g2 = 0
        }
}

