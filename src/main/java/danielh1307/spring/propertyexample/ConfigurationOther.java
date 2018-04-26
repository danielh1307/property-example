package danielh1307.spring.propertyexample;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * We need this class to configure other.properties in default profile (application.properties works by default).
 *
 */

@Configuration
@PropertySource("classpath:other.properties")
public class ConfigurationOther {
}
