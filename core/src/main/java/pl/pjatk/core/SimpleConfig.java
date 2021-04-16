package pl.pjatk.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SimpleConfig {


    @Bean
    public SimpleClass simpleClass() {
        System.out.println("Hello from simpleClass");
        return new SimpleClass(1,2,"sample");
    }

    @Bean
    public List<String> defaultData(){
        return List.of("sample1", "sample2", "sample3", "sample4", "sample5");
    }

    @Value("${default_value}") Boolean homework_value;
    @Bean
    @ConditionalOnProperty(name="default_value", havingValue = "true")
    public void homework_bean(){
        System.out.println(">>>>>>" + homework_value + "<<<<<<<<");
    }


}
