package Datos;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

	public class cargaDatos {
		private static Properties prop;
		private static String url;
		private static String pathDriver;
		private static String pathReportes;
		private static String pathScreenshot;
		private static String pathDatos;
		private static String userLogin;
		private static String passLogin;
		/*url=http://localhost/testlink/testlink-1.9.19/index.php
	pathDriver=..//testLink//src//com//indra//testlink//recursos
	pathReportes=..//testLink//src//com//indra//testlink//reportes
	pathScreenshot=..//testLink//src//com//indra//testlink//datos
	pathDatos=..//testLink//src//com//indra//testlink//datos
	userLogin=admin
	passLogin=admin*/
		
		public static void CargarParametrosDeEjecucion() {
			prop = new Properties();
			InputStream inputStream=null;
			
			try {

				
				String propFileName = "EjecucionPruebas.properties";
				//inputStream = new FileInputStream("C://Users///norihuela.INDRA///Documents//Proyectos//testLink//src//com//indra//testlink//recursos//"+propFileName);
				//inputStream = cargaDatos.class.getClassLoader().getResourceAsStream(propFileName);
				inputStream = new FileInputStream("./src/test/resources/Recursos/"+propFileName);
				if (inputStream != null) {
					prop.load(inputStream);
					url = prop.getProperty("url");
					pathDriver = prop.getProperty("pathDriver");
					pathReportes = prop.getProperty("pathReportes");
					pathScreenshot= prop.getProperty("pathScreenshot");
					pathDatos = prop.getProperty("pathDatos");
					userLogin = prop.getProperty("userLogin");
					passLogin = prop.getProperty("passLogin");
					
					inputStream.close();
					
				}}
				catch (Exception e) {
					System.out.println("Exception: " + e);
				} 
		}

		public static Properties getProp() {
			return prop;
		}

		public static void setProp(Properties prop) {
			cargaDatos.prop = prop;
		}

		public static String getUrl() {
			return url;
		}

		public static void setUrl(String url) {
			cargaDatos.url = url;
		}

		public static String getPathDriver() {
			return pathDriver;
		}

		public static void setPathDriver(String pathDriver) {
			cargaDatos.pathDriver = pathDriver;
		}

		public static String getPathReportes() {
			return pathReportes;
		}

		public static void setPathReportes(String pathReportes) {
			cargaDatos.pathReportes = pathReportes;
		}

		public static String getPathScreenshot() {
			return pathScreenshot;
		}

		public static void setPathScreenshot(String pathScreenshot) {
			cargaDatos.pathScreenshot = pathScreenshot;
		}

		public static String getPathDatos() {
			return pathDatos;
		}

		public static void setPathDatos(String pathDatos) {
			cargaDatos.pathDatos = pathDatos;
		}

		public static String getUserLogin() {
			return userLogin;
		}

		public static void setUserLogin(String userLogin) {
			cargaDatos.userLogin = userLogin;
		}

		public static String getPassLogin() {
			return passLogin;
		}

		public static void setPassLogin(String passLogin) {
			cargaDatos.passLogin = passLogin;
		}
		
	}
