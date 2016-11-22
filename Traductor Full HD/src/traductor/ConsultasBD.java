package traductor;

import java.sql.ResultSet;
import java.util.ArrayList;

public class ConsultasBD {

    MySQLBD baseDatos = new MySQLBD().conectar("localhost", "traductor", "root", "");

    public ArrayList<Palabras> traer_Palabra() {
        ArrayList<Palabras> result = new ArrayList();
        ResultSet rs = baseDatos.consultar("SELECT * FROM palabras");
        if (rs != null) {
            try {
                while (rs.next()) {
                    result.add(new Palabras(rs.getInt("nivel"),
                            rs.getString("tipo"),
                            rs.getString("spanish"),
                            rs.getString("english"),
                            rs.getString("imagen"),
                            rs.getString("audio")));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    public ArrayList<IPersona> consultarUsuario() {
        ArrayList<IPersona> result = new ArrayList();
        ResultSet rs = baseDatos.consultar("SELECT * FROM usuarios");
        if (rs != null) {
            try {
                while (rs.next()) {
                    result.add(new Usuario(rs.getString("nombre"),
                            rs.getString("apellido"),
                            rs.getInt("edad"),
                            rs.getString("nomUsuario"),
                            rs.getString("password"),
                            rs.getString("correo"),
                            rs.getInt("nivel"),
                            rs.getString("foto")));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    public IPersona buscarUser(String bus) {
        IPersona us = null;
        ResultSet rs = baseDatos.consultar("SELECT * FROM usuarios "
                + "where nomUsuario='" + bus + "'");
        if (rs != null) {
            try {
                while (rs.next()) {
                    us = new Usuario(rs.getString("nombre"),
                            rs.getString("apellido"),
                            rs.getInt("edad"),
                            rs.getString("nomUsuario"),
                            rs.getString("password"),
                            rs.getString("correo"),
                            rs.getInt("nivel"),
                            rs.getString("foto"));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return us;
    }

    public void insertarUsuario(String n, String a, int e, String u,
            String p, String c, int ni, String im) {
        if (baseDatos.ejecutar("INSERT INTO usuarios VALUES ('" + n + "','"
                + a + "', " + e + ", '" + u + "', '" + p + "', '" + c + "', " + ni + ", '" + im + "')")) {
            System.out.println("Ejecucion Correcta");
        } else {
            System.out.println("Ocurrio un problema al insertar");
        }
    }

    public void modificarUsuario(String va, String n, String a, int e, String u,
            String p, String c, int ni, String ima) {
        String sql = "UPDATE usuarios SET nombre= '" + n + "', apellido= '" + a
                + "', edad= " + e + ", nomUsuario='" + u + "', password='" + p
                + "', correo='" + c + "', nivel=" + ni + "foto='" + ima + "'"
                + " where nomUsuario='" + va + "'";
        if (baseDatos.ejecutar(sql)) {
            System.out.println("Ejecucion Correcta");
        } else {
            System.out.println("Ocurrio un problema al modificar");
        }
    }
    
    public void modificarNivel(String va, int e) {
        String sql = "UPDATE usuarios SET nivel= " + e
                + " where nomUsuario='" + va + "'";
        if (baseDatos.ejecutar(sql)) {
            System.out.println("Ejecucion Correcta");
        } else {
            System.out.println("Ocurrio un problema al modificar");
        }
    }
    

    public void borrarUsuario(String us) {
        if (baseDatos.ejecutar("DELETE FROM usuarios WHERE "
                + "nomUsuario= '" + us + "'")) {
            System.out.println("Ejecucion correcta");
        } else {
            System.out.println("Ocurrio un problema al borrar");
        }
    }
}
