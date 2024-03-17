package top.ninng.domain;

/**
 * 表 account
 */
public class Account {

    private Integer id;
    private Integer studentId;
    private Double balance;
    private Student student;

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", studentId=" + studentId +
                ", balance=" + balance +
                ", student=" + student +
                '}';
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }
}
