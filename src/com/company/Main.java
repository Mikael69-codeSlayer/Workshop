package com.company;

import express.Express;

import static express.database.Database.collection;

public class Main {

    public static void main(String[] args) {
        Express app = new Express();

        app.enableCollections("database/temp/db/awesome.db");

        app.get("/hello", (req, res) -> {
            res.send("<h1>Hello from Java Express!</h1>");
        });

        app.get("/rest/pokemon", (req, res) -> {
            var pokemon = collection("Pokemon").find();
            res.json(pokemon);
        });

        app.listen(4000);
    }
}
