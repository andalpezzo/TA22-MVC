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

public class Borrar extends JFrame {

	private JPanel contentPane;
	private JComboBox<String> comboBox;
	private JTextField tfNombre;
	private JTextField tfApellido;
	private JTextField tfDireccion;
	private JTextField tfDNI;
	private JTextField tfFecha;
	public JButton btnBorrar;

	public Borrar() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 240, 150);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAñadir = new JLabel("───── BORRAR ─────");
		lblAñadir.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAñadir.setBounds(24, 11, 190, 19);
		contentPane.add(lblAñadir);
		
		comboBox = new JComboBox<String>();
		comboBox.setMaximumRowCount(50);
		comboBox.setBounds(13, 42, 199, 22);
		comboBox.addItem("ID Cliente");
		contentPane.add(comboBox);
		
		btnBorrar = new JButton("Borrar cliente");
		btnBorrar.setBounds(13, 75, 199, 23);
		contentPane.add(btnBorrar);
	}
}
