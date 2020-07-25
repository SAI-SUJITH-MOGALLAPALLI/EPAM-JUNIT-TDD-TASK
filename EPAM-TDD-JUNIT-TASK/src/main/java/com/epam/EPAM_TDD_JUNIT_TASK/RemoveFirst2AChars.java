package com.epam.EPAM_TDD_JUNIT_TASK;

public class RemoveFirst2AChars {

	public String remove(String string) {
		String string1="";
		if(string.charAt(0)!='A')
			string1=string1+string.charAt(0);
		if(string.charAt(1)!='A')
			string1=string1+string.charAt(1);
		string1=string1+string.substring(2);
		return string1;
	}

}
 