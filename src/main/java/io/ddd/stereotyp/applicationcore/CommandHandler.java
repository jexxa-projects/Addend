package io.ddd.stereotyp.applicationcore;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Represents a handling method for processing a command as it is used by @Composite.
 *
 *  Note: A @DomainEventHandler has to be used if the functionality is not provided via an @ApplicationService
 *  and must be initialized as a result of a @DomainEvent
 */
@Target(METHOD)
@Retention(RUNTIME)
@Documented
public @interface CommandHandler
{
}
