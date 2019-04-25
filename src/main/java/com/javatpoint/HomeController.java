package com.javatpoint;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;  
@RestController  
public class HomeController {  
    @RequestMapping("/home")  
    public String home(){  
        return"Hello! afshar miah ! welcome to spring framework";  
    }  
}  