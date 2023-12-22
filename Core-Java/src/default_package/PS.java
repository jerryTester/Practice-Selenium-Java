package default_package;

import org.testng.annotations.BeforeTest;

public class PS {

@BeforeTest
public void didThis()
{
	System.out.println("Before Test PS Class");
}
	
public void doThis()
{
	System.out.println("PS method");
}

}
