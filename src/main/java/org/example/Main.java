package org.example;

import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {

        String port = System.getenv("PORT");
        if (port != null) {
            port(Integer.parseInt(port));
        }
        get("/", (req, res) -> "Hello World!");
        
    }
}
