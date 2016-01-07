*****06 加载自定义目录下的spring.xml配置文件

在默认情况下：springmvc框架的配置文件必须叫<servlet-name>-servlet.xml
且必须放在/WEB-INF/目录下，我们可以在web.xml文件中，为DispatcherServlet配置一个初始化参数，
让它去我们指定的目录下加载springmvc.xml配置文件.web配置如下：
<init-param>
	<param-name>contextConfigLocation</param-name>
	<param-value>classpath:spring.xml</param-value>	
</init-param>