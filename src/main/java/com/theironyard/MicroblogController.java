package com.theironyard;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;

import static java.lang.Integer.valueOf;

/**
 * Created by BUBBABAIRD on 5/8/17.
 */
@Controller
public class MicroblogController {
    ArrayList<Message> messages = new ArrayList<>();

    // home page GET request
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String home(Model model, HttpSession session) {
        // we need references to the current session
        // and the model to render this page.

        // add the name attribute to the model. set it to whatever
        // we get from session.
        model.addAttribute("name", session.getAttribute("name"));
        model.addAttribute("messages", messages);
        return "home";
    }
    @RequestMapping(path = "/login", method = RequestMethod.POST)
    public String login(HttpSession session, String name) {
        // userName comes from the form. MUST MATCH
        // THE NAME ATTRIBUTE ON THE FORM ITSELF
        session.setAttribute("name", name);
        return "redirect:/";
    }
    @RequestMapping(path = "/add-message", method = RequestMethod.POST)
    public String postMessage(HttpSession session, String messageText) {
        // make a new message object
        Message m = new Message(messageText);
        // put the message object in our arrayList
        messages.add(m);
        // redirect back to the root page
        return "redirect:/";
    }
    @RequestMapping(path = "/delete-message", method = RequestMethod.POST)
    public String deleteMessage(HttpSession session, int id) {
        //
        for(Message m : messages) {
            if (m.getId() == id) {
                messages.remove(m);
                break;
            }
        }
        return "redirect:/";
    }
}
