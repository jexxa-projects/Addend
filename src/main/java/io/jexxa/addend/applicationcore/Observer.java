package io.jexxa.addend.applicationcore;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;


/**
 * The {@link Observer} pattern is often used within a DDD application to send domain events via a so-called
 * DomainEventPublisher which is part of the domain. Relevant discussions about this pattern including
 * examples can be found in the book "Implementing Domain-Driven Design" by Vaughn Vernon.
 * <p>
 * Although the Observer Pattern is not actually a pattern of the DDD pattern language, this annotation
 * is provided to explicitly represent this pattern within the domain.
 *
 */
@Target(TYPE)
@Retention(RUNTIME)
@Documented
public @interface Observer {
}
