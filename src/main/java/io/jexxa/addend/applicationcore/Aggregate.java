package io.jexxa.addend.applicationcore;

import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.Documented;
import java.lang.annotation.Target;

/**
 * Represents an aggregate or entity in terms of Domain Driven Design.
 *
 * Each aggregate has a {@link AggregateID} which is a Unique ID and an {@link AggregateFactory} which creates a new {@link Aggregate}.
 */
@Target(TYPE)
@Documented
public @interface Aggregate
{

}
