/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.ecabrerar.ejemplos.javaee7.jsonp.creacionobjetos;

import java.io.StringWriter;
import javax.json.Json;
import javax.json.stream.JsonGenerator;
import javax.json.stream.JsonGeneratorFactory;

/**
 * Ejemplo con el Streaming APIs
 * @author ecabrerar
 */
public class ObjetoSimpleConStream {
    public static void main(String[] args) {
        JsonGeneratorFactory factory = Json.createGeneratorFactory(null);
        StringWriter w = new StringWriter();
        JsonGenerator gen = factory.createGenerator(w);

        gen
                .writeStartObject()
                .write("apple", "red")
                .write("banana", "yellow")
                .writeEnd();
        gen.flush();
        
        System.out.println(""+ w.toString());
    }
}
