package com.ncu.assignment.validation;
// import java.lang.*;
import com.ncu.assignment.exception.*;
public class StudentValidation {
	public void date(String date) {
		try {
			if (date == null) {
				throw new DateFormatException("");
			}
		} catch (DateFormatException d) {
			System.out.println(d.getMessage());
		}
	}

	public void nullChk(String fName, String address, String dob, String eMail, String contactNo) {
		try {
			if (fName == null || address == null || dob == null || eMail == null || contactNo == null) {
				throw new MandatoryMissingException();
			}
		} catch (MandatoryMissingException m1) {
			System.out.println(m1.getMessage());
		}
	}

	public void nChk(int n) {
		try {
			if (n <= 0) {
				throw new MandatoryMissingException();
			}
		} catch (MandatoryMissingException m2) {
			System.out.println(m2.getMessage());
		}
	}



}