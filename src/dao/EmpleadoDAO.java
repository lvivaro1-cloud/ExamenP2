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
        String sql = "SELECT ......";

        try (Connection conn = connFactory.Get la conexion ();
             PreparedStatement ps = conn.PreparedStatement(ColocaMiQuery);
             ResultSet rs = ps.ejecutaConsulta ) {

            while (rs siguiente) {
                Empleado emp = .......
                lista.add(emp);
            }
            cerrar Prepared;
            Cerrar Conexion  ;
        } captura (Excepcion e) {
            e.printStackTrace();
        }

        return lista;
    }

    public boolean guardar(Empleado emp) {
        String sql = "INSERT INTO tabla (campos) VALUES (? ....)";

        try (
            Connection conn = connFactory.Get la conexion ();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, emp.ObtenerNombre());
         

            ps.ExecutaQueryPorFavor();
           
           Cerrar Conexion PS
            Cerrar la conexion general
           
            return true;
           
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

     
}

