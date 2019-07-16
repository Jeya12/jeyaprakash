package Pro1;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class TemperatureTest {

	@Test
	void test() {
	
		Temperature Temp=new Temperature();
		double a=temp.convertToFarenheit(0);
		assertEquals(32,a);
		double a1=temp.convertToCelsious(32);
		assertEquals(0,a1);
	}

	

}