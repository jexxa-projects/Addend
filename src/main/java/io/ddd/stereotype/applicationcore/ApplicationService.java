package io.ddd.stereotype.applicationcore;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Represents an ApplicationService in terms of Domain Driven Design.
 *
 * In terms of an hexagonal architecture an ApplicationService also represents an inbound port which provides methods
 * that can be used by a @DrivingAdapter.
 *
 */
@Target(TYPE)
@Retention(RUNTIME)
@Documented
public @interface ApplicationService
{

}
