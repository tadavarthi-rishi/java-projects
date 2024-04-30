package school.management.system;

public class student {

    private int id;
    private String name;
    private int grade;
    private int feespaid;
    private int feestotal;

    public student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feespaid = 0;
        this.feestotal = 30000;
    }

    public void setgrade(int grade) {
        this.grade = grade;
    }

    public void updatefeespaid(int fees) {
        this.feespaid += fees;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeespaid() {
        return feespaid;
    }

    public int getFeestotal() {
        return feestotal;
    }
}
