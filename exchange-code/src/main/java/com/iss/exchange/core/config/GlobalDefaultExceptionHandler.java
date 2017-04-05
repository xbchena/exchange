package com.iss.exchange.core.config;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.iss.finanframe.exception.FinanFrameException;


@ControllerAdvice
public class GlobalDefaultExceptionHandler {
    public static Logger logger = LoggerFactory.getLogger(GlobalDefaultExceptionHandler.class);

    private final static String EXPTION_MSG_KEY = "message";  
      
    @ExceptionHandler(FinanFrameException.class)  
    @ResponseBody  
    public void handleBizExp(HttpServletRequest request, Exception ex){  
    	logger.info("Business exception handler  " + ex.getMessage() );  
        request.getSession(true).setAttribute(EXPTION_MSG_KEY, ex.getMessage());  
    }  
      
    @ExceptionHandler(SQLException.class)  
    public ModelAndView handSql(Exception ex){  
    	logger.info("SQL Exception " + ex.getMessage());  
        ModelAndView mv = new ModelAndView();  
        mv.addObject("message", ex.getMessage());  
        mv.setViewName("sql_error");  
        return mv;  
    }  
}
