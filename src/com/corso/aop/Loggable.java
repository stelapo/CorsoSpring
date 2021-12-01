package com.corso.aop;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface Loggable {

    enum Level {
        DEBUG,
        INFO,
        WARN,
        ERROR
    }

    Level level() default Level.INFO;

}
