package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class TranslateController {
    public static Map<String, String> dictionary;

    static {
        dictionary = new HashMap<>();

        dictionary.put("hello", "Xin Chao");
        dictionary.put("book", "Sach");
        dictionary.put("fish", "Con ca");
    }



    @GetMapping("/")
    public String index(){
        return "index";
    }


    @GetMapping("/translate")

    public String translate(@RequestParam("word") String word, Model model) {
        model.addAttribute("word", word);

        String value = dictionary.get(word);
        model.addAttribute("value", value);

        return "result";
    }
}
