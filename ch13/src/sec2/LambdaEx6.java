package sec2;
@FunctionalInterface
interface MyLambda6<T, Q> {
    Q calc(T x, T y);
}
public class LambdaEx6 {
    public static void main(String[] args) {
        //더하기, 빼기, 곱하기, 나누기 구현체 작성

        MyLambda6<Integer, Integer> plus = (x,y) -> {
            return x+y;
        };
        MyLambda6<Integer, Integer> minus = (x,y) -> {
            return x-y;
        };
        MyLambda6<Integer, Integer> multi = (x,y) -> {
            return x*y;
        };
        MyLambda6<Integer, Integer> div = (x,y) -> {
            return x/y;
        };
        MyLambda6<Integer, Integer> mod = (x,y) -> {
            return x%y;
        };
        System.out.println("더한 결과: "+(plus.calc(30,60)));
        System.out.println("뺀 결과: "+(minus.calc(30,60)));
        System.out.println("곱한 결과: "+(multi.calc(30,60)));
        System.out.println("나눈 결과: "+(div.calc(30,60)));
        System.out.println("나머지: "+(mod.calc(30,60)));
    }
}
