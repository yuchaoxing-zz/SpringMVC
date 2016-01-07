
*****05 springmvc快速入门（XML版本）

步一：创建springmvc-day01这么一个web应用
步二：导入springioc，springweb , springmvc相关的jar包
步三：在/WEB-INF/下创建web.xml文件
步四：创建HelloAction.java控制器类
步五：在/WebRoot/下创建jsp/success.jsp
步六：在/WEB-INF/创建DispatcherServlet-servlet.xml配置文件，xml头部信息与spring.xml相同
          注意：该配置文件的命名规则：web.xml文件中配置的<servlet-name>的值-servlet.xml
步七：部署web应用到tomcat中，通过浏览器访问如下URL：
       http://127.0.0.1:8080/springmvc-day01/hello.action     
       
       
