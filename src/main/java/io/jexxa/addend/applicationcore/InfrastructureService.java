package io.jexxa.addend.applicationcore;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Represents a service that can only be realized in infrastructure such as sending a {@link DomainEvent} to other
 * bounded contexts.
 */
@Target(TYPE)
@Retention(RUNTIME)
@Documented
public @interface InfrastructureService
{
}
