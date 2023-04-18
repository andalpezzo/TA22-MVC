package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import models.Modelo;
import views.Añadir;
import views.Borrar;
import views.Editar;
import views.MenuOpciones;
import views.Ver;

public class ControladorMenu implements ActionListener {
	public static Modelo modelo; 
	private MenuOpciones menu;
	private Añadir añadir;
	private Editar editar;
	private Ver ver;
	private Borrar borrar;
	
	public ControladorMenu(Modelo modelo, MenuOpciones menu) {
		this.modelo = modelo;
		this.menu = menu;
		this.menu.btnAñadir.addActionListener(this);
		this.menu.btnEditar.addActionListener(this);
		this.menu.btnVer.addActionListener(this);
		this.menu.btnBorrar.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//Eventos del os botones del menu
		if (e.getSource().equals(menu.btnAñadir)) {
			añadir = new Añadir();
			ControladorAñadir controladorAñadir = new ControladorAñadir(añadir, modelo);
			añadir.setVisible(true);
		} else if (e.getSource().equals(menu.btnEditar)) {
			editar = new Editar();
			ControladorEditar controladorEditar = new ControladorEditar(editar);
			editar.setVisible(true);
		} else if (e.getSource().equals(menu.btnVer)) {
			ver = new Ver(modelo.selectData());
			ver.setVisible(true);
		} else if (e.getSource().equals(menu.btnBorrar)) {
			borrar = new Borrar();
			ControladorBorrar controladorBorrar = new ControladorBorrar(borrar);
			borrar.setVisible(true);
		}
	}
}
