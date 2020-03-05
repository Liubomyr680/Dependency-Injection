package liubomyr.springframework.DependencyInjection.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary            //this annotation we used where we could have one or more beans of the same type, and we say use this as a Primary
@Service
public class PrimaryGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - From the PRIMARY Bean";
    }
}
