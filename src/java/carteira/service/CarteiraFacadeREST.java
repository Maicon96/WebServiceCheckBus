/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carteira.service;

import carteira.Carteira;
import java.util.List;
import javax.ejb.Stateless;
import javax.json.JsonArray;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 *
 * @author maico
 */
@Stateless
@Path("carteira.carteira")
public class CarteiraFacadeREST extends AbstractFacade<Carteira> {
    @PersistenceContext(unitName = "ConexaoCarteiraPU")
    private EntityManager em;

    public CarteiraFacadeREST() {
        super(Carteira.class);
    }

    @POST
    @Path("create")
    @Consumes("application/json")
    public void create(JsonArray dto) {
        System.out.println("teste: " + dto);
        Carteira entity = new Carteira();
        
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") Integer id, Carteira entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public Carteira find(@PathParam("id") Integer id) {
        return super.find(id);
    }

    @GET
    @Override
    @Path("find/all")
    @Produces("application/json")
    public List<Carteira> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<Carteira> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces("text/plain")
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
