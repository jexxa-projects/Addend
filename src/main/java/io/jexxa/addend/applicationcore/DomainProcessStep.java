package io.jexxa.addend.applicationcore;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Represents an atomic step of a {@link DomainWorkflow} and does not perform any business logic. A {@link DomainProcessStep}
 * typically receives a command, forwards it to an {@link Aggregate} an returns the resulting {@link DomainEvent}. The
 * result is then forwarded to the next {@link DomainProcessStep} as long as all steps have been taken.
 *  <p>
 *  @deprecated The concept of {@link CommandHandler}, {@link DomainProcessStep}, and {@link DomainWorkflow} easily causes
 *  an anemic model and thus will be removed
 */
@Target({TYPE, METHOD})
@Retention(RUNTIME)
@Documented
@Deprecated(forRemoval = true)
public @interface DomainProcessStep
{
}

