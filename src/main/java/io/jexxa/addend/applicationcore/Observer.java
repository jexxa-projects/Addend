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
 * <p>
 * IMPORTANT: The pattern of using a domain event handler described here is also
 * known as "side effect domain event handling."
 * <p>
 * This pattern is no longer considered best practice for the following reasons:
 * 1. Coupling: The aggregate implicitly defines who handles the event, rather than
 *    just stating what happened.
 * 2. Reduced Predictability: It introduces invisible or hidden side effects.
 * @deprecated
 */
@Target(TYPE)
@Retention(RUNTIME)
@Documented
@Deprecated(forRemoval = true)
public @interface Observer {
}
