import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.examly.springapp.model.*;
@Configuration
public class AppConfig {
    @Bean
        public Student student() {
                Student student = new Student();
                        student.setStudentId(1);
                                student.setFirstName("John");
                                        student.setLastName("Doe");
                                                return student;
                                                    }
                                                    }
                                                    