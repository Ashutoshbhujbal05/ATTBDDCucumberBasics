package taggedHooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class TaggedHooks
{
	@Before("@sanity")
	public void perticularTagBefore()
	{
		System.out.println("It will run only when we define @sanity tag on a scenario");
	}
	
	@Before
	public void beforeHook()
	{
		System.out.println("This will run before every scenario");
	}

	@After
	public void AfterHook()
	{
		System.out.println("Ths will run After every scenario");
	}

}
