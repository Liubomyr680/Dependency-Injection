package liubomyr.springframework.DependencyInjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nService")                     // if we have two or more same Services, we should set a @Profile annotation, and than in application.properties we enter which bean we want to use
public class I18nEnglishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - ENG";
    }
}
