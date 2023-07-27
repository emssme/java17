package sec1;
//하나의 메소드만 기술 가능
@FunctionalInterface
interface MyLambda2{
    void  print(int x);
}
public class LambdaEx2 {
    public static void main(String[] args) {
        MyLambda1 lam1 = () -> {
            System.out.println("1호선 최악~!");
        };
        lam1.print();

        MyLambda2 lam2 = (x) -> {
            System.out.println("제곱 결과: "+(x*x));
        };
        lam2.print(1004);
    }
}
