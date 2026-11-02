// package com.springservlet;


// import org.apache.catalina.Context;
// import org.apache.catalina.LifecycleException;
// import org.apache.catalina.startup.Tomcat;

// public class App 
// {
//     public static void main( String[] args ) throws LifecycleException
//     {
//         System.out.println( "Hello World!" );
//         Tomcat tomcat = new Tomcat();
//         tomcat.setPort(8083);
        
//         Context context = tomcat.addContext("", null);
//         tomcat.addServlet(context,"HelloServlet",new Helloservlet());   
//         context.addServletMapping("/hello","HelloServlet");


//         tomcat.start();
//         tomcat.getServer().await();
//     }
// }



package com.springservlet;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class App {
    public static void main(String[] args) throws LifecycleException {

        System.out.println("Hello World!");

        Tomcat tomcat = new Tomcat();

        tomcat.setPort(8083);

        Context context = tomcat.addContext("", null);

        tomcat.addServlet(context, "HelloServlet", new Helloservlet());

        context.addServletMapping("/hello", "HelloServlet");

        tomcat.getConnector();

        tomcat.start();

        System.out.println("Tomcat running at http://localhost:8083/hello");

        tomcat.getServer().await();
    }
}