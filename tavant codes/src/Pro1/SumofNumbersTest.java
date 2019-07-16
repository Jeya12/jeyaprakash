package Pro1;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class SumofNumbersTest {

	@Test
	void test()
	{
		SumOfNumbers sum=new SumOfNumbers();
		int a=sum.SumOfEvenNumber(1,10);
		assertEquals(30,a);
		int a1=sum.sumOfOddNumbers(1,10);
		assertEquals(25,a1);
		
	}
}
