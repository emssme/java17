package sec2;

public enum Week {
    Monday("월요일","月"),
    Tuesday("화요일","火"),
    Wednesday("수요일","水"),
    Thursday("목요일","木"),
    Friday("금요일","金"),
    Saturday("토요일","土"),
    Sunday("일요일","日");
    public String korean;
    public String chinese;
    Week(String korean, String chinese){
        this.korean = korean;
        this.chinese = chinese;
    }
}
