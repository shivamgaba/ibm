package automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.MouseEvent;

public class simulatemouse {
	private static Robot robot=null;
	public static void main(String args[]){
		try{
			robot=new Robot();
		}
		catch(AWTException e){
			e.printStackTrace();
		}
		
		click(130,200);
		//main(null);
	}
	public static void click(int x, int y)
	{
		robot.mouseMove(x, y);
		robot.delay(5);
		robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
	}
}
