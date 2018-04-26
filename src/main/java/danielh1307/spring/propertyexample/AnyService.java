package danielh1307.spring.propertyexample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AnyService {

    @Value("${source:unknown}") // if "source" is not set, "unknown" is returned
    private String source;

    @Value("${global}")
    private String global;

    // the source of this property is configured in ConfigurationOther
    @Value("${other}") // if "otherName" is not set, exception occurs during startup
    private String other;

    public String getSource() {
        return source;
    }

    public String getGlobal() {
        return global;
    }

    public String getOther() {
        return other;
    }
}
