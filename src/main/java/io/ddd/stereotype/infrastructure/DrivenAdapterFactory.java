package io.ddd.stereotype.infrastructure;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Represents either a factory or a factory method to create a @DrivenAdapter.
 */
@Target({TYPE, METHOD})
@Retention(RUNTIME)
@Documented
public @interface DrivenAdapterFactory
{
}
