/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/GenericResource.java to edit this template
 */
package sv.edu.ufg.restful.webservices.hello.restful;

import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import sv.edu.ufg.restful.webservices.hello.restful.model.Persona;
import sv.edu.ufg.restful.webservices.hello.restful.services.PersonaService;

/**
 * REST Web Service
 *
 * @author xtecuan
 */
@Path("personas")
public class PersonaResource {

    @Context
    private UriInfo context;

    @Inject
    private PersonaService service;

    /**
     * Creates a new instance of GenericResource
     */
    public PersonaResource() {
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Persona> findAll() {
        //TODO return proper representation object
        return service.findAll();
    }

    @GET
    @Path("{idPersona}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Persona findById(@PathParam("idPersona") Long idPersona) {
        return service.findById(idPersona);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Persona save(Persona p) {
        return service.save(p);
    }

    @PUT
    @Path("{idPersona}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Persona update(Persona p, @PathParam("idPersona") Long idPersona) {
        return service.update(p, idPersona);
    }

    @DELETE
    @Path("{idPersona}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void update(@PathParam("idPersona") Long idPersona) {
        service.delete(idPersona);
    }
}
