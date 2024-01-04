# Change Log
All notable changes to this project will be documented in this file.
 
The format is based on [Keep a Changelog](http://keepachangelog.com/)
and this project adheres to [Semantic Versioning](http://semver.org/).

## \[2.0.1] - 2024-01-04
### Fixed
- Maintenance updates of maven plugins 

## \[2.0.0] - 2022-12-11
### Removed
-   Removed obsolete annotations `CommandHandler`, `DomainProcessStep`, and `DomainWorkflow`.

## \[1.3.0] - 2022-08-11
### Added
-   Annotation `Observer` to declare a `DomainEventPublisher` as used in the book implementing Domain-Driven Design from Vaughn Vernon.

### Changed
-   Declared following annotations as deprecated. Reason is that they can easily cause an anemic domain model.
    -   CommandHandler
    -   DomainProcessStep
    -   DomainWorkflow

## \[1.2.0] - 2022-03-29
### Added
-   Annotation `ValueObjectFactory` to declare a factory or a factory method for an `ValueObject`.

## \[1.1.0] - 2021-04-25
### Added
-   Annotation `DomainProcesStep` can be set for methods 

## \[1.0] - 2020-06-20
 
### Added
-   Initial version of Addend 
