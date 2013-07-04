# About

Company needs an internal weather service which will be used company-wide in different applications and services:

 * Portlets in intranet applications;
 * Remotely accessible via mobile devices;
 * Warnings on bad weather linked to corporate trips;


Current implementation simply proxies a well known SaaS provider weather service [http://www.wunderground.com](http://www.wunderground.com) and does not provide any additional functionality to clients. 

Initially, when service was not used broadly, current solution was feasible, but once usage increased, performance did not meet SLA (response time, uptime) and internal project for reimplementation was approved.

# Requirements for implementation

## General requirements/considerations

 1. Service must respond either with weather data or meaningfull responses in case of erroneous requests;
 2. Sufficient logging for production support must be implemented;
 3. Clients must authenticate using HTTP Basic auth. Should only allow clients with credentials weather/w34th3r;
 4. You must basically ignore [http://www.wunderground.com](http://www.wunderground.com) request limits, as for production deployment company will use paid account with request limits lifted.
 5. Meaningful set of automated JUnit tests must be implemented. Test-coverage of less than 70% is acceptable with proper motivation/explanation.

## Predefined locations

Predefined locations is a set of locations that are preconfigured for application before depoyment - can be either external or packaged configuration.

 1. Service must provide response times of less than 500ms for preconfigured locations. Locations must be provided via application configuration;
 2. Service must return recent observations for supported locations. Data should not be older than 3 hours, unless 3rd party weather service is down for a long period of time;
 3. Both provided SOAP and REST endpoints must return same data;
 4. Initial list of predefined locations: Vilnius, Riga, Tallinn, Helsinki.

## Popular locations

Popular locations are the locations that are requested via clients for more than n times during lifetime of application (between redeployments/restarts).

 1. Requests for locations that are not in predefined location list still bust be satisfied, but without strict SLA requirements;
 2. If location is requested for more than n times (n is configurable), it must be automatically included in 'Predefined location' framework and satisfy same 500ms SLA requirement. Though this will be reset after application redeployment/restart.

# Provided base implementation

Base implementation is provided to take the boring part of set-up/wiring away and allow for prospect candidate to concentrate on engineering internals, adding tests, working on algo. 

Any needed additional libraries can be used, but changes/deviations from provided base implementation (like changing Spring REST to Jersey) can be done with proper motivation/explanation.

Additional notes:

 * This is simple maven project - 'mvn clean', 'mvn test'... works;
 * To run application - 'mvn jetty:run';
 * REST Endpoint URI: [http://localhost:8080/weather/](http://localhost:8080/weather/)
 * SOAP WSDL URI: [http://localhost:8080/ws/weather.wsdl](http://localhost:8080/ws/weather.wsdl).

# Deliverables

Packaged git repo with implementation and any additional resources you see fit.

# Other considerations

The implementation you create should not be made publicly available or otherwise shared/distributed to any outside parties.  