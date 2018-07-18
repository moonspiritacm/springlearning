# springlearning
Spring learning

## ch1-1 [基于注解的依赖注入](quickstart/src/main/java/com/moonspirit/springlearning/one/)

使用 Spring 注解声明实体类，相关注解为 @controller 、@servies、@respository、@Component。

实体类中使用注解进行依赖注入，例如 @Autowired 自动装载。

配置类不填充内容，自动扫描实体类加入容器，并进行初始化。

## ch1-2 [基于 Java 配置的依赖注入](quickstart/src/main/java/com/moonspirit/springlearning/two/)

实体类内部不使用任何 Spring 注解，转而在配置类中对各实体类的依赖关系进行集中配置，作用相当于 xml 配置文件。

## ch1-3 [AspectJ 简单实例](quickstart/src/main/java/com/moonspirit/springlearning/three/)

### [Action.java](quickstart/src/main/java/com/moonspirit/springlearning/three/Action.java) 根据拦截规则自定义注解：

- @Retention 定义注解的保留策略

  @Retention(RetentionPolicy.SOURCE)  注解仅存在于源码中，不包含在 class 字节码中
  @Retention(RetentionPolicy.CLASS)   默认的保留策略，注解在 class 字节码中存在，但运行时无法获得
  @Retention(RetentionPolicy.RUNTIME) 注解存在于 class 字节码中，运行时可以通过反射获取到
　
注解生命周期 SOURCE < CLASS < RUNTIME。如果需要在运行时去动态获取注解信息，只能用 RUNTIME 注解；如果要在编译时进行一些预处理操作，就用 CLASS 注解；如果只是做一些检查性操作，比如 @Override 和 @SuppressWarnings，则选用  SOURCE 注解。

- @Target 定义注解的作用目标

  @Target(ElementType.TYPE)             接口、类、枚举、注解
  @Target(ElementType.FIELD)            字段、枚举的常量
  @Target(ElementType.METHOD)           方法
  @Target(ElementType.PARAMETER)        方法参数
  @Target(ElementType.CONSTRUCTOR)      构造函数
  @Target(ElementType.LOCAL_VARIABLE)   局部变量
  @Target(ElementType.ANNOTATION_TYPE)  注解
  @Target(ElementType.PACKAGE)          包

- @Document 该注解被包含在 javadoc 中

