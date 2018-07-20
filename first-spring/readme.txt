>> Project Setup & Initialization
	>>> Open Eclipse.
	>>> Note: Add Tomcat Server. (Using Server View, before creating project.)
	
	>>> Create Dynamic Web Project.
		>>>> Note. Select the server added in above step. 
		>>>> Note. Don't forget to create web.xml, while creating project. 
	
	>>> Configure and Convert project into MAVEN project. 
		>>>> Right Click on Project -> Configure -> Convert to Maven Project.
		>>>> This will create pom.xml file at project root structure.  
	
	>>> Add the required dependency related to SPRING.
		>>>> Follow the link :: https://mvnrepository.com/
		>>>> Note. Add all <dependency> inside <dependencies> tag.
		>>>> spring-core
		>>>> spring-context
		>>>> spring-webmvc
		>>>> spring-jdbc
		>>>> mysql-connector-java 

>> Project Setup MVC Integration.
	>>> Add servlet mapping in web.xml
		>>>> Following parameters are important
		>>>> <servlet-name>  :: spring
		>>>> <servlet-class> :: org.springframework.web.servlet.DispatcherServlet
		>>>> <url-pattern>	 :: /spring/*
	
	>>> Create Spring xml file, 
		>>>> NOTE :: the name of the xml file will be as per the name of your servlet. 
		>>>> NOTE :: Location of the xml file is also important. It resides at same location as web.xml.
		
		>>>> Assuming our xml file name :: spring-servlet.xml
		>>>> With the help of XML reference, add the root tag with all namespaces.
		
		>>>> The below is make our spring project annotation aware
			>>>> <context:annotation-config></context:annotation-config>
			
		>>>> The below is to define where spring container will look out for annotation.	
			>>>> <context:component-scan base-package="com.dac.servlet"></context:component-scan>
			
		>>>> The below is to mark spring poject MVC aware. 	
			>>>> <mvc:annotation-driven></mvc:annotation-driven>
			
			
		>>>> The below is to configure the VIEW of Spring MVC. We need to create views folder inside the WEB-INF. 
			<bean id="viewResolver" class="org.springframework.web.servlet.view.InternalResourceViewResolver">
				<property name="prefix" value="/WEB-INF/views/"></property>
				<property name="suffix" value=".jsp"></property>
			</bean>
			
		>>>> The below is to configure the datasource used with JDBC.
			<bean id="dataSource" class="org.springframework.jdbc.datasource.DriverManagerDataSource">
				<property name="driverClassName" value="com.mysql.jdbc.Driver" />
				<property name="url" value="jdbc:mysql://localhost:3306/DAC2018" />
				<property name="username" value="root" />
				<property name="password" value="" />
			</bean>	
			

		>>>> Following DI used in DAO class.			
			<bean id="jdbcTemplate" class="org.springframework.jdbc.core.JdbcTemplate">
				<property name="dataSource" ref="dataSource"></property>
			</bean>	
			
		>>>> Please take reference of spring-servlet.xml from first-spring project. 			 



>> Spring MVC Implementation of Controller and Views.
	


>> Session Management

