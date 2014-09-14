/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.ecabrerar.ejemplos.javaee7.serviciorest.basico;

import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 *
 * @author ecabrerar
 */
@Path("holauapa")
public class HolaUapa {
    
    @GET
    @Path("saludar/{name}")
    @Produces("text/plain")    
    public String saludar(@PathParam("name") String name) {
        return "Enhorabuena " + (name == null ? "" : name) + " !";
    }
    
    @GET
    @Path("html")
    @Produces("text/html")
    public String getHtml() {
        return "<html lang=\"en\"><body><h1>Hola Uapa!!</h1></body></html>";
    }
    
    @GET
    @Path("saludarJson/{name}")
    @Produces("application/json")
    public String saludarJson(@PathParam("name") String name) {
        
       JsonObject jsonObject = Json.createObjectBuilder()
                .add("saludar", "Enhorabuena " + (name == null ? "" : name) + " !")                
                .build();
        
     return jsonObject.toString();
    }
    
}
