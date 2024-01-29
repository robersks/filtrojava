package com.local.controller;

import java.sql.SQLException;

import com.local.model.dao.MisionDao;
import com.local.view.MisionView;

public class MisionController {
    public static void MostrarMisionesDisponiblesNinjaEspecifico(String id_ninja) throws SQLException{
        MisionView.listarMisionesDisponiblesPorId(MisionDao.MostrarMisionesDisponiblesNinjaEspecifico(id_ninja)); 
    }

    public static void MostarMisionesCompletadasNinjaEspecifico(String id_ninja) throws SQLException{
        MisionView.listarMisionesDisponiblesPorId(MisionDao.MostrarMisionesCompletadasNinjaEspecifico(id_ninja));
    }

    public static void asignarMisionANinnjaEspecifico(int id_mision,String id_ninja) throws SQLException{
       boolean status = MisionDao.asignarMision(id_mision, id_ninja);
       MisionView.asignarMision(status);
    }

    public static void marcarMisionComoCompletada(int id_mision,String id_ninja) throws SQLException{
        boolean status = MisionDao.marcarMisionComoCompletada(id_mision, id_ninja);
        MisionView.marcarMisionComoCompletada(status);
    }
}
