package io.ddd.stereotyp.applicationcore;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Represents a complete business sequence by executing multiple steps represented by a @Filter.
 *
 * Each Composite has either @CommandHandler or a @DomainEventHandler.
 */
@Target(TYPE)
@Retention(RUNTIME)
@Documented
public @interface Composite
{
}
