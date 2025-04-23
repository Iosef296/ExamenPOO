package pe.edu.upeu.tresenraya.servicios;

import org.springframework.stereotype.Service;
import pe.edu.upeu.tresenraya.modelo.TresEnRayaTO;

import java.util.ArrayList;
import java.util.List;

@Service
public class TresEnRayaServiciosImp implements TresEnRayaServiciosI {

    List<TresEnRayaTO> datos= new ArrayList<>();

    //C = CREATE (CREAR)
    @Override
    public void save(TresEnRayaTO to) {
        datos.add(to);
    }

    //R = READ (LEER)
    @Override
    public List<TresEnRayaTO> findAll() {
        return datos;
    }

    //R = READ (LEER)
    @Override
    public TresEnRayaTO findById(int index) {
        return datos.get(index);
    }

    //U = UPDATE (ACTUALIZAR)
    @Override
    public void update(TresEnRayaTO to, int index) {
        datos.set(index, to);
        //actualizar datos(0,1000)
        //array datos("el lugar que yo elija")("100") = datos.set(0,100)
        //datos(0,100)

    }

    //D = DELETE (ELIMINAR)
    @Override
    public void delete(TresEnRayaTO to) {
        datos.remove(to);
        //eliminar datos[juan,pedro,mateo,lucas]
        //datos.remove(juan)
        //datos[pedro,mateo,lucas]
    }

    //D = DELETE (ELIMINAR)
    @Override
    public void deleteById(int index) {
        datos.remove(index);
        //         datos[ 0     1      2      3]
        //eliminar datos[juan,pedro,mateo,lucas]
        //datos.remove(0)
        //datos[pedro,mateo,lucas]
    }
}
