package com.rahul.springboot.FirstProject.controller;

import com.rahul.springboot.FirstProject.dao.AlienDao;
import com.rahul.springboot.FirstProject.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Optional;

// NOTE if you dont want to mention @ResponseBody everytime, i.e you will be returning json data everytime use
//  RestController
// @Controller
@RestController
public class HomeController {

    @Autowired
    AlienDao alienDao;

    @RequestMapping("home")
    //@ResponseBody
    // to render the html page, use thymeleaf.
    // do this for disabling thymlead
    // spring.thymeleaf.enabled=false
    public String home() {
        System.out.println("Hello REST API ****");
        return "home";
    }

    @RequestMapping("home1")
    // localhost:8080/home1?name=Rahul
    public String returnName(HttpServletRequest request) {
        String name = request.getParameter("name");
        System.out.println("Name is: " + name);

        HttpSession session = request.getSession();
        session.setAttribute("name", name);
        return "home";
    }

    @RequestMapping("home2")
    @ResponseBody
    // if you don't use ResponseBody, theymleaf will try to search for RahulRajput.html
    //what if you have multiple params
    // localhost:8080/home2?name=Rahul&caste=Rajput
    public String returnMultipleParams(@RequestParam("name") String myName, @RequestParam("caste") String caste){
        return myName + caste;
    }

    @RequestMapping("/addAlien")
    @ResponseBody
    // NOTE
    // The @ResponseBody annotation tells a controller that the object returned is automatically serialized into JSON
    // and passed back into the HttpResponse object.

    // Now what the annotation means is that the returned value of the method will constitute the body of the HTTP
    // response. Of course, an HTTP response can't contain Java objects.
    // So this list of accounts is transformed to a format suitable for REST applications, typically JSON or XML.

    // NOTE
    // Simply put, the @RequestBody
    // annotation maps the HttpRequest body to a transfer or domain object, enabling automatic deserialization of the
    // inbound HttpRequest body onto a Java object.
    // public ResponseEntity postController(
    //  @RequestBody LoginForm loginForm)
    // public class LoginForm {
    //    private String username;
    //    private String password;
    //    // ...
    //}

    // this will take alien's id and name, will store it in db.
    // enable h2 in application.properties
    // localhost:8080/home2?aid=Alien12&name=AlienSachin
    // or you can directly pass alien. It will match the params with the class variables, and based on that route
    // request.
    // http://localhost:8080/h2-console/login.do?jsessionid=76bbb3278ad2f7fd6dd5d01c6347abf8
    public void add(Alien alien){
        alienDao.save(alien);
    }

    @RequestMapping("/getAlienByName")
    @ResponseBody
    public String getAlienByTech(@RequestParam String tech){
        List<Alien> alist = alienDao.findByTechSorted(tech);
        System.out.println("TESTING AUTORELOADING");
        return alist.toString();
    }

    // localhost:8080/alien/102
    // localhost:8080/aliens
    // this looks better, give me alien 102
    // NOTE: REST
    @GetMapping("/aliens")
    // by default when you do return string, it will expect that we are returning a view name.
    // but we are retuning data. than do this
    // spring boot uses Jackson to convert java objects to json
    public List<Alien> getAliens(){
        return alienDao.findAll();
    }

    @PostMapping("/alien")
    public Alien addAlien(@RequestBody Alien alien){
        alienDao.save(alien);
        return alien;
    }

    // NOTE: wildcard
    @RequestMapping("/alien/{aid}")
    @ResponseBody
    public Optional<Alien> getAlien(@PathVariable("aid") int aid){
        return alienDao.findById(aid);
    }

}
