import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
            // Initialize the Spring ApplicationContext
                    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

                            // Retrieve the Student bean from the container
                                    Student student = context.getBean(Student.class);

                                            // Access and display student details
                                                    System.out.println("Student ID: " + student.getStudentId());
                                                            System.out.println("First Name: " + student.getFirstName());
                                                                    System.out.println("Last Name: " + student.getLastName());
                                                                        }
                                                                        }
                                                                        