package io.jexxa.addend.applicationcore;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Represents a handler for processing a {@link DomainEvent}.
 *
 * Note: A {@link DomainEventHandler} has to be used if the functionality is not provided via an {@link ApplicationService}
 * and must be initialized as a result of a {@link DomainEvent}. Otherwise you have to use {@link CommandHandler}
 *
 * Note: A {@link DomainEventHandler} is typically provided by a {@link DomainProcess} or a {@link DomainService}
 */

@Target(METHOD)
@Retention(RUNTIME)
@Documented
public @interface DomainEventHandler
{

}
