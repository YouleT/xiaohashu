package com.quanxiaoha.framework.biz.operationlog.aspect;

import java.lang.annotation.*;

/**
 * @author youle
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Documented
public @interface ApiOperationLog {
    /**
     * API 功能描述
     */
    String description() default "";

}

