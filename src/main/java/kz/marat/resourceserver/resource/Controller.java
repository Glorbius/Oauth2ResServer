package kz.marat.resourceserver.resource;


import kz.marat.resourceserver.models.Entity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/information")
public class Controller {


    Entity entity = new Entity(1,"Zhomart","zhoma123");


    @GetMapping("/name")
    @ResponseBody
    public String getName() {
        return entity.getName();
    }

    @GetMapping("/password")
    @ResponseBody
    public String getPassword() {
        return entity.getPassword();
    }

}
