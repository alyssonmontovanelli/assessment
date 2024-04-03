package controllers;

import spark.Request;
import spark.Response;

public class ApiController {

    public static String getUsers(Request req, Response res) {
        // Lógica para obter usuários da API
        return "Lista de usuários";
    }
}