import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ColazzoFrancescoTest_B {
	ColazzoFrancescoClass c;
	@BeforeEach
	void before() {
		c = new ColazzoFrancescoClass();
	}
	
	@Test
	void test1() {
		int num = 5;
		int risAtteso = 15;
		int risOttenuto = c.colazzoMet(num);
		assertEquals(risAtteso, risOttenuto);
	}
	@Test
	void test2() {
		int num = 3;
		int risAtteso = 6;
		int risOttenuto = c.colazzoMet(num);
		assertEquals(risAtteso, risOttenuto);
	}
	@Test
	void test3() {
		int num = 2;
		int risAtteso = 3;
		int risOttenuto = c.colazzoMet(num);
		assertEquals(risAtteso, risOttenuto);
	}

}
