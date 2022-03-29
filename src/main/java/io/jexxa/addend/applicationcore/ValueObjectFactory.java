package io.jexxa.addend.applicationcore;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Represents either a factory or a factory method to create a new {@link ValueObject}.
 */
@Target({TYPE, METHOD})
@Retention(RUNTIME)
@Documented
public @interface ValueObjectFactory {

    /**
     * The type of aggregate created
     *
     * @return Class information of the ValueObject
     */
    Class<?> value();
}
