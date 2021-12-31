package com.revature;

import com.revature.inspection.ClassInspector;
import com.revature.models.Crime;

public class Driver {

	public static void main(String[] args) {
		// supervillain practice project
		
		System.out.println("testing villains");
		System.out.println();
		ClassInspector CI = new ClassInspector();
		CI.listClassAnnotations(Crime.class);
		CI.listNonPublicFields(Crime.class);
		

	}
	
}
