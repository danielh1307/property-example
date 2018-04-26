package danielh1307.spring.propertyexample;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/**
 * We need this class to configure other-dev.properties in dev profile (application.properties works by default).
 *
 */

@Configuration
@Profile("dev")
@PropertySource("classpath:other-dev.properties")
public class ConfigurationOtherDev {
}
