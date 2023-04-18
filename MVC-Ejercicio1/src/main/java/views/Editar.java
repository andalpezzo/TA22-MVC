package views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class Editar extends JFrame {

	private JPanel contentPane;
	private JComboBox<String> comboBox;
	private JTextField tfNombre;
	private JTextField tfApellido;
	private JTextField tfDireccion;
	private JTextField tfDNI;
	private JTextField tfFecha;
	public JButton btnEditar;

	public Editar() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 240, 289);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAñadir = new JLabel("───── EDITAR ─────");
		lblAñadir.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAñadir.setBounds(24, 11, 190, 19);
		contentPane.add(lblAñadir);
		
		comboBox = new JComboBox<String>();
		comboBox.setMaximumRowCount(50);
		comboBox.setBounds(13, 42, 196, 22);
		comboBox.addItem("ID Cliente");
		contentPane.add(comboBox);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNombre.setBounds(13, 84, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setHorizontalAlignment(SwingConstants.RIGHT);
		lblApellido.setBounds(13, 109, 46, 14);
		contentPane.add(lblApellido);
		
		JLabel lblDireccion = new JLabel("Dirección");
		lblDireccion.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDireccion.setBounds(0, 141, 59, 14);
		contentPane.add(lblDireccion);
		
		JLabel lblDNI = new JLabel("DNI");
		lblDNI.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDNI.setBounds(13, 166, 46, 14);
		contentPane.add(lblDNI);
		
		JLabel lblFecha = new JLabel("Fecha");
		lblFecha.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFecha.setBounds(13, 191, 46, 14);
		contentPane.add(lblFecha);
		
		tfNombre = new JTextField();
		tfNombre.setBounds(69, 75, 140, 20);
		contentPane.add(tfNombre);
		tfNombre.setColumns(10);
		
		tfApellido = new JTextField();
		tfApellido.setColumns(10);
		tfApellido.setBounds(69, 103, 140, 20);
		contentPane.add(tfApellido);
		
		tfDireccion = new JTextField();
		tfDireccion.setColumns(10);
		tfDireccion.setBounds(69, 130, 140, 20);
		contentPane.add(tfDireccion);
		
		tfDNI = new JTextField();
		tfDNI.setColumns(10);
		tfDNI.setBounds(69, 157, 140, 20);
		contentPane.add(tfDNI);
		
		tfFecha = new JTextField();
		tfFecha.setColumns(10);
		tfFecha.setBounds(69, 185, 140, 20);
		contentPane.add(tfFecha);
		
		btnEditar = new JButton("Editar cliente");
		btnEditar.setBounds(13, 216, 196, 23);
		contentPane.add(btnEditar);
	}
}
