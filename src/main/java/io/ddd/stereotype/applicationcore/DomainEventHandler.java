package io.ddd.stereotype.applicationcore;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Represents a handler for processing a @DomainEvent as it is used by a @Composite.
 *
 * Note: A @DomainEventHandler has to be used if the functionality is not provided via an @ApplicationService
 * and must be initialized as a result of a @DomainEvent. Otherwise you have to use @CommandHandler  
 */

@Target(METHOD)
@Retention(RUNTIME)
@Documented
public @interface DomainEventHandler
{

}
