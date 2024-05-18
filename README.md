# Spring Cloud Config Server

**Author:** Angel Javier

This repository contains the following projects:

- **config-server**: This project allows you to create a centralized config server for Spring Boot applications or microservices.
- **offers-basic**: This project connects to the config-server to implement static configuration.
- **offers-complex**: This project connects to the config-server to implement dynamic configuration. It needs to invoke the `/actuator/refresh` endpoint to refresh the configuration. Example: `curl -i -X POST http://.../actuator/refresh`
- **offers-complex-bus**: This project connects to the config-server to implement live update configuration. It needs to connect to a running RabbitMQ instance and spring-cloud-monitor.

All projects require another GitHub repository:

- **git-config** (https://github.com/AngelJava78/git-config). A webhook is needed to push changes from GitHub to the config-server. In a local environment, ngrok helps to test your apps. `ngrok http http://localhost:8888`

Note: The projects in this repository are built using Spring Cloud Config, Java, Maven

## References

- [Spring Cloud Config](https://spring.io/projects/spring-cloud-config)
- [YouTube: Configuración centralizada con Spring Cloud Config y Git. (Parte 1)](https://www.youtube.com/watch?v=WUp_KLpGdTI)
- [YouTube: Configuración centralizada con Spring Cloud Config y Git. (Parte 2)](https://www.youtube.com/watch?v=wYzDPX7c0_c)
- [YouTube: Configuración centralizada dinámica con Spring Cloud Config (Parte 3)](https://www.youtube.com/watch?v=baJZolQ14Jc)
