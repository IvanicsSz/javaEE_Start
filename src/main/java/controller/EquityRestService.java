package controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

@Path("/book")
//@Stateless
public class EquityRestService {

    @Context
    private UriInfo uriInfo;

//    @PersistanceContex(unitName = "aa")
//    private EntityManager em;

//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public Books getBooks(){
//        TypedQuery<Book> query = em.createNamedQuery
//    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String book(){
        return "H2ls";
    }
}