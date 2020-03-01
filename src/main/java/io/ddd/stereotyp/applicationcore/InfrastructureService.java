package io.ddd.stereotyp.applicationcore;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Represents a service that can only be realized in infrastrucure such as sending a @DomainEvent.
 */
@Target(TYPE)
@Retention(RUNTIME)
@Documented
public @interface InfrastructureService
{
}
