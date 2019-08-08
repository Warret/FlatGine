package test.flatgine.objectsys;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import com.flatgine.objectsys.Object;

class ObjectTest {

	static final Object testObj = new Object();
	
	@BeforeClass
	public static void init() {
		testObj.setX(100);
	}
	
	@Before
	public void setup() {
		testObj.setX(100);
	}
	
	
	//____SETTER____
	@Test
	void setter() {
		testObj.setX(100);
		assertEquals(testObj.getX(), 100);
	}
	
	
	//_____INCREASE_____
	@Test
	void increaseForPositiveValue() {
		testObj.increaseXBy(50);
		assertEquals(testObj.getX(), 150);
	}
	
	@Test
	void increaseForNegativeValue() {
		testObj.increaseXBy(-50);
		assertEquals(testObj.getX(), 50);
	}

	@Ignore
	@Test
	void increaseForZeroNumber() {
		testObj.increaseXBy(0);
		assertEquals(testObj.getX(), 100);
	}
	
	
	//_____DECREASE_____
	@Test
	void decreaseForPositiveValue() {
		testObj.decreaseXBy(50);
		assertEquals(testObj.getX(), 50);
	}
	
	@Test
	void decreaseForNegativeValue() {
		testObj.decreaseXBy(-50);
		assertEquals(testObj.getX(), 150);
	}
	
	@Ignore
	@Test
	void decreaseForZeroNumber() {
		testObj.decreaseXBy(0);
		assertEquals(testObj.getX(), 100);
	}
}
