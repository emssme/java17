package sec3;
class Student{
    public int no;
    public String name;
    public Student() { }
    public Student(int no, String name) { this.no = no;this.name = name; }
}
public class SystemEx2 {
    public static void main(String[] args) {
        Student st1;
        st1 = new Student(1, "김예은");    //쓰레기
        st1 = null;
        st1 = new Student();    //쓰레기
        System.out.println(st1.no+"\t"+ st1.name);
        System.gc();    //가비지 콜렉션(Garbage Collection): 더 이상 사용하지 않는 메모리
    }
}
