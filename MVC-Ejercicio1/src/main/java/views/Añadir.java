package views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controllers.ControladorAñadir;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Añadir extends JFrame {

	private JPanel contentPane;
	public JTextField tfNombre;
	public JTextField tfApellido;
	public JTextField tfDireccion;
	public JTextField tfDNI;
	public JTextField tfFecha;
	public JButton btnAñadir;

	public Añadir() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 240, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAñadir = new JLabel("───── AÑADIR ─────");
		lblAñadir.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAñadir.setBounds(19, 11, 190, 19);
		contentPane.add(lblAñadir);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNombre.setBounds(13, 48, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setHorizontalAlignment(SwingConstants.RIGHT);
		lblApellido.setBounds(13, 73, 46, 14);
		contentPane.add(lblApellido);
		
		JLabel lblDireccion = new JLabel("Dirección");
		lblDireccion.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDireccion.setBounds(0, 98, 59, 14);
		contentPane.add(lblDireccion);
		
		JLabel lblDNI = new JLabel("DNI");
		lblDNI.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDNI.setBounds(13, 123, 46, 14);
		contentPane.add(lblDNI);
		
		JLabel lblFecha = new JLabel("Fecha");
		lblFecha.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFecha.setBounds(13, 148, 46, 14);
		contentPane.add(lblFecha);
		
		tfNombre = new JTextField();
		tfNombre.setBounds(69, 45, 140, 20);
		contentPane.add(tfNombre);
		tfNombre.setColumns(10);
		
		tfApellido = new JTextField();
		tfApellido.setColumns(10);
		tfApellido.setBounds(69, 70, 140, 20);
		contentPane.add(tfApellido);
		
		tfDireccion = new JTextField();
		tfDireccion.setColumns(10);
		tfDireccion.setBounds(69, 95, 140, 20);
		contentPane.add(tfDireccion);
		
		tfDNI = new JTextField();
		tfDNI.setColumns(10);
		tfDNI.setBounds(69, 120, 140, 20);
		contentPane.add(tfDNI);
		
		tfFecha = new JTextField();
		tfFecha.setColumns(10);
		tfFecha.setBounds(69, 145, 140, 20);
		contentPane.add(tfFecha);
		
		btnAñadir = new JButton("Añadir cliente");
		btnAñadir.setBounds(13, 177, 196, 23);
		contentPane.add(btnAñadir);
	}
}
