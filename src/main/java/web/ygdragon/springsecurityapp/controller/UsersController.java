package web.ygdragon.springsecurityapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsersController {
    /**
     * Default application endpoint
     *
     * @return Default HTML page
     */
    @GetMapping("/")
    public String transitionIndex() {
        return "index";
    }

    /**
     * Endpoint for users of the USER role
     *
     * @return Private HTML page
     */
    @GetMapping("/public-data")
    public String transitionPublic() {
        return "public-data";
    }

    /**
     * Endpoint for users of the ADMIN role
     *
     * @return Public HTML page
     */
    @GetMapping("/private-data")
    public String transitionPrivate() {
        return "private-data";
    }

    /**
     * User authentication endpoint
     *
     * @return Authentication HTML page
     */
    @GetMapping("/login")
    public String transitionLogin() {
        return "login";
    }

    /**
     * Endpoint for authenticated users
     *
     * @return Content HTML page
     */
    @GetMapping("/content")
    public String transitionContent() {
        return "content";
    }

    /**
     * No-access endpoint
     *
     * @return No-access HTML page
     */
    @GetMapping("/no-access")
    public String transitionNoAccess() {
        return "no-access";
    }
}