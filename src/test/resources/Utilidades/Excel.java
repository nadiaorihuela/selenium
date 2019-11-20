package Utilidades;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class Excel {

public static String [][] levantarDatos(String hoja, String nombreArchivo) {

	String [][] matriz = new String[20][3];
	String rutaArchivo = "./src/test/resources/Recursos/" + nombreArchivo + ".xlsx";
	System.out.println("ruta: "+rutaArchivo);
	

	try (FileInputStream archivo = new FileInputStream(new File(rutaArchivo))) {
		XSSFWorkbook   workbook = new XSSFWorkbook  (archivo);
		XSSFSheet sheet=  workbook.getSheet(hoja);
		//XSSFRow fila;
		//XSSFCell cell;
		int filas = 20;
		int columnas = 3;  
		String cellValue;
		
		
		
		 for (int r = 0; r < filas; r++) {
            
	                 System.out.print("Row: " + r + " -> ");
	                 for (int c = 0; c < columnas; c++) {
	                	 cellValue =sheet.getRow(r).getCell(c).getStringCellValue();
	                	 
	                	 if (cellValue==null){
	                		 break;
	                	 }else{
	                	 
                  
		                    	// System.out.println("valor cellvalue:"+cellValue);
		                      //String valor = cellValue.getRawValue();
		                      matriz[r][c]=cellValue;
		                      //Systsem.out.println(cellValue);
		                     
		                      //array[r][c]= cellValue.getStringCellValue();
							//array[r][c]=valor;
		                     
	                 }
	                 }
	             }
		 }
	
	catch (Exception e) {
		System.out.println(e.getMessage());
	}
	
	
	
return matriz;	
}
}
/*
public class Excel {
	public static String [][] levantarDatos(String hoja, String nombreArchivo) {

		String [][]  array = null;

		String rutaArchivo = "./src/test/resources/Recursos/" + nombreArchivo + ".xlsx";
		System.out.println("ruta: "+rutaArchivo);
		try (FileInputStream archivo = new FileInputStream(new File(rutaArchivo))) {

			XSSFWorkbook   workbook = new XSSFWorkbook  (archivo);
		
			XSSFSheet sheet=  workbook.getSheetAt(0);
			XSSFRow fila;
			XSSFCell cell;
            //filas con valor
            int filas = sheet.getLastRowNum();
            int columnas = 0;   
            XSSFCell cellValue;
            int tipo;

            for (int r = 0; r < filas; r++) {
                fila = sheet.getRow(r);
                
                if (fila == null){
                    break;
                }else{
                    System.out.print("Row: " + r + " -> ");
                    for (int c = 0; c < (columnas = fila.getLastCellNum()); c++) {
                    	cellValue =fila.getCell(c);
                    	
                        if (cellValue==null){
                        	break;
                        }else{
                        	System.out.println(cellValue.getRichStringCellValue());
                        	System.out.println(cellValue);
                        	System.out.println("col"+c);
                        	System.out.println("row"+r);
                        	
                        	
                        	array[r][c] =     cellValue.getRichStringCellValue().toString();
                        	//array[r][c] =cellValue.getRichStringCellValue().toString();
                        	System.out.println(array);
                        	}
                        }
                   
                    }
            
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return array;
}
}/*
	/*
	public static ArrayList<String> levantarDatos(String hoja, String nombreArchivo) {

		ArrayList<String>  array = new ArrayList<String>();

		String rutaArchivo = "./src/test/resources/Recursos/" + nombreArchivo + ".xlsx";
		System.out.println(rutaArchivo);
		try (FileInputStream archivo = new FileInputStream(new File(rutaArchivo))) {

			XSSFWorkbook workbook = new XSSFWorkbook(archivo);
			
			Sheet sheet = workbook.getSheet(hoja);
		
			for (int i = 0; i < 200; i++) {
				System.out.println(sheet.getRow(i).getCell(0).getStringCellValue());
				sheet.getActiveCell();
				if (!(sheet.getRow(i) == null)) {
					
					array.add(sheet.getRow(i).getCell(0).getStringCellValue());
					array.add(sheet.getRow(i).getCell(1).getStringCellValue());
					array.add(sheet.getRow(i).getCell(3).getStringCellValue());
					
				}
			}

			workbook.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return array;
	}
	
	
	
	public static Map<String, String> levantarDataSource(String hoja, String NumeroCasuistica, String NumeroCaso) {

		Map<String, String> mapa = new HashMap<>();

		String rutaArchivo = "Excel\\DataSource\\Casuistica " + NumeroCasuistica + "\\TestCase-" + NumeroCaso + ".xlsx";
		//System.out.println(rutaArchivo);
		try (FileInputStream archivo = new FileInputStream(new File(rutaArchivo))) {

			XSSFWorkbook workbook = new XSSFWorkbook(archivo);

			Sheet sheet = workbook.getSheet(hoja);

			for (int i = 0; i < 50; i++) {
				if (!(sheet.getRow(i) == null)) {
					mapa.put(sheet.getRow(i).getCell(1).getStringCellValue(),
							sheet.getRow(i).getCell(2).getStringCellValue());
				}
			}

			workbook.close();

		} catch (Exception e) {
		}

		
		return mapa;
	}
	
*/

