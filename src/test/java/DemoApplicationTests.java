import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.batch.BasicBatchConfigurer;
import org.springframework.boot.test.context.SpringBootTest;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = RANDOM_PORT,classes = {BasicBatchConfigurer.class})
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

}
