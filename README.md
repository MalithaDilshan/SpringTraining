# Spring-Java Based web development training

# [01] Creating simple JSP based Spring-MVC project  
*Configure the Apache TomCat server using the 'Smart Tomcat' option*
  1. Search and install the Smart Tomcat plugin
  
  ![image](https://user-images.githubusercontent.com/19968541/134178554-c90a6ff1-2b2f-4617-9b8a-e22804cf18a2.png)
  
  2. Setup the Local server

  ![image](https://user-images.githubusercontent.com/19968541/134178941-466d0bab-5b9b-4e93-bd25-86a89aff1d35.png)
  
  ![image](https://user-images.githubusercontent.com/19968541/134179053-98a75a99-7ce3-461e-bbed-1ce65486f756.png)

  ![image](https://user-images.githubusercontent.com/19968541/134182714-57e7a0e9-c0cd-4923-b740-e1dbdfb34772.png)

  
*Tesing URL
  http://localhost:9090/Spring_MVC_Training_01/add?t1=1&t2=4
  


*Get the first page according to the url
![image](https://user-images.githubusercontent.com/19968541/136645567-967eefc3-c861-4098-9509-86861ea5031c.png)

![image](https://user-images.githubusercontent.com/19968541/136645643-dd92ab30-3e60-46e1-8997-264ad96e1e5f.png)


*When hitting the submit botton it will perform the "add" action. According to that it will get the JSP page result and display in the browser
![image](https://user-images.githubusercontent.com/19968541/136645617-f49df5b4-ff68-4ce0-b851-4043a1a4ae50.png)

![image](https://user-images.githubusercontent.com/19968541/136645628-3e64c630-0eca-49b7-bf91-1c32ac88a19e.png)


# [02] Project for Spring framework dependency injection concept using the configured xml 

Simply this project created using the 'quickStart arctype' and added the relevent dependencies for the Spring framework.
Basically this project will demostrate the dependency injection concept in the Spring to acheive the 'Loose coupling' by 
configuring the bean.xml file

*Simple bean definition in the xml
![image](https://user-images.githubusercontent.com/19968541/137922117-d80b204f-5b3c-4fa5-b9fa-01d5ed88f92a.png)

*Usage of the bean.xml file for getting the Animal object
![image](https://user-images.githubusercontent.com/19968541/137922534-bc755afd-ac70-468c-add0-357a2d2a424a.png)

*This is the bean configuration for the Annotation based implementation. Here we can directy call the dependent class with the name.
![image](https://user-images.githubusercontent.com/19968541/137922762-04c4bcba-a48e-4a2c-9048-9181103d6795.png)


![image](https://user-images.githubusercontent.com/19968541/137923247-b6c2636b-5d12-494c-8fd2-28d80efd53e1.png)
![image](https://user-images.githubusercontent.com/19968541/137923327-4339bfd7-171f-4624-9487-f03f09d180c9.png)

*Autowired implementation ( With construction injection )
![image](https://user-images.githubusercontent.com/19968541/137923622-6b9bdb55-ff5c-4fda-a9fe-bc935ef1b753.png)

![image](https://user-images.githubusercontent.com/19968541/137923759-5b3426cb-75c0-40fd-b5d9-be0a6443349a.png)


# [03] Project for Spring core annotation based implementation

![image](https://user-images.githubusercontent.com/19968541/137966092-00aed7bb-1da1-40cb-9359-c11d0c516d53.png)

1. Use the getter for beans with @Configuration annotation 

![image](https://user-images.githubusercontent.com/19968541/137965128-62874e87-29fc-457d-9ca4-f8491ad509b7.png)

2. Use the @ComponentScan annotation to scan all the components (beans) without getters. It should be declare the @Component annotation and @Autowired for dependent classes

![image](https://user-images.githubusercontent.com/19968541/137965358-8673d531-a384-45f7-87c7-ed3fece96bc3.png)
![image](https://user-images.githubusercontent.com/19968541/137965619-3c313e3f-7750-4c50-95ab-1d14f6546e68.png)
![image](https://user-images.githubusercontent.com/19968541/137965688-cefca85d-d531-4cc5-a257-16a31389445c.png)

3. If there are several implemntation under a interface for the dependent class, need to use @Primary annotation or @Qualifier annotation to avoid the confusion 

![image](https://user-images.githubusercontent.com/19968541/137965877-f3c32740-da6c-45fc-84ec-1fd31d667a6e.png)  

![image](https://user-images.githubusercontent.com/19968541/137966022-b420d859-c629-443c-992e-b056e41c5897.png)



