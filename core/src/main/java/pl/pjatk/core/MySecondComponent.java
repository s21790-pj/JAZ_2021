package pl.pjatk.core;

import org.springframework.stereotype.Component;

@Component
public class MySecondComponent {


    public MySecondComponent(MyFirstComponent myFirstComponent) {
        System.out.println("Hello from MySecondComponent");
        //MyFirstComponent myFirstComponent = applicationContext.getBean("myFirstComponent", MyFirstComponent.class);
        myFirstComponent.printHelloFromMethodFirstController();

    }

    public void printHelloFromMethodSecondController() {
        System.out.println("Hello from MyFirstComponent.printHelloFromMethod");
    }
}
