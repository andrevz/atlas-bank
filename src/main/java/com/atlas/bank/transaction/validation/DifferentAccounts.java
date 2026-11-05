package com.atlas.bank.transaction.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = DifferentAccountsValidator.class)
public @interface DifferentAccounts {
    String message() default "Las cuentas de origen y destino deben ser diferentes";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
