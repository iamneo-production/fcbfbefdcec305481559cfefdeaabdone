public class Student {

    private int stdentId;
    private String firstName;
    private String lastName;

    public Student() {
    }

    public Student(int stdentId, String firstName, String lastName) {
        this.stdentId = stdentId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getStdentId() {
        return stdentId;
    }

    public void setStdentId(int stdentId) {
        this.stdentId = stdentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stdentId=" + stdentId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

public class StudentMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        Student student = applicationContext.getBean(Student.class);

        System.out.println(student);
    }
}
