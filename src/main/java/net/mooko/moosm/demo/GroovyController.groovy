package net.mooko.moosm.demo

import org.springframework.stereotype.Controller
import org.springframework.ui.ModelMap
import org.springframework.web.bind.annotation.RequestMapping

@Controller
public class GroovyController {

    @RequestMapping("groovy")
    def index(ModelMap model) {
        model.addAttribute("demo", "这里是Groovy测试")
        "dashboard"
    }
}