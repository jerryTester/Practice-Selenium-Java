package default_package;

public class PS2 extends PS3{
	
	int a;
	
	public PS2(int a) {
		//constructor
		super(a); //parent constructor invoked
		this.a = a;
	}

	public int increment()
	{
		a = a +1;
		return a;
	}
	
	public int decrement()
	{
		a = a - 1;
		return a;
	}

}
