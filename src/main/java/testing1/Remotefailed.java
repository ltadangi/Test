import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class RemotecontrolTest {
	
	Remotecontrol rc = new Remotecontrol();

	@Test
	public void switchon() {
		rc.pressPower();
		assertTrue(rc.myAC.power == true);
	}
	
	@Test
	public void switchoff() {
		System.out.println("Implemented");
	}
	
	@Test
	
	public void failedTest() {
		assertTrue(false);
}

	private void assertTrue(boolean b) {
		// TODO Auto-generated method stub
		
	} 
}
