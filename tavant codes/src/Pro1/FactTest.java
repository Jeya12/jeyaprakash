package Pro1;
	import static org.junit.jupiter.api.Assertions.*;
	import org.junit.jupiter.api.Test;
	class FactTest {
                    
		@Test
		void test() {
			Factorial f=new Factorial();
			int b=f.CalculateFactorial(5);
			assertEquals(120,b);
		}

}
