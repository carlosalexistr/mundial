/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipoDAO;

import model.Equipo;
import java.util.List;


/**
 *
 * @author estudiante
 */
public interface EquipoDAO {
    
    List<Equipo> findAll();
    
    Equipo findById(Integer id);
    
    Equipo save(Equipo equipo);
    
    void delete(Equipo poll);
    
    void deleteById(Integer id);
    
    Equipo update(Equipo poll);
    
}
