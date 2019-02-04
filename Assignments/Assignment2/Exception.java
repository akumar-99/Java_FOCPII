package com.ncu.assignment.exception;
import java.lang.*;
class MandatoryMissingException extends Exception 
{ 
    public MandatoryMissingException(String s) 
    { 
        super(s); 
    } 
} 
 

class DateFormatException extends Exception 
{ 
    public DateFormatException(String s) 
    { 
        super(s); 
    } 
} 
 