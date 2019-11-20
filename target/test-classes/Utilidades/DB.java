package Utilidades;

import java.sql.*;

public class DB {

		
		static String OPERACION_FAIL;
		static String OPERACION_SUCCESS;
		//
		public static ResultSet gestionesCleaner(String ID_CASUISTICA, String NUM_NUP) throws Exception {

			try {
				    Class.forName("oracle.jdbc.driver.OracleDriver");
		            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@LXHOMOORA7:6482/RIO187H", "CSM", "Portland_9032");
		            Statement stmt = con.createStatement();
		            ResultSet rs = stmt.executeQuery("select count(*) ID_GESTION from CSM.GESTIONES WHERE ID_CASUISTICA = " + ID_CASUISTICA + " AND ID_CLIENTE = "+ NUM_NUP +"");
		            String Value_count = null;
		            
		            while (rs.next()) {
		            Value_count = rs.getString(1);
		            	
		      		if (Value_count == null || Value_count.equals("0")) 
		            	{
		            		System.out.println("==== EL NUM: "+ NUM_NUP +" NO POSEE ACTUALMENTE GESTIONES EN SU CASUISTICA ====");
		            	}
		            	else 
		            	{
		            		System.out.println("==== EL NUM: "+ NUM_NUP +" POSEE GESTIONES EN LA BD DE COSMOS ====");
		            		DB.gestionesCleaner(ID_CASUISTICA, NUM_NUP);
		            	}
	                }
		            
		            con.close();
		            
		            return rs;
		        } catch (Exception e) {
		            System.out.println(e);
		            return null;
		        }

		}

}
