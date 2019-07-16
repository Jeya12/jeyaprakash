package Pro1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class MarkValidationTest {
@Test
void test()
{
	MarkValidation Mark =new MarkValidation();
	String a=Mark.isPass(40);
	assertEquals("pass",out);
	String a1= Mark.markGrade(40);
	assertEquals("grade D",a1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
