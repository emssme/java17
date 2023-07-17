package sec1;

public class Example1 {
    public static void main(String[] args) {
        int a; //변수(기억장소의 이름) 선언
        a = 0; //변수 초기화(a라는 기억장소 안에 0을 저장해라)
        int b=0; //변수 선언과 초기화(=사이 붙여도 되고 띄워도 됨)
        int i=0, j=0, k=0; //한 꺼번에 선언과 초기화(변수 타입 같아야함)
        a = a+ 5; //a에 저장되어 있는 0과 5를 더해서 다시 a에 저장을 해라
        i = a + 20;
        j = a - 20; //한줄에 써도 됨
        System.out.println("a="+a);
        System.out.print("i="+i+"\n"); //"\n" 줄바꿈
        System.out.printf("j=%d",j); //println: 한줄 띄우고 출력, print: 이어서 출력

    }
}
