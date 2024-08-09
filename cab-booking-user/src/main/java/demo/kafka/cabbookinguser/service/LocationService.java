package demo.kafka.cabbookinguser.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class LocationService {

    @KafkaListener(topics = "cab-location", groupId = "cab-1001")
    public void cablocation(String location) {
        System.out.println("Current Location: " + location);
    }

}
