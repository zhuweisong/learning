
# 资源

## 数据源
[官网:集成方法](https://liteflow.cc/pages/df6982/)

## 依赖库

```xml
<dependency>
    <groupId>com.yomahub</groupId>
    <artifactId>liteflow-spring-boot-starter</artifactId>
    <version>2.11.4.2</version>
</dependency>
```

## 定义组件

```java

@Component("a")
public class ACmp extends NodeComponent {

	@Override
	public void process() {
		//do your business
	}
}

@Component("b")
public class BCmp extends NodeComponent {

	@Override
	public void process() {
		//do your business
	}
}

@Component("c")
public class CCmp extends NodeComponent {

	@Override
	public void process() {
		//do your business
	}
}

```

## 将组件加入扫描

```java
@SpringBootApplication
//把你定义的组件扫入Spring上下文中
@ComponentScan({"com.xxx.xxx.cmp"})
public class LiteflowExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(LiteflowExampleApplication.class, args);
    }
}
```

## 添加配置(application.yml)

```yml
liteflow.rule-source=config/flow.el.xml
```

## 执行任务流

```java
@Component
public class YourClass{

    @Resource
    private FlowExecutor flowExecutor;

    public void execute(){
        LiteflowResponse response = flowExecutor.execute2Resp("chain1", "arg");
    }
}
```
