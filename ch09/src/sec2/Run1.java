package sec2;
//Runnable: 실행가능한 객체를 만들기 위한 인터페이스 -> 사용자 상속받아 새로운 클래스를 생상하여 활용
class SBRunnable implements Runnable {
    @Override
    public void run() {
        String[] str = {"오태훈","신예은","김현경","박진원","김보경"};
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //출석을 부르기
        for(String name:str){
            System.out.println("출석 체크: "+name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class SCRunnable implements Runnable {
    @Override
    public void run() {
        String[] str = {"한선","이소윤","박나연","박진원","김기태"};
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //퇴실체크하기
        for(String name:str){
            System.out.println("퇴실 체크: "+name);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Run1 {
    public static void main(String[] args) {
        Runnable sbRun1; //선언부
        sbRun1 = new SBRunnable(); //생성부
        Thread t1 = new Thread(sbRun1);
        t1.start();

        sbRun1 = new SCRunnable();
        Thread t2 = new Thread(sbRun1);
        t2.start();

    }
}
