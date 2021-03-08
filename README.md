
### install

#### Download ANT

http://ant.apache.org/bindownload.cgi


#### Download jacoco

https://www.eclemma.org/jacoco/

### 命令

编译 java 类
```
ant compile
```

编译单元测试类
```
ant compileTest
```

执行单元测试
```
ant test
```

生成测试报告
```
ant report
```

#### 说明

> 记得配置 JAVA_HOME 和 Ant 的环境变量，否则无法在命令行中运行，使用 IDEA 运行出错不会显示错误具体信息。
> 在 IDEA 中 build.xml 会显示报错，并不影响 Ant 使用。

