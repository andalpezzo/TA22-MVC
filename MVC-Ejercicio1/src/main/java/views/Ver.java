package views;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;

import controllers.ControladorMenu;
import models.Modelo;

public class Ver extends JFrame {

	public JPanel contentPane;
	private Object[] columnNames = {"Id", "Nombre", "Apellido", "Dirección", "DNI", "Fecha"}; //array de String's con los títulos de las columnas
	private JTable table;
	private JScrollPane jScrollPane;
	
	public Ver(Object[][] data) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setLocation(5, 50);
		table.setSize(424, 200);
		DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);

		System.out.println(Arrays.deepToString(data) + " VISTA");
		
		tableModel.setColumnIdentifiers(columnNames);
		table.setModel(new DefaultTableModel(data, columnNames));
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		table.setFillsViewportHeight(true);
		
		jScrollPane = new JScrollPane();
		jScrollPane.setLocation(0, 0);
		jScrollPane.setHorizontalScrollBarPolicy(
		            JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		jScrollPane.setVerticalScrollBarPolicy(
		            JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);            
		
		contentPane.add(jScrollPane);
		contentPane.setLayout(new BorderLayout());
		contentPane.add(table.getTableHeader(),  BorderLayout.PAGE_START);
		contentPane.add(table, BorderLayout.CENTER);
	}
}
