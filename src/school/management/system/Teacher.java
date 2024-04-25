package school.management.system;

/**
this class is responsible for keeping the track of teacher's name,id, salary
 **/
public class Teacher {
    private int id;
    private String name;
    private int salary;


    /**
     * create a new teacher object
     * @param id id for the teacher
     * @param name name of the teacher
     * @param salary salary of the teacher
     */
    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    /**
     *
     * @return the id for current teacher
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return salary of the teacher
     */
    public int getSalary(){
        return salary;
    }

    /**
     *
     * @return the name of the teacher
     */
    public String getName() {
        return name;
    }






}
