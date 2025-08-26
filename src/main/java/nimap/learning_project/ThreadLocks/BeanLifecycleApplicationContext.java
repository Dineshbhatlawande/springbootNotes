package nimap.learning_project.ThreadLocks;

public class BeanLifecycleApplicationContext {
    /*
       RestTemplate,WebClient,HttpClient ,Feign Client
      ###     ApplicationContext      ###
             1) Manages the Bean Lifecycle and performs Dependency Injection (DI).
             2) Reads configuration from:
                             -> XML-based configuration
                             -> Annotation-based configuration
                             -> Java-based configuration (Spring Boot / @Configuration classes)


      ###      Bean Lifecycle     ###
             1) Bean Creation – Spring container instantiates the bean object.
             2) Dependency Injection (DI) – Required dependencies are injected into the bean.
             3) Bean Naming – A unique name/id is assigned to the bean by the container.
             4) Initialization (@PostConstruct / afterPropertiesSet) – If defined, initialization methods are called.
             5) Bean Ready to Use – The bean is now available for use within the application.
             6) Pre-Destroy (@PreDestroy) – If defined, cleanup methods are executed before destruction.
             7) Bean Destruction – The bean is destroyed when the application context is closed.

     */
}
