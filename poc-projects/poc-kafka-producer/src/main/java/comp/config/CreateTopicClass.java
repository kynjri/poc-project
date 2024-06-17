package comp.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CreateTopicClass {
    @Bean
    public NewTopic createTopic() {
        return new NewTopic("kynjri_1", 4, (short) 1);
    }
}
