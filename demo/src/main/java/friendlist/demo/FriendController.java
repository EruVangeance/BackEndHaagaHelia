package friendlist.demo;

import friendlist.demo.Friend;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/index")
public class FriendController {

    private List<Friend> friends = new ArrayList<>();

    @GetMapping
    public String index(Model model) {
        model.addAttribute("friends", friends);
        return "index";
    }

    @PostMapping("/addFriend")
    public String addFriend(@RequestParam String friendName) {
        friends.add(new Friend(friendName));
        return "redirect:/index";
    }
}

