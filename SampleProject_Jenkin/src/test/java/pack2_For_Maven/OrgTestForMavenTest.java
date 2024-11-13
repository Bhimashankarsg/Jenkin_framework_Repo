package pack2_For_Maven;

import org.testng.annotations.Test;

public class OrgTestForMavenTest {
	
@Test
	public void createOrgTest()
	{
	String URL=System.getProperty("url");
	String BROWSER=System.getProperty("browser","chrome");
	String USERNAME=System.getProperty("username");
	String PASSWORD=System.getProperty("password");
	
	System.out.println(URL);
	System.out.println(BROWSER);
	System.out.println(USERNAME);
	System.out.println(PASSWORD);
	
		System.out.println("Execute createOrgTest");
	}
	@Test
	public void modifyOrgtTest()
	{
		System.out.println("Execute modifyOrgtTest");
	}
}
