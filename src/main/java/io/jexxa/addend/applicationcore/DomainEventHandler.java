package io.jexxa.addend.applicationcore;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Represents a handler for processing a {@link DomainEvent}.
 * <p>
 * Note: A {@link DomainEventHandler} has to be used if another component within your application core
 * handles a {@link DomainEvent} that occurred within the same bounded context. Typically, this is a {@link DomainService}.
 *
 */
@Target(METHOD)
@Retention(RUNTIME)
@Documented
public @interface DomainEventHandler
{

}
