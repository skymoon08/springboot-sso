package com.suzhe.sso.common.validation;




import com.suzhe.sso.common.validation.validator.EqualLengthValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * 等于长度注解
 */
@Documented
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = EqualLengthValidator.class)
public @interface EqualLength {

    String message() default "equal_length";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    int value();
}
