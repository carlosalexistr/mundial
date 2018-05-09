/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipoDAO;

import dao.AbstractDAO;
import model.Equipo;
import java.util.List;
import javax.transaction.Transactional;

/**
 *
 * @author estudiante
 */
public class EquipoDAOImpl extends AbstractDAO implements EquipoDAO{
    
    
     public EquipoDAOImpl() {
        super(Equipo.class);
    }

    public List<Equipo> findAll() {
        return (List<Equipo>)super.findAll();
    }

    public Equipo findById(Integer id) {
        return (Equipo) super.findByKey(id);
    }

    @Transactional
    public Equipo save(Equipo equipo) {
        super.save(equipo);
        return (Equipo) super.findByKey(equipo.getId());
    }

    public void delete(Equipo equipo) {
        super.delete(equipo);
    }

    public void deleteById(Integer id) {
        super.deleteByKey(id);
    }

    @Transactional
    public Equipo update(Equipo equipo) {
        return (Equipo) super.update(equipo);
    }
    
}
