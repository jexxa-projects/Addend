package io.jexxa.addend.applicationcore;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Represents a business event that has happened in the past including all relevant information.
 */
@Target(TYPE)
@Retention(RUNTIME)
@Documented
public @interface DomainEvent
{

    /**
     * Name of the DomainEvent.
     * 
     * @return Name of the domain event
     */
    String value() default "";

}
