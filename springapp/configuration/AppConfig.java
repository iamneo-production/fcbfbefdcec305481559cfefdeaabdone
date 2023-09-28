import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
        public Student student() {
                Student student = new Student();
                        student.setStudentId(1); // Set the student ID as per your requirement
                                student.setFirstName("John"); // Set the first name as per your requirement
                                        student.setLastName("Doe"); // Set the last name as per your requirement
                                                return student;
                                                    }
                                                    }
                                                    