package com.qa.tester;

import org.testng.annotations.Test;

public class NewTest extends robot {
	
	
	
  @Test
  public void f() throws InterruptedException {
	  launch_browser();
	  
	  close_browser();
  }
}
