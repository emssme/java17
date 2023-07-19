package sec1;
//쓰레드: 하나의 작업(Task) 또는 하나의 실행 프로그램(Process)
//Multi Thread: 여러개의 쓰레드를 동시에 진행 또는 실행 할 수 있도록 한 실행환경
//Op-code(명령어코드) | Operand(데이터가 있는 주소) => Stack(스택)에 보관되어 처리
//여러 일을 처리하려면 일의 순서를 정해야 함 -> 스케쥴링
//생성(Create) -> 실행대기(Wait) -> 실행(Run) -> 선점대기(Blocking) -> 재실행(Wake Up) -> 종료(Complete)
public class Thread1 {
    public static void main(String[] args) {
        int[] arr = {95, 60, 85, 70, 90, 80};
        String [] str = {"김기태", "이슬비", "박나연", "박진권", "오태훈", "신승원"};
        for(int i=0; i<arr.length; i++){
            System.out.println("이름: "+str[i]); //전체 Single 쓰레드는 6개
            try {
                Thread.sleep(1000); //대기 시간 부여하고, 지정한 밀리초만큼 Wait이 되며, 그 시간이 지나면 자동으로 Wake Up 된다.
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
