02 回顾struts2+spring+jdbc+oracle开发【员工管理系统--增加员工】

1）需求：学生注册【add.jsp->StudentAction.java->addOK.jsp】
2）struts2框架有如下特点：
    每次请求action时，都创建action实例
    action类一成不变的直接或间接继续ActionSupport类
 action类中的业务控制方法总是相类似的签名且无参
    action类中，接收参数要用实例变量和对应的set方法或set/get方法
struts.xml配置文件，必须以struts.xml命名，且放在src目录下
.. .. ..