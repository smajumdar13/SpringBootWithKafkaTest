package demo.kafka.cabbookingdriver.config;

import demo.kafka.cabbookingdriver.constants.Constants;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {



    @Bean
    public NewTopic topic() {
        return TopicBuilder
                .name(Constants.CAB_LOCATION)
                .build();
    }


}
