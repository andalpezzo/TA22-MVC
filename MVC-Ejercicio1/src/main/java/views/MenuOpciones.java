package views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controllers.ControladorMenu;
import models.Modelo;

import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;

public class MenuOpciones extends JFrame {

	private JPanel contentPane;
	public JButton btnAñadir;
	public JButton btnEditar;
	public JButton btnVer;
	public JButton btnBorrar;
	
	public MenuOpciones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 225, 147);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CLIENTES");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(67, 11, 89, 14);
		contentPane.add(lblNewLabel);
		
		btnAñadir = new JButton("Añadir");
		btnAñadir.setBounds(10, 36, 89, 23);
		contentPane.add(btnAñadir);
		
		btnEditar = new JButton("Editar");
		btnEditar.setBounds(109, 36, 89, 23);
		contentPane.add(btnEditar);
		
		btnVer = new JButton("Ver");
		btnVer.setBounds(10, 70, 89, 23);
		contentPane.add(btnVer);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(109, 70, 89, 23);
		contentPane.add(btnBorrar);
		
		setVisible(true);
	}
}
