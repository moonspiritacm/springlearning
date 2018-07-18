# springlearning
Spring learning

> 注解：本身没有功能，注解和 xml 都是一种元数据，元数据即解释数据的数据，可以理解为配置信息。注解供框架读取，由框架执行对应功能逻辑。

## ch1-1 [基于注解的依赖注入](quickstart/src/main/java/com/moonspirit/springlearning/one/)

使用 Spring 注解声明实体类，相关注解为 @controller 、@servies、@respository、@Component。

实体类中使用注解进行依赖注入，例如 @Autowired 自动装载。

配置类不填充内容，自动扫描实体类加入容器，并进行初始化。

## ch1-2 [基于 Java 配置的依赖注入](quickstart/src/main/java/com/moonspirit/springlearning/two/)

实体类内部不使用任何 Spring 注解，转而在配置类中对各实体类的依赖关系进行集中配置，作用相当于 xml 配置文件。
