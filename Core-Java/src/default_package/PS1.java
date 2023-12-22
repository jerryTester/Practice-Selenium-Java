package default_package;

import org.testng.annotations.Test;

public class PS1 extends PS{
	
@Test	
public void doThat()
{
	PS2 ps2OBJ = new PS2(3);
	doThis();
	System.out.println(ps2OBJ.increment());
	System.out.println(ps2OBJ.decrement());
	System.out.println(ps2OBJ.multiplyThree());
}

}
