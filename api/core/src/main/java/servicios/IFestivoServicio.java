package com.festivos.api.core.servicio;

import com.festivos.api.dominio.entidades.Festivo;
import java.util.List;
import java.util.Date;

public interface IFestivoServicio {
    List<Festivo> listar();
    Festivo obtener(int id);
    List<Festivo> buscar(String nombre);
    Festivo agregar(Festivo festivo);
    Festivo modificar(Festivo festivo);
    Festivo eliminar(int id);
}