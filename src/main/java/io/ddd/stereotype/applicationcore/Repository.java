package io.ddd.stereotype.applicationcore;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Represents a @Repository which manages a specific @Aggregate.
 */
@Target(TYPE)
@Retention(RUNTIME)
@Documented
public @interface Repository
{

}
