package io.ddd.stereotype.applicationcore;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Represents an atomic step within a sequence of business logic.
 */
@Target(TYPE)
@Retention(RUNTIME)
@Documented
public @interface Filter
{
}

