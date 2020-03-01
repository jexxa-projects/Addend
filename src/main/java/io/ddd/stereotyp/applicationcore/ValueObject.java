package io.ddd.stereotyp.applicationcore;

import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.Documented;
import java.lang.annotation.Target;

/**
 * Represents a ValueObject.
 */
@Target(TYPE)
@Documented
public @interface ValueObject
{

}
