package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;

public class Modelo {
	private int id;
	private String nombre;
	private String apellido;
	private String direccion;
	private String dni;
	private String fecha;
	Connection connection;
	private Statement stdb;
	private ResultSet result;
	private ResultSet resultCount;
	private int numRows = 0;
	private int i;
	private Object[][] data;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Connection getConnection() {
		return connection;
	}

	public Object[][] getData() {
		return data;
	}

	public void setData(Object[][] data) {
		this.data = data;
	}

	public int getNumRows() {
		return numRows;
	}

	//METODO PARA CONECTARSE A LA BASE DE DATOS
	public void connect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://192.168.1.140?useTimezone=true&server=UTC", "root",
					"Anyo.1997");
			System.out.println("Connected!");
		} catch (SQLException | ClassNotFoundException ex) {
			System.out.println("Cannot connect to DB");
			System.out.println(ex);
		}
	}
	
	// METODO QUE INSERTA DATOS EN TABLAS MYSQL
	public void insertData() {
		try {
			stdb = getConnection().createStatement();
			stdb.executeUpdate("USE clientes;");
			stdb.executeUpdate("INSERT INTO cliente (nombre, apellido, direccion, DNI, fecha) VALUES "
					+ "('"+ this.nombre +"', '"+ this.apellido +"', '"+ this.direccion +"', '"+ this.dni +"', '"+ this.fecha +"');");
			System.out.println("Datos almacenados correctamente");
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			JOptionPane.showMessageDialog(null, "Error en el aleacenamiento");
		}
	}
	
	// METODO QUE CUENTA LAS FILAS
	public void countRows() {
		try {
			stdb = getConnection().createStatement();
			stdb.executeUpdate("USE clientes;");
			resultCount = stdb.executeQuery("SELECT COUNT(*) FROM cliente");
			
			while(resultCount.next()){
				numRows = resultCount.getInt(1);
			}
		    
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			JOptionPane.showMessageDialog(null, "No se pudo contar correctamente");
		}
	}
	
	// METODO QUE MUESTRA DATOS EN TABLAS MYSQL
	public Object[][] selectData() {
		try {
			stdb = getConnection().createStatement();
			stdb.executeUpdate("USE clientes;");
			result = stdb.executeQuery("SELECT id, nombre, apellido, direccion, DNI, fecha FROM cliente");
			
			countRows();
			data = new Object[numRows][6];
			
			i = 0;
			while(result.next()){
				data[i][0] = result.getInt("id");
				data[i][1] = result.getString("nombre");
				data[i][2] = result.getString("apellido");
				data[i][3] = result.getString("direccion");
				data[i][4] = result.getString("DNI");
				data[i][5] = result.getString("fecha");
		    	i++;
			}
			
			System.out.println(Arrays.deepToString(data) + " MODELO");
		    
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			JOptionPane.showMessageDialog(null, "No se pudo mostrar correctamente");
		}
		return data;
	}
	
	// METODO QUE ELIMINA DATOS EN TABLAS MYSQL
	public void deleteData() {
		try {
			stdb = getConnection().createStatement();
			stdb.executeUpdate("USE clientes;");
			stdb.executeUpdate("DELETE FROM cliente WHERE id='"+ this.id +"'");
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			JOptionPane.showMessageDialog(null, "No se pudo borrar correctamente");
		}
	}
}
