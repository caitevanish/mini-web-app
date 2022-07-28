package dev.evanishyn.app;

import dev.evanishyn.entities.Artwork;
import dev.evanishyn.handlers.CreateArtEntryHandler;
import dev.evanishyn.handlers.GetAllArtworkHandler;
import dev.evanishyn.handlers.GetSpecificArtworkHandler;
import io.javalin.Javalin;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static List<Artwork> artworkList = new ArrayList();

    public static void main(String[] args) {
        Javalin app = Javalin.create();

        CreateArtEntryHandler createArtEntry = new CreateArtEntryHandler();
        GetSpecificArtworkHandler getSpecificArtwork = new GetSpecificArtworkHandler();
        GetAllArtworkHandler getAllArtwork = new GetAllArtworkHandler();

        app.get("/artwork", getAllArtwork);
        app.get("/artwork/{id}", getSpecificArtwork);
        app.post("/artwork/new", createArtEntry);

        app.start();
    }
}
