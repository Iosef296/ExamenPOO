package pe.edu.upeu.tresenraya.servicios;

import pe.edu.upeu.tresenraya.modelo.TresEnRayaTO;

import java.util.List;

public interface TresEnRayaServiciosI {

    //C = CREATE (CREAR)
    public void save(TresEnRayaTO to);

    //R = READ (LEER)
    public List<TresEnRayaTO> findAll();
    public TresEnRayaTO findById(int index);

    //U = UPDATE (ACTUALIZAR)
    public void update(TresEnRayaTO to, int index);

    //D = DELETE (ELIMINAR)
    public void delete(TresEnRayaTO to);
    public void deleteById(int index);
}
