package sec1;

class Sehun {
    private int no;
    private String data;
    public Sehun() {this(1);}
    public Sehun(int no) {this(no, "100");}
    public Sehun(int no, String data) {this.no = no; this.data = data;}
    public int getNo() {return no;}
    public void setNo(int no) {this.no = no;}
    public String getData() {return data;}
    public void setData(String data) {this.data = data;}
}
class Chanwon { //생성자에 의한 접근
    private int seq;
    private int data;
    public Chanwon(){ this(1);}
    public Chanwon(int seq){this(seq,100);}
    public Chanwon(int seq, int data){this.seq = seq; this.data=data;}
    public int getSeq() {return seq;}
    public void setSeq(int seq) {this.seq = seq;}
    public int getData() {return data;}
    public void setData(int data) {this.data = data;}
}

public class Chunjae {
    //멤버 필드 = 변수, 상수
    private int no;
    protected int point;
    int partNo;
    public String name;
    public final static double PI = 3.141592;// 상수

    public void setValue(int no){//private 멤버는 클래스 내부에서만 this로 접근가능
        this.no = no; }


}
