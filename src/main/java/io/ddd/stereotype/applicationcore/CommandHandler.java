package io.ddd.stereotype.applicationcore;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Represents a handling method for processing a command as it is used by {@link DomainProcess}.
 *
 *  Note: A {@link DomainEventHandler} has to be used if the functionality is not provided via an {@link ApplicationService}
 *  and must be initialized as a result of a {@link DomainEvent}
 */
@Target(METHOD)
@Retention(RUNTIME)
@Documented
public @interface CommandHandler
{
}
