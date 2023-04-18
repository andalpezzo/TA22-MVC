package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import models.Modelo;
import views.Añadir;
import views.Borrar;
import views.Editar;
import views.MenuOpciones;
import views.Ver;

public class ControladorEditar implements ActionListener {
	private Editar editar;
	
	public ControladorEditar(Editar editar) {
		this.editar = editar;
		this.editar.btnEditar.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//Eventos del os botones del menu
		if (e.getSource().equals(this.editar.btnEditar)) {
			editar.setVisible(true);
		}
	}
}
