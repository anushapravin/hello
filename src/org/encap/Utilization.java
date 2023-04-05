package org.encap;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Utilization {
	public static void main(String[] args) {
		Banking a=new Banking();
		a.setUserName("anu");
		a.setPassword("abc@12");
        a.setRefId("Abc123");		
		Banking b=new Banking();
		b.setUserName("ajin");
		b.setPassword("473");
        b.setRefId("jkl123");
		
		//using Map concept
        Map<Integer, Banking>mp1=new LinkedHashMap<>();
        mp1.put(1, a);
        mp1.put(2, b);
        
        
        
      Collection<Banking> values = mp1.values();
for (Banking banking : values) {
	

        	String userName = banking.getUserName();
        	System.out.println(userName);
        	String password = banking.getPassword();
	System.out.println(password);
	String refId = banking.getRefId();
	System.out.println(refId);
	
	
		
		}
	}
		
		
		
		
	}

	

