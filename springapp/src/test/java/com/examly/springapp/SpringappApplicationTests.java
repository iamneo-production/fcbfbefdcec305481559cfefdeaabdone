import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringappApplicationTests {
    public static void main(String[] args) {
            // Load the Spring XML configuration file
                    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

                            // Retrieve the Student bean from the container
                                    Student student = (Student) context.getBean("student");

                                            // Access and print student details
                                                    System.out.println("Student ID: " + student.getStudentId());
                                                            System.out.println("First Name: " + student.getFirstName());
                                                                    System.out.println("Last Name: " + student.getLastName());
                                                                        }
                                                                        }
