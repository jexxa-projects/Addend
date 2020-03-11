package io.ddd.stereotype.applicationcore;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Within production or process industry it might be helpful to explicitly represent a specific process
 * including its process steps. This can simplify mapping from a concrete use case started from an {@link ApplicationService}
 * and mapping to aggregates.
 *
 * For this purpose we introduce a DomainProcess-Layer between application- and domain-layer. This layer does not include
 * any business logic and is typically only required/helpful when representing a production process including its production
 * steps has a high value for the business.
 *
 * Each DomainProcess-Object includes a single method which receives either a command or a {@link DomainEvent}.  Depending on the
 * input this method is either annotated with {@link CommandHandler} or a {@link DomainEventHandler}.
 *
 * Note: In case a {@link DomainService} processes a {@link DomainEvent} it acts as port in terms of a hexagonal architecture.
 *
 * Each {@link DomainProcess} typically starts several {@link DomainProcessStep}-objects which in turn operate on the domain objects
 */
@Target(TYPE)
@Retention(RUNTIME)
@Documented
public @interface DomainProcess
{
}
