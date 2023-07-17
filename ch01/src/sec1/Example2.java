package sec1;

public class Example2 {
    public static void main(String[] args) {
        boolean a = true; //논리형 변수 0=false, 1=true 1byte
        byte b = 127; //바이트 변수, 8bit=1byte를 저장할 수 있음,
        // -128~127, 129는 overflow, -129는 underflow라 오류
        char c = 'k'; //문자 변수, 2byte 초기화 할때"" 쓰면 안되고 '한글자'써야함
        short d = 32767; //반정도정수(일반정수, 단일정수): 2byte, -32768~32767
        int e = 785367890; //단정도정수, 4byte
        long f = 785367800L; //배정도정수, 4byte -> 8byte(끝에 L붙이면)
        //348670.2478 => + 10의 6승 X 3486702478
        float g = 3.141592f; //단정도실수, 4byte, f=실수 표시, 아주 큰 수나 작은수(정밀성요구시)
        double h = 3.141592; //배정도실수, 8byte, 아주 큰 수나 작은수(정밀성 요구시)
        double i = 3.1415920000000000000000000000d;

        int j = 8;
        int k = j +20;
        //표현범위: -2의 n(bit)-1승 ~ 2의 n-1승 -1
        //primitive type 변수는 표현범위가 있으며, 표현범위를 벗어나면, 오류
        //반드시, 초기화되어야 한다.
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        System.out.println("d="+d);
        System.out.println("e="+e);
        System.out.println("f="+f);
        System.out.println("g="+g);
        System.out.println("h="+h);
        System.out.println("i="+i);
        System.out.println("j="+j);
        System.out.println("k="+k);
    }
}
