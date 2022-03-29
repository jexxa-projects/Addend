package io.jexxa.addend.applicationcore;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Represents a handler for processing a {@link DomainEvent}.
 *
 * Note: A {@link DomainEventHandler} has to be used if the functionality is triggered by a `DomainEvent`. Such a method typically must be
 * utilized as a result of a {@link DomainEvent}. Otherwise, you should use {@link CommandHandler}.
 *
 */
@Target(METHOD)
@Retention(RUNTIME)
@Documented
public @interface DomainEventHandler
{

}
