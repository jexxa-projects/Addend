package io.jexxa.addend.applicationcore;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Within production or process industry it might be helpful to explicitly represent a specific process
 * including its process steps. This can simplify mapping from a concrete use case started from an {@link ApplicationService}
 * and mapping to aggregates.
 * <p>
 * For this purpose we introduce a DomainWorkflow-Layer between application- and domain-layer. This layer does not include
 * any business logic and is typically only required/helpful when representing a production process including its production
 * steps has a high value for the business. In addition a DomainWorkflow is also used to encapsulate and represent transaction within a domain 
 * <p>
 * Each DomainWorkflow-Object includes a single method which receives either a command or a {@link DomainEvent}.  Depending on the
 * input this method is either annotated with {@link CommandHandler} or a {@link DomainEventHandler}.
 * <p>
 * Note: In case a {@link DomainService} processes a {@link DomainEvent} it acts as port in terms of a hexagonal architecture.
 * <p>
 * Each {@link DomainWorkflow} typically starts several {@link DomainProcessStep}-objects which in turn operate on the domain objects
 * <p>
 * @deprecated The concept of {@link CommandHandler}, {@link DomainProcessStep}, and {@link DomainWorkflow} easily causes
 * an anemic model and thus will be removed
 */
@Target(TYPE)
@Retention(RUNTIME)
@Documented
@Deprecated(forRemoval = true)
public @interface DomainWorkflow
{
}
