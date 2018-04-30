package com.amsystem;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import com.amsystem.controller.HomeController;


public class AppTest {
	
    @Test
    public void testApp(){
    	
    	HomeController hc = new HomeController();
    	
    	String result = hc.home();
    	assertEquals( result, "home page for account management system");
      
    }
}
