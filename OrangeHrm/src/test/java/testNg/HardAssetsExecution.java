package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssetsExecution {
	
	@Test
	public void m1() {
		System.out.println("step-1");
		System.out.println("step-2");
		Assert.assertEquals("A","B");//--->Assertion fail
		System.out.println("step-3");
		System.out.println("step-4");
	}
	
	@Test
	public void m2() {
		String expectedDta ="Qspiders";
		String actualDta ="Qspiders";
		Assert.assertEquals(expectedDta,actualDta);
	}
	
	
	@Test
	public void m3() {
		String expectedDta ="Qspiders";
		String actualDta ="Qspiders";
		Assert.assertEquals(expectedDta,actualDta,"Assert fail");
	}
	
	@Test
	public void m4() {
		int expdata= 10;
		int actdta =20;
		Assert.assertEquals(expdata, actdta,"Assert fails");
		System.out.println("assert pass");
	}
	
	@Test
	public void m5() {
		int expdata=50;
		int actdata=100;
		Assert.assertNotEquals(expdata,actdata);
	}
	
	@Test
	public void m6() {
		String expdata="preethi";
		String actdata="preethi";
		Assert.assertTrue(actdata.equals(expdata),"Assert fail");
		System.out.println("assert pass");
	}
	
	
	
	@Test
	public void m7() {
		String expdata= "Welcome";
		String actdata ="Welcoe";
		Assert.assertFalse(actdata.equals(expdata),"Assert fail");
		System.out.println("assert pass");
	}
	
	
	@Test
	public void m8() {
		String s =null;
		Assert.assertNull(s,"assert fails");
		System.out.println("Assert pass");
	}
	
	@Test
	public void m9() {
		String s ="Qspiders";
		Assert.assertNull(s,"assert fails");
		System.out.println("Assert pass");
	}
	
	@Test
	public void m10() {
		String s= null;
		Assert.assertNotNull(s,"assert fails");
		System.out.println("Assert pass");
	}
	
	
	@Test
	public void m11() {
		String s= "shubha";
		Assert.assertNotNull(s,"assert fails");
		System.out.println("Assert pass");
	}
	
	@Test
	public void m12() {
		int exp =10;
		int act =10;
		Assert.assertSame(exp,act,"assert fails");
		System.out.println("assert pass");
	}
	
	@Test
	public void m13() {
		int exp =11;
		int act =10;
		Assert.assertSame(exp,act,"assert fails");
		System.out.println("assert pass");
	}
	
	
	@Test
	public void m14() {
		int exp =10;
		int act=10;
		Assert.assertNotSame(exp, act,"assert fails");
		System.out.println("assert pass");
	}
	
	@Test
	public void m15() {
		int exp =10;
		int act=11;
		Assert.assertNotSame(exp, act,"assert fails");
		System.out.println("assert pass");
	}
	@Test
	public void m16() {
		Assert.fail(); //forcefully  failing of statement or script
	}
	
	
	@Test
	public void m17() {
		System.out.println("step-1 soft assert");
		SoftAssert s = new SoftAssert();
		s.assertEquals("s", "p");
		System.out.println("step-2 soft assert");
		s.assertAll();
	}
	
	
	
	
	

}
