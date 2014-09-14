package org.ecabrerar.ejemplos.javaee7.rest.cliente;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

/**
 *
 * @author ecabrerar
 */
public class SimpleClienteRest {

    public static void main(String[] args) {
        Client client = javax.ws.rs.client.ClientBuilder.newClient();
        WebTarget target = client.target("http://localhost:8080/javaee7-serviciorest-basico/rest/holauapa/saludarJson/UAPA");

        Response response = target.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get();
        //Read output in string format
        String value = response.readEntity(String.class);
        System.out.println(value);

        response.close();
    }
}
