package net.mooko.moosm.demo

import net.mooko.moosm.auth.entity.User
import net.mooko.moosm.auth.persistence.shared.UserMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.ModelMap
import org.springframework.web.bind.annotation.RequestMapping

@Controller
public class GroovyController {
    @Autowired
    UserMapper mapper

    @RequestMapping("groovy")
    def index(ModelMap model) {
        def user = new User()
        user.name = "puras"
        user.email = "he@puras.me"
        user.passwd = "123456"
        mapper.insert(user)
        model.addAttribute("demo", "这里是Groovy测试")
        "dashboard"
    }
}