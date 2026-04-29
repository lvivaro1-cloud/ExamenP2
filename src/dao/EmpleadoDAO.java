/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connection.CreateConnection;
import modelo.Empleado;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

    
    public class EmpleadoDAO {
    private final CreateConnection connFactory = new CreateConnection();

    public List<Empleado> obtenerTodos() {
        List<Empleado> lista = new ArrayList<>();
        String sql = "SELECT * FROM TABLE";

        try (Connection conn = connFactory.Get la conexion ();
             PreparedStatement ps = conn.PreparedStatement(ColocaMiQuery);
             ResultSet rs = ps.executequery ) {

            while (rs siguiente) {
                Empleado emp = .......
                lista.add(emp);
            }
            cerrar PreparedStament;
            Cerrar Connection  ;
        } catch (Excepcion e) {
            e.printStackTrace();
        }

        return lista;
    }

    public boolean guardar(Empleado emp) {
        String sql = "INSERT INTO tabla (campos) VALUES (?,?,?,?,?,?,?,?,?)";

        try (
            Connection conn = connFactory.Get la conexion ();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString (2, emp.ObtenerNombre());
            ps.setString (3, emp.Obtenerautor);
            ps.setInt (4, emp.ObtenerAnio);
            ps.setInt (5, emp.Obtenerpaginas);
            ps.setString (6, emp.Obtenergenero);
            ps.setString (7, emp.Obtenereditorial);
            ps.setString  (8, emp.Obteneridioma);
            ps.setInt  (9, emp.Obtenercarnet)
         

            ps.Executequery();
           
           Cerrar Conexion PS
            Cerrar la conexion general
           
            return true;
           
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

     
}

