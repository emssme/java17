package sec1;

import java.util.Scanner;

public class Exmaple3 {
    public static void main(String[] args) {
        //키보드로 학번과 세 과목 점수를 입력받아
        //총점, 평균, 학점, 판정, 등급 등을 계산하여 출력하도록 하시오.
        //tot(총점), avg(평균), hak(학점), pon(판정), grd(등급)
        //총점 = 전산 + PG + OA
        //평균은 세 과목의 점수의 총점을 3으로 나눈 실수
        //학점은 평균이 96이상 A+, 93이상 A0, 90이상 A-
        //86이상 B+, 83이상 B0, 80이상 B-
        //76이상 C+, 73이상 C0, 70이상 C-
        //66이상 D+, 63이상 D0, 60이상 D-
        //나머지는 F
        //판정은 평균이 80이상이면서, 세 과목 모두 70이상이면, "합격", 아니면 "불합격"
        //등급은 평균을 20으로 나눈 값으로 하되, 5이면 5등급, 4이면 4등급, 3이면 3등급, 2이면 2등급, 1이면 1등급
        //출력형식
        //학번     전산점수     PG점수    OA점수    총점    평균    학점     판정    등급
        //XXX      XXX        XXX      XXX       XXX     XX.XX   XX      XX     X등급

        Scanner sc = new Scanner(System.in);

        System.out.print("학번 입력: ");
        int number = sc.nextInt();
        System.out.print("전산점수 입력: ");
        int js = sc.nextInt();
        System.out.print("PG점수 입력: ");
        int pg = sc.nextInt();
        System.out.print("OA점수 입력: ");
        int oa = sc.nextInt();

        System.out.printf("\n학번: %d, 전산: %d, PG: %d, OA: %d \n", number, js, pg, oa );

        int tot = js + pg + oa;
        System.out.print("총점: " +tot);

        float avg = (js + pg + oa) / 3.0f;
        System.out.print("평균: "+avg);

        if (avg>=96) System.out.print("학점: A+");
        if (avg<96 && avg>=93) System.out.print("학점: A");
        if (avg<93 && avg>=90) System.out.print("학점: A-");
        if (avg<90 && avg>=86) System.out.print("학점: B+");
        if (avg<86 && avg>=83) System.out.print("학점: B");
        if (avg<83 && avg>=80) System.out.print("학점: B-");
        if (avg<80 && avg>=76) System.out.print("학점: C+");
        if (avg<76 && avg>=73) System.out.print("학점: C");
        if (avg<73 && avg>=70) System.out.print("학점: C-");
        if (avg<70 && avg>=66) System.out.print("학점: D+");
        if (avg<66 && avg>=63) System.out.print("학점: D");
        if (avg<63 && avg>=60) System.out.print("학점: D-");
        if (avg<60) System.out.print("학점: F");

        if (avg>=80 && tot>=70) {
            System.out.print("판정: 합격");
        } else {
            System.out.print("판정: 불합격");
        }

        float grd = avg / 20;
        String grade = "";

        switch ((int)grd){
            case 10:
            case 9:
            case 8:
            case 7:
            case 6:
            case 5:
                grade = "5등급";
                break;
            case 4:
                grade = "4등급";
                break;
            case 3:
                grade = "3등급";
                break;
            case 2:
                grade = "2등급";
                break;
            case 1:
                grade = "1등급";
                break;

        }
        System.out.print(grade);





    }
}
