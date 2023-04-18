package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import models.Modelo;
import views.Añadir;

public class ControladorAñadir implements ActionListener {
	private Modelo modelo; 
	private Añadir añadir;
	
	public ControladorAñadir(Añadir añadir, Modelo modelo) {
		this.añadir = añadir;
		this.añadir.btnAñadir.addActionListener(this);
		this.modelo = modelo;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//Eventos del os botones del menu
		if (e.getSource().equals(añadir.btnAñadir)) {
			System.out.println(añadir.tfNombre.getText());
			//Envento del botón de añadir
			if(!"" .equals(añadir.tfNombre.getText()) 
				&& !"" .equals(añadir.tfApellido.getText()) 
				&& !"" .equals(añadir.tfDireccion.getText())
				&& !"" .equals(añadir.tfDNI.getText())
				&& !"" .equals(añadir.tfFecha.getText())) {
					modelo.setNombre(añadir.tfNombre.getText());
					modelo.setApellido(añadir.tfApellido.getText());
					modelo.setDireccion(añadir.tfDireccion.getText());
					modelo.setDni(añadir.tfDNI.getText());
					modelo.setFecha(añadir.tfFecha.getText());
					modelo.insertData();
			}
			System.out.println("CLIENTE AÑADIDO CON EXITO");
			añadir.setVisible(false);
		}
	}
}
