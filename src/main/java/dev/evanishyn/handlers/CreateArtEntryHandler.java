package dev.evanishyn.handlers;

import com.google.gson.Gson;
import dev.evanishyn.app.App;
import dev.evanishyn.entities.Artwork;
import io.javalin.http.Context;
import io.javalin.http.Handler;
import org.jetbrains.annotations.NotNull;

public class CreateArtEntryHandler implements Handler {
    @Override
    public void handle(@NotNull Context ctx) throws Exception{
        String body = ctx.body();
        Gson gson = new Gson();
        Artwork artwork= gson.fromJson(body,Artwork.class);


        App.artworkList.add(artwork);
        ctx.status(201);
        ctx.result("Added new artwork to your inventory");

        System.out.println(App.artworkList);
    }


}
