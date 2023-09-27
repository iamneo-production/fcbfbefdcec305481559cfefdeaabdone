@Configuration
public class AppConfig {

    @Bean
        public Student student() {
                return new Student(1, "John", "Doe");
                    }
                    }
                    