package io.ddd.stereotype.applicationcore;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Represents an atomic step of a @DomainProcess and does not perform any business logic. A DomainProcessStep
 * typically receives a Command, forwards it to an @Aggregate an returns the resulting @DomainEvent. The
 * result is then forwarded to the next @DomainProcessStep as long as all steps have been taken.
 */
@Target(TYPE)
@Retention(RUNTIME)
@Documented
public @interface DomainProcessStep
{
}

