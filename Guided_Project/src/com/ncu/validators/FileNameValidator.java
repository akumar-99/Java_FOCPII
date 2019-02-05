package com.ncu.validators;
import java.util.regex.*;
// java.util.* - incorrect bcz regex is a sub package not a class
class NameValidator {
	boolean nameValidator(String filename, String filetype) {
		System.out.println("File Name is : " + filename + " and its type is : " + filetype);
		boolean b;
		b = emptyFileName(filename);
		if (b == true) {
			return false;
		}
		b = missingDot(filename);
		if (b == true) {
			return false;
		}
		return true;
	}

	boolean emptyFileName(String filename) {
		if (filename.equals("")) {
			return true;
		}
		else {
			return false;
		}
	}

	boolean missingDot(String filename) {
		Pattern cosPattern = Pattern.compile("[.]");
		Matcher cosMatcher = cosPattern.matcher(filename);
		boolean value = cosMatcher.find();
		if (value == true) {
			return false;
		}
		else {
			return true;
		}
	}
}

// class nameValidator {
// 	public static void main(String[] args) {
// 		NameValidator csvObject = new NameValidator();
// 		csvObject.nameValidator("example.csv", "csv");
// 	}
// }

class testnamevalidator {
	public static void main(String[] args) {
		NameValidator csvObject = new NameValidator();
		boolean checkValidator = csvObject.nameValidator("example.csv", "csv");
		System.out.println(checkValidator);
		checkValidator = csvObject.nameValidator("", "csv");
		System.out.println(checkValidator);
		checkValidator = csvObject.nameValidator("examplescsv", "csv");
		System.out.println(checkValidator);

	}
}