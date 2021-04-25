package io.jexxa.addend.applicationcore;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Represents a handling method for processing a command as it is used by {@link DomainWorkflow}.
 *
 *  Note: The difference to a {@link DomainEventHandler} is typically used if the method is only triggered by a DomainEvent.
 */
@Target(METHOD)
@Retention(RUNTIME)
@Documented
public @interface CommandHandler
{
}
