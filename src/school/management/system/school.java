package school.management.system;

import java.util.List;

public class school {

    private List<Teacher> teacher;
    private List<student> student;
    private int totalMoneyEarned;
    private int totalMoneySpent;

    public school(List<Teacher> teacher, List<school.management.system.student> student) {
        this.teacher = teacher;
        this.student = student;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;

    }

    public List<Teacher> getTeacher() {
        return teacher;
    }

    public void setTeacher(List<Teacher> teacher) {
        this.teacher = teacher;
    }

    public List<school.management.system.student> getStudent() {
        return student;
    }

    public void setStudent(List<school.management.system.student> student) {
        this.student = student;
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public void setTotalMoneyEarned(int totalMoneyEarned) {
        this.totalMoneyEarned = totalMoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public void setTotalMoneySpent(int totalMoneySpent) {
        this.totalMoneySpent = totalMoneySpent;
    }
}

}
