package dio.restApiBootcampBradesco;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class AppStartup {

    @Autowired
    private Environment env;

    @PostConstruct
    public void showActiveProfiles() {
        System.out.println(">>> Perfis ativos: " + Arrays.toString(env.getActiveProfiles()));
    }
}
