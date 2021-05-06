package pl.pjatk.core;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/homework")
public class HomeworkController {


    @GetMapping("/{x}")
    public ResponseEntity<String> getPathVar(@PathVariable String x){
        return ResponseEntity.ok(x);
    }

    @GetMapping("/something")
    public ResponseEntity<String> getReqParam(@RequestParam String x){
        return ResponseEntity.ok(x);
    }


    @PutMapping("/update_something/{x}")
    public ResponseEntity<String> update(@RequestBody String newValue, @PathVariable String x){
        return ResponseEntity.ok(String.format("RequestBody: \n%s\n" +
                "PathVariable: %s", newValue, x ));
    }


    @PostMapping("/post_something")
    public ResponseEntity<String> post(@RequestBody String x){
        return ResponseEntity.ok(x);
    }


    @DeleteMapping("/delete_something/{x}")
    public ResponseEntity<HttpStatus> delete(@PathVariable String x){
        return ResponseEntity.ok().build();
    }
}
