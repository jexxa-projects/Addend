package io.ddd.stereotype.applicationcore;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Repräsentiert einen ApplicationService, der einen externen Client Zugriff auf DomainServices ermöglicht. Ein ApplicationService
 * fasst typischerweise Use-Cases zusammen, stellt aber keine Fachlogik zur Verfügung.
 */
@Target(TYPE)
@Retention(RUNTIME)
@Documented
public @interface ApplicationService
{

}
