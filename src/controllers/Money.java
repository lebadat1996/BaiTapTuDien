package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Controller
public class Money {
    @GetMapping("/convert")
    public String test() {
        return "index";
    }

    @PostMapping("/converts")
    public String library(@RequestParam String name, Model model) {
        Map<String, String> list = new HashMap<>();
        list.put("hello", "Xin chao");
        list.put("class", "lop hoc");
        list.put("home", "ngoi nha");
        list.put("student", "hoc sinh");
        Set<String> set = list.keySet();
        for (String keySet : set) {
            if (name.equals(keySet)) {
                model.addAttribute("values", list.get(keySet));
            }
        }
        return "index";
    }
}