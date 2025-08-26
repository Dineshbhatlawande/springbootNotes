package nimap.learning_project.ThreadLocks;

public class UnderstandingMaven {

    /*

    Q. why maven ?
    -> easy to manage dependency just add dependency in pom.xml(No need to download jar manually and then loading the jar)
    -> gives predefined project structure (so that all dev team follow same)
    -> gives easy way to make jar file of project

    Q. What is Maven?
    -> Maven is open source project mgmt tool
    -> developed by apache foundation 2004
    -> helps developer to create,build and manage java based applications.

    1) what is maven Archetype
    -> it just a structure (template) for creating the project.
    -> IJ idea,eclipse,vs code have different structure.
    -> pros:change the id structure of project is consistent.
    -> we can develop our own archetype so that the company can follow the same structure.
    -> maven-archetype-quickStart , maven-archetype-webApp (jsp)(WEB-INF-> web.xml)

    2) what is pom.xml  (it is heart of maven project)
    -> xml based configuration file
    -> contains everything about the project (name,version,organization,dependencies,build configuration)

    <groupId>nimap</groupId>
	<artifactId>learning_project</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<name>learning_project</name>
	<description>Demo project for Spring Boot</description>
    <properties>
		<java.version>21</java.version>
	</properties>
	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>         (identifies organization that provides the library.)
			<artifactId>spring-boot-starter-test</artifactId>   (name of the actual library (JAR file).
			<scope>test</scope>
			       -> runtime (required during runtime e.g, JDBC drivers.)
			       -> test  (used o=for testing only)
			       -> compile (Default scope. Available in all class paths (compile, test, runtime,Packaging JAR)
			       -> provided (Required for compilation but not included in final build (provided by container like Tomcat).)
			       -> import (Used only with dependencyManagement for BOM imports.)

		</dependency>
	</dependencies>

	3) Maven Repository  (3 types)
	-> Place which store everything required by a maven project (dependencies,artifacts,plugins)
	-> 1) Local Repository(.m2 in local storage of your computer)
	-> 2) Central Repository (download the dependency from https://mvnrepository.com/)
	-> 3) Remote Repository  (place where we can upload our own libraries and get that from Remote) (private libraries)
	       <repositories>   // write this in pom.xml
                 <repository>
                    <id>my-company-repo</id>
                    <url>https://repo.mycompany.com/maven2</url>
                 </repository>
           </repositories>

           first check -> local repo(?)-> yes (use) -> No (check in central repository)-> yes (use)
           -> no (check in Remote Repo)-> yes download it and keep in local Repository )











    */
}
