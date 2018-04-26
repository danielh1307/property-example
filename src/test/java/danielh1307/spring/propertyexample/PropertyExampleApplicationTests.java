package danielh1307.spring.propertyexample;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.IfProfileValue;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

import static org.springframework.core.env.AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class PropertyExampleApplicationTests {

	@Autowired
	private AnyService anyService;

	@Test
	void testAnyService_defaultConfiguration_isNotNull() {
		assertThat(anyService, is(notNullValue()));
	}

	/* Tests are only working for default profile */

	@Test
	@IfProfileValue(name = ACTIVE_PROFILES_PROPERTY_NAME, value = "default")
	void testGetSource_defaultConfiguration_hasCorrectValue() {
		assertThat(anyService.getSource(), equalTo("I am from application.properties"));
	}

	@Test
	@IfProfileValue(name = ACTIVE_PROFILES_PROPERTY_NAME, value = "default")
	void testGetOther_defaultConfiguration_hasCorrectValue() {
		assertThat(anyService.getOther(), equalTo("I am from other.properties"));
	}

	/* Tests are only working for dev profile */

	@Test
	@IfProfileValue(name = ACTIVE_PROFILES_PROPERTY_NAME, value = "default")
	void testGetSource_profileDev_hasCorrectValue() {
		assertThat(anyService.getSource(), equalTo("I am from application-dev.properties"));
	}

	@Test
	@IfProfileValue(name = ACTIVE_PROFILES_PROPERTY_NAME, value = "dev")
	void testGetOther_profileDev_hasCorrectValue() {
		assertThat(anyService.getOther(), equalTo("I am from other-dev.properties"));
	}

}
