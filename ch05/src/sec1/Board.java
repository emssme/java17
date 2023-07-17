package sec1;

public class Board {
    private int no;
    private String title;
    private String content;
    private String resdate;
    private int viewcount;


    public void Qna(){ }
    public void Qna(int no) {this.no = no;}

    public void Qna(int no, String title) {
        this.no = no;
        this.title = title;
    }

    public Board() { }

    public Board(int no) {this.no = no;}

    public Board(int no, String title) {
        this.no = no;
        this.title = title;
    }

    public Board(int no, String title, String content) {
        this.no = no;
        this.title = title;
        this.content = content;
    }

    public Board(int no, String title, String content, String resdate) {
        this.no = no;
        this.title = title;
        this.content = content;
        this.resdate = resdate;
    }

    public Board(int no, String title, String content, String resdate, int viewcount) {
        this.no = no;
        this.title = title;
        this.content = content;
        this.resdate = resdate;
        this.viewcount = viewcount;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getResdate() {
        return resdate;
    }

    public void setResdate(String resdate) {
        this.resdate = resdate;
    }

    public int getViewcount() {
        return viewcount;
    }

    public void setViewcount(int viewcount) {
        this.viewcount = viewcount;
    }
}
