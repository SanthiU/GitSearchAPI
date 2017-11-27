package com.codetest.git;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.apache.http.client.HttpClient;

@Path("/user")
public class Finder {

    @GET
    @Produces("text/plain")
    @Path("{id}")
    public String getUser(@PathParam("id") String id) {
     /*   String url = "https://api.github.com/users/" + id + "/followers" ;
        HttpClient client = new DefaultHttpClient();
        HttpGet request = new HttpGet(params[0]);
        HttpResponse response;
        String result = null;

        try {
        response = client.execute(request);
        HttpEntity entity = response.getEntity();

        if (entity != null) {
            InputStream instream = entity.getContent();
        }
        } catch (IOEXception ioe) {
            ioe.printstacktrace();
        }
        */


        return "Got it!";
    }

}
