package slm.abdennour.springcore.config;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.SimpleThreadScope;
import slm.abdennour.springcore.Cv;

@Configuration
public class ApplicationConfig {

    @Bean
    public Cv cvSimple() {
        return new Cv();
    }

    @Bean
    public CustomScopeConfigurer customScopeConfigurer() {
        CustomScopeConfigurer customScopeConfigurer = new CustomScopeConfigurer();
        Map<String, Object> scopes = new HashMap<String, Object>();
        scopes.put("thread", new SimpleThreadScope());
        customScopeConfigurer.setScopes(scopes);
        return customScopeConfigurer;
    }

    @Bean
    @Scope("thread")
    public Cv cvThread() {
        return new Cv();
    }

}
