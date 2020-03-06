package liubomyr.springframework.DependencyInjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("SP")
@Service("i18nService")
public class I18nSpainGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hola Mondo - SP";
    }
}
