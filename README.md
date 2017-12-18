# spring-velocity-adapter
Velocity view resolver adapter for Spring 5

## Usage

Add the following dependency into your pom.xml:
```xml
<dependency>
  <groupId>com.shield-solutions</groupId>
  <artifactId>spring-velocity-adapter</artifactId>
  <version>1.0.0.RELEASE</version>
</dependency>
```
Initialize the velocity view resolver inside your spring ```java @Configuration``` annotated classes:
```java
...
@Bean
public ViewResolver viewResolver() {
    VelocityViewResolver viewResolver = new VelocityViewResolver();
    viewResolver.setSuffix(".vm.html");
    return viewResolver;
}
...
@Bean
public VelocityConfigurer velocityConfigurer() {
    VelocityConfigurer vc = new VelocityConfigurer();
    vc.setResourceLoaderPath("WEB-INF/velocity");
    return vc;
}
```
