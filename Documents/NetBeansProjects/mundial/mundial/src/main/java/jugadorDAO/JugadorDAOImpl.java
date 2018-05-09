/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugadorDAO;

import dao.AbstractDAO;
import model.Jugador;
import model.JugadorPK;
import java.util.List;
import javax.transaction.Transactional;

/**
 *
 * @author estudiante
 */
public class JugadorDAOImpl extends AbstractDAO implements JugadorDAO{
    
    public JugadorDAOImpl() {
        super(Jugador.class);
    }

    public List<Jugador> findAll() {
        return (List<Jugador>) super.findAll();
    }

    public Jugador findById(JugadorPK id) {
        return (Jugador)super.findByKey(id);
    }

    @Transactional
    public Jugador save(Jugador jugador) {
        super.save(jugador);
        return this.findById(jugador.getJugadorPK());
    }

    public void delete(Jugador jugador) {
        super.delete(jugador);
    }

    public void deleteById(JugadorPK id) {
        super.deleteByKey(id);
    }

    @Transactional
    public Jugador update(Jugador jugador) {
        return (Jugador) super.update(jugador);
    } 
    
    
}
