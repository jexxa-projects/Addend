package io.ddd.stereotype.applicationcore;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Represents a @DomainService which realizes business logic which can not be assigned to an @Aggregate.
 *
 * In case you do not use a @DomainProcess a @DomainService can also be used as a port in case they
 * process a @DomainEvent.  
 */
@Target(TYPE)
@Retention(RUNTIME)
@Documented
public @interface DomainService
{

}
