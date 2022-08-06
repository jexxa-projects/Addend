package io.jexxa.addend.applicationcore;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Represents a {@link DomainService} which realizes business logic which can not be assigned to an {@link Aggregate}.
 */
@Target(TYPE)
@Retention(RUNTIME)
@Documented
public @interface DomainService
{

}
