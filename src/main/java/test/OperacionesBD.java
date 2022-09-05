package test;

import beans.Servicios;
import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;

public class OperacionesBD {
    
    public static void main(String[] args){
        //listarServicios();
        actualizarServicios(1, "Corte");
        
    }
    
    public static void actualizarServicios(int idServicio, String tipoServicio){
        DBConnection con = new DBConnection();
        String sql = "UPDATE servicios SET tipoServicio = '"+tipoServicio+"'WHERE idServicio ="+idServicio;
        
        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        finally{
            con.desconectar();
        }
    }
    
    public static void listarServicios(){
       DBConnection con = new DBConnection();
       String sql = "SELECT * FROM servicios"; 
       
       try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                int idServicio = rs.getInt("idServicio");
                String tipoServicio = rs.getString("tipoServicio");
                String nombreServicio = rs.getString("nombreServicio");
                                
                Servicios servicios = new Servicios(idServicio, tipoServicio, nombreServicio);
                System.out.println(servicios.toString());
            }
            st.executeQuery(sql);
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
         finally{
           con.desconectar();
         }
    }
}
