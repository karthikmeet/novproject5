package org.pageexe;

import org.baseutils.BaseClass;
import org.junit.Before;
import org.junit.Test;
import org.pagerepo.LoginPageRepo;

public class LoginPageExe extends BaseClass {

	@Before
	public void before() {
		driver.get("https://www.facebook.com/");
	}

	@Test
	public void test1() {
		LoginPageRepo repo = new LoginPageRepo();
		type(repo.getUsername(), "pradeep");
		type(repo.getPassword(), "guru");
	}

	@Test
	public void test2() {
		LoginPageRepo repo = new LoginPageRepo();
		type(repo.getUsername(), "Ramzan");
		type(repo.getPassword(), "Priyanka");
	}
}
