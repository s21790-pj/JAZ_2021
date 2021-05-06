package pl.pjatk.core;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class SimpleController {

    @GetMapping("/hello_my")
    ResponseEntity<String> hello() {
        return new ResponseEntity<>("Hello World!", HttpStatus.OK);
    }

    @GetMapping("/hello")
    public ResponseEntity<String> getHelloWorld() {
        return ResponseEntity.ok("Hello world");
    }

    @GetMapping("/abc")
    public ResponseEntity<String> getHelloWorldABC() {
        return ResponseEntity.status(HttpStatus.OK).body("Hello world ABC");
    }

//    @GetMapping("/model")
//    public ResponseEntity<Car> getCar() {
//        return ResponseEntity.ok(new Car("Opel", 2));
//    }

    @GetMapping("/model")
    public ResponseEntity<Car> getCarPost(@RequestBody Car car) {
        return ResponseEntity.ok(car);
    }




}
