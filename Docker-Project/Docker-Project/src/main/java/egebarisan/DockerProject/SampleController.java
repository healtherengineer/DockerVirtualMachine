package egebarisan.DockerProject;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
@CrossOrigin
public class SampleController {

    @GetMapping("hello")
    public String hello(){
        return "Hello Docker !!!";
    }
}
