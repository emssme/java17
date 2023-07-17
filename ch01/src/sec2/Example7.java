package sec2;

public class Example7 {
    public static void main(String[] args) {
        //정수: byte(1) < char(2),short(2) < int(4) < long(8)
        //실수: float(4) < double(8)

        //자동형변환(auto casting): 해당 타입에서 크기가 같거나 더 큰 타입에 대입되었을때 발생
        int data1 = 1004;
        float data2 = data1; //정수를 float로 실수로 변환
        System.out.println("data1="+data1);
        System.out.println("data2="+data2);

        char data3 = '김';
        int data4 = data3;
        System.out.println("data3="+data3);
        System.out.println("data4="+data4); // 유니코드 번호 - K 입력 시 컴퓨터프로세스가 75번 들어감

        //강제형변환(force casting): 형변환연산자를 활용하는 형변환 -> 가능하지만 쓰지않는게 좋음(신빙성이 떨어짐)

        int data5 = 2048;
        byte data6 = (byte) data5; //(byte) => 형변환 연산자
        //byte data6 = data5; =>크기가 달라서 안됨
        System.out.println("data5="+data5);
        System.out.println("data6="+data6);
    }
}
