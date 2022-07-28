package dev.evanishyn.app;

import dev.evanishyn.handlers.CreateArtEntryHandler;
import dev.evanishyn.handlers.GetAllArtworkHandler;
import dev.evanishyn.handlers.GetSpecificArtworkHandler;
import io.javalin.Javalin;

public class App {
    public static void main(String[] args) {
        Javalin app = Javalin.create();

        CreateArtEntryHandler createArtEntry = new CreateArtEntryHandler();
        GetSpecificArtworkHandler getSpecificArtwork = new GetSpecificArtworkHandler();
        GetAllArtworkHandler getAllArtwork = new GetAllArtworkHandler();

    }
}
