package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import models.Modelo;
import views.Añadir;
import views.Borrar;
import views.Editar;
import views.MenuOpciones;
import views.Ver;

public class ControladorBorrar implements ActionListener {
	private Borrar borrar;
	
	public ControladorBorrar(Borrar borrar) {
		this.borrar = borrar;
		this.borrar.btnBorrar.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(this.borrar.btnBorrar)) {
			
		}
	}
}
