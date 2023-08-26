import java.lang.reflect.Array;
import java.util.Arrays;

public class Teacher extends User{
    private String nickName;
    private String status; //// например: Professor, Lecturer, Tutor, Assistant.
    private String subjects[] = new String[10];
    private int sizeOfSubjects = 0;
    public  Teacher(){

    }

    public Teacher(int id, String login, String password, String nickName, String status, String[] subjects) {
        super(id, login, password);
        this.nickName = nickName;
        this.status = status;
        this.subjects = subjects;
    }
    public Teacher(String nickName, String status) {
        this.nickName = nickName;
        this.status = status;
    }
    void addSubject(String subject){
        if(sizeOfSubjects>9){
            System.out.println("List is full");
        }
        else{
            subjects[sizeOfSubjects] = subject;
            sizeOfSubjects++;
        }

    }

    @Override
    String getUserData() {
        return getId() + " " + getLogin() + " " + getPassword() + " "+ nickName + " " + status + " " + Arrays.toString(subjects);
    }

    public String[] getSubjects() {
        return subjects;
    }

    public int getSizeOfSubjects() {
        return sizeOfSubjects;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
