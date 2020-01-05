package pl.axolotl.cleanweb.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.axolotl.cleanweb.config.services.user.CurrentUserProvider;
import pl.axolotl.cleanweb.services.person.Person;
import pl.axolotl.cleanweb.services.person.PersonService;

import java.util.List;

@Controller
@AllArgsConstructor
public class MainController {

    private final PersonService personService;
    private final CurrentUserProvider currentUserProvider;

    @GetMapping("/")
    String getMainPage(Model model) {
        model.addAttribute("persons", personService.getAllPersons());
        model.addAttribute("username", currentUserProvider.getUsername());
        return "index";
    }
}