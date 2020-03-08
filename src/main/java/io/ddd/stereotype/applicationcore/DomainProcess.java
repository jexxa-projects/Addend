package io.ddd.stereotype.applicationcore;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Within production or process industry it might be helpful to explicitly represent a specific process
 * including its process steps. This can simplify mapping from a concrete use case started from an application service
 * and mapping to aggregates.
 *
 * For this purpose we introduce a DomainProcess-Layer between application- and domain-layer. This layer does not include
 * any business logic and is typically only required/helpful when representing a production process including its production
 * steps has a high value for the business
 *
 * Each DomainProcess-Object includes a single method which receives either a Command or a DomainEvent.  Depending on the
 * input this method is either annotated with @CommandHandler or a @DomainEventHandler.
 *
 * Note: In case a @DomainService processes a @DomainEvent it acts as port in terms of a hexagonal architecture.
 *
 * Each DomainProcess typically starts several @DomainProcessSteps which in turn operate on the domain objects
 */
@Target(TYPE)
@Retention(RUNTIME)
@Documented
public @interface DomainProcess
{
}
