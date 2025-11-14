# Etapa 1: Build del proyecto
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /build

# Copiamos el pom y el código fuente
COPY demo/pom.xml .
COPY demo/src ./src

# Compilamos y generamos el JAR
RUN mvn -e -X -Dmaven.test.skip=true package

# Etapa 2: Imagen final
FROM eclipse-temurin:17-jdk
WORKDIR /app

# Copiamos el jar generado directamente como /app.jar (como Render necesita)
COPY --from=build /build/target/*.jar /app.jar

# Exponemos puerto (opcional para Render)
EXPOSE 8080

# Comando de arranque
ENTRYPOINT ["java", "-jar", "/app.jar"]
