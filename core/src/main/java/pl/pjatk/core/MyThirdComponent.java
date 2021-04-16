package pl.pjatk.core;

import org.springframework.stereotype.Component;

@Component
public class MyThirdComponent {

    public MyThirdComponent(MyFirstComponent myFirstComponent, MySecondComponent mySecondComponent) {
        System.out.println("Hello from MyThirdComponent");
        myFirstComponent.printHelloFromMethodFirstController();
        mySecondComponent.printHelloFromMethodSecondController();
    }
}
