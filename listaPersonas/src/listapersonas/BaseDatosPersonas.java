/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listapersonas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author yeiim
 */
public class BaseDatosPersonas {
    private HashMap<Integer, Persona> listaPersonas = new HashMap<>();

    public BaseDatosPersonas() {
        listaPersonas.put(1, new Persona(1, "Eliana", 1006647625));
        listaPersonas.put(2, new Persona(2, "Edwin", 339876));
        listaPersonas.put(3, new Persona(3, "Yuliana", 342085764));
        listaPersonas.put(4, new Persona(4, "Yuli", 7654832));
        listaPersonas.put(5, new Persona(5, "Carlos", 8736523));
    }
    
    public List<Persona> getListaPersonas(){
        return new ArrayList<>(listaPersonas.values());
    }
    
    public void setListaPersonas(HashMap<Integer, Persona> listaP){
        this.listaPersonas = listaP;
    }
    
    public boolean verificarExistencia(Persona persona) {
        return listaPersonas.containsKey(persona.getCodigo());
    }
    
    public boolean verificarExistencia(String nombre) {
        for (Persona p : listaPersonas.values()) {
            if (nombre.toLowerCase().equals(p.getNombre().toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    public void agregar(Persona persona) {
        listaPersonas.put(persona.getCodigo(), persona);
    }

    public void actualizar(Persona persona) {
        listaPersonas.replace(persona.getCodigo(), persona);
    }

    public void borrar(Persona persona) {
        listaPersonas.remove(persona.getCodigo());
    }
     
}
