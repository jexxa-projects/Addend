package io.ddd.stereotype.applicationcore;

import static java.lang.annotation.ElementType.METHOD;

import java.lang.annotation.Documented;
import java.lang.annotation.Target;

/**
 * Represents the ID of an aggregate. Note that each @Aggregate needs exactly one @AggregateID
 */
@Target(METHOD)
@Documented
public @interface AggregateId
{

}
