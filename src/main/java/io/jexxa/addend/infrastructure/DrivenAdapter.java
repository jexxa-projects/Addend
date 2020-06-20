package io.jexxa.addend.infrastructure;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * A {@link DrivenAdapter} is an implementation of an outbound port of an application core such as {@link io.jexxa.addend.applicationcore.Repository} or an {@link io.jexxa.addend.applicationcore.InfrastructureService}.
 */
@Target(TYPE)
@Retention(RUNTIME)
@Documented
public @interface DrivenAdapter
{
}
