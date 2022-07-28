package dev.evanishyn.handlers;

import com.google.gson.Gson;
import dev.evanishyn.app.App;
import dev.evanishyn.entities.Artwork;
import io.javalin.http.Context;
import io.javalin.http.Handler;
import org.jetbrains.annotations.NotNull;



public class GetSpecificArtworkHandler implements Handler {
    @Override
    public void handle(@NotNull Context ctx) throws Exception{
        int id = Integer.parseInt(ctx.pathParam("id"));

        Artwork artwork;

        for(Artwork aw : App.artworkList){
            if(aw.getId() == id){
                artwork = aw;
                Gson gson = new Gson();
                String json = gson.toJson(artwork);
                ctx.result(json);
                return;
            }
        }
        ctx.status(404);
        ctx.result("Artwork not found!");

    }

}
