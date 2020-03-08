package io.ddd.stereotype.infrastructure;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * A @DrivenAdapter is an implementation of an outbound port of an ApplicationCore such as @Repository or an @InfrastructureService.
 */
@Target(TYPE)
@Retention(RUNTIME)
@Documented
public @interface DrivenAdapter
{
}
