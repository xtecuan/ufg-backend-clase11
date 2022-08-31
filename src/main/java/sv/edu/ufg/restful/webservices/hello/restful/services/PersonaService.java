/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.edu.ufg.restful.webservices.hello.restful.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import javax.enterprise.context.ApplicationScoped;
import sv.edu.ufg.restful.webservices.hello.restful.model.Persona;

/**
 *
 * @author xtecuan
 */
@ApplicationScoped
public class PersonaService {

    private static final int SIZE = 100;
    private static List<Persona> personasDB;

    static {

        personasDB = new ArrayList<>();

        for (int i = 1; i <= SIZE; i++) {
            Persona p = new Persona(Integer.valueOf(i).longValue(), "Nombre_" + i,
                    "Apellido_" + i);
            personasDB.add(p);
        }

    }

    public List<Persona> findAll() {
        return personasDB;
    }

    public Persona findById(final Long idPersona) {

        List<Persona> personasFiltradas = personasDB.stream()
                .filter(p -> p.getIdPersona().longValue() == idPersona)
                .collect(Collectors.toList());
        if (personasFiltradas.isEmpty()) {
            return null;
        } else {
            return personasFiltradas.get(0);
        }

    }

    public Persona save(Persona p) {
        Integer idPersona = personasDB.size() + 1;
        p.setIdPersona(idPersona.longValue());
        personasDB.add(p);
        return p;
    }

    public Persona update(Persona p, Long idPersona) {
        Persona found = findById(idPersona);
        if (found != null) {
            personasDB.remove(found);
            found.setApellidos(p.getApellidos());
            found.setNombres(p.getNombres());
            found.setEmail(p.getEmail());
            found.setSexo(p.getSexo());
            personasDB.add(found);
        }
        return found;
    }

    public void delete(Long idPersona) {
        Persona found = findById(idPersona);
        if (found != null) {
            personasDB.remove(found);
        }
    }

}
