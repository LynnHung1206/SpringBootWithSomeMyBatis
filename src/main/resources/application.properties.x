# DataSource config
spring.datasource.url=jdbc:mysql://localhost:3306/JAVA_FRAMEWORK
spring.datasource.username=root
spring.datasource.password=0000
spring.datasource.hikari.minimum-idle=5
spring.datasource.hikari.maximum-pool-size=10
spring.datasource.hikari.connection-timeout=30000
# JPA config
spring.jpa.show-sql=true
# Hibernate config
spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect
spring.jpa.hibernate.naming.implicit-strategy=org.hibernate.boot.model.naming.ImplicitNamingStrategyJpaCompliantImpl
# Spring Web config
server.servlet.context-path=/springboot-exercise
# Spring MVC config
spring.mvc.view.prefix=/
# Logback config
logging.level.tw.idv.lynn=debug
logging.pattern.console=%d{yyyy-MM-dd HH:mm:ss.SSS} [%level] [%t] %msg%n
logging.pattern.file=%d{yyyy-MM-dd HH:mm:ss.SSS} [%level] [%t] [%line] %msg%n
logging.file.path=./
