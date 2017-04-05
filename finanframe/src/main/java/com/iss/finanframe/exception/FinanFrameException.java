package com.iss.finanframe.exception;

/**
 * 
 * @usage  throw new FinanFrameException(FinanFrameExceptionEnums.xxxx)
 *
 */

public class FinanFrameException extends RuntimeException{
    /**
	 * 
	 */
	private static final long serialVersionUID = -3580917891564385509L;
	
	private ExceptionEnums exceptionEnums;
    public FinanFrameException(ExceptionEnums exceptionEnums){
        this.exceptionEnums = exceptionEnums;
    }
    public FinanFrameException(ExceptionEnums exceptionEnums,String message){
    	super(message);
        this.exceptionEnums = exceptionEnums;
    }
    
    public FinanFrameException(Exception e){
    	super(e);
    }   

    public FinanFrameException(String message){
    	super(message);
    }   
    
    public FinanFrameException(Exception e,ExceptionEnums exceptionEnums){
    	super(e);
        this.exceptionEnums = exceptionEnums;
    }   
    
    public ExceptionEnums getExceptionEnums(){
        return exceptionEnums;
    }
}

