package TA22.MVC_Ejercicio1;

import controllers.ControladorMenu;
import models.Modelo;
import views.Añadir;
import views.Borrar;
import views.Editar;
import views.MenuOpciones;
import views.Ver;

public class App {
    public static void main(String[] args) {
    	
    	Modelo modelo = new Modelo();
    	//Conectamos nada mas iniciar el programa
    	modelo.connect();
    	
        MenuOpciones menu = new MenuOpciones();
        ControladorMenu controlador = new ControladorMenu(modelo, menu);
    }
}
	