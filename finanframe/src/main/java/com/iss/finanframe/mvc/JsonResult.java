package com.iss.finanframe.mvc;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface JsonResult {
    boolean useUnicode() default false;

    String callback() default "jsonpCallback";

    String errorCode() default "-1";

    String desc() default "";

    boolean convertString() default false;

    boolean debug() default true;
}