package com.local.controller;

import java.sql.SQLException;

import com.local.model.dao.NinjaDao;
import com.local.view.NinjaView;


public class NinjaController {
    public static void mostarTodosLosNinjasHabilidad() throws SQLException{
        NinjaView.listarNinjasConHabilidad(NinjaDao.MostrarNinjasYHabilidades());
    }
}
