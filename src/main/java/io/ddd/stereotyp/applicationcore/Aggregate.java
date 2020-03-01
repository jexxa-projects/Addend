package io.ddd.stereotyp.applicationcore;

import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.Documented;
import java.lang.annotation.Target;

/**
 * Represents a DDD aggregate or entity.
 *
 * Each aggregate has a @AggregateID which is a Unique ID and a @AggregateFactory which creates a new Aggregate.
 */
@Target(TYPE)
@Documented
public @interface Aggregate
{

}
