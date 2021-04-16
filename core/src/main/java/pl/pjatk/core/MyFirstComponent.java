package pl.pjatk.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyFirstComponent {

    public MyFirstComponent(SimpleClass simpleClass,
                            List<String> defaultData,
    @Value("${my.custom.property}") String homework_value)
    {
        System.out.println("Hello from MyFirstComponent");
        simpleClass.shoutSomething();
        System.out.println(defaultData);
        System.out.println(homework_value);

    }

    public void printHelloFromMethodFirstController() {
        System.out.println("Hello from MyFirstComponent.printHelloFromMethod");
    }
}
