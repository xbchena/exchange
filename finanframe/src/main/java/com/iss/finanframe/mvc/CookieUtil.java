package com.iss.finanframe.mvc;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by peng.wu on 2016/5/13.
 */
public class CookieUtil {

    public static boolean addCookie(String cookieName, String cookieValue) {
        if (RequestContextHolder.getRequestAttributes() != null) {
            HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
            Cookie c = new Cookie(cookieName, cookieValue);
            c.setPath("/");
            response.addCookie(c);
            response.addHeader(cookieName, cookieValue);
            return true;
        }
        return false;
    }

    public static String getCookieValue(String cookieName) {
        HttpServletResponse response = null;
        if (RequestContextHolder.getRequestAttributes() != null) {
            HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();

            response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
            if (request != null) {
                Cookie[] cookies = request.getCookies();
                if (cookies != null && cookies.length > 0) {
                    for (Cookie c : cookies) {
                        if (c.getName().equals(cookieName)) {
                            return c.getValue();
                        }
                    }
                }
            }
        }

        if (response != null) {
            return response.getHeader(cookieName);
        }

        return "";
    }
}
