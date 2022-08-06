package io.jexxa.addend.applicationcore;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Represents a handling method for processing a command as it is used by {@link DomainWorkflow}.
 * <p>
 *  Note: The difference to a {@link DomainEventHandler} is typically used if the method is only triggered by a DomainEvent.
 * <p>
 * @deprecated The concept of {@link CommandHandler}, {@link DomainProcessStep}, and {@link DomainWorkflow} easily causes
 * an anemic model and thus will be removed
 */
@Target(METHOD)
@Retention(RUNTIME)
@Documented
@Deprecated(forRemoval = true)
public @interface CommandHandler
{
}
