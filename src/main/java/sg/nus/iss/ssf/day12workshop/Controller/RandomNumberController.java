package sg.nus.iss.ssf.day12workshop.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(path = "/api")
public class RandomNumberController {

    @GetMapping("/home")
    public String landingPage() {
        return "home";
    }
}
