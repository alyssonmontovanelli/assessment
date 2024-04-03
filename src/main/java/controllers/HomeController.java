package controllers;

import spark.Request;
import spark.Response;
import java.util.HashMap;
import java.util.Map;

public class HomeController {

    public static String home(Request req, Response res) {
        Map<String, Object> model = new HashMap<>();
        return spark.ModelAndView(model, "home.ftl");
    }
}