package com.nicole.springBoot.chapter1;

import java.lang.annotation.*;

/**
 * Created by xl on 2017/7/31.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
