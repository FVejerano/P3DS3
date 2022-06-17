package medico;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;



public class CrearArchivo {
	private DecimalFormat format = new DecimalFormat("#,##0.00");
	private final String SEPARADOR =";";
	
	private final String DIR = "C:/Users/soporte/Documents/3 SEMESTRE/Desarrollo de Software III/Carpetas de Eclipse/Práctica/Parcial_3";
	private final File F= new File(DIR);
	
	public boolean existeCedula(String id) {
			try {
				BufferedReader archivo = new BufferedReader(new InputStreamReader(new FileInputStream(DIR), "UTF-8"));
				String line = archivo.readLine();
				while(line!=null) {
					String [] campos = line.split(SEPARADOR);
						if(campos[0].equals(id)) {
							archivo.close();
							return true;
						}else {
							line= archivo.readLine();
						}			
				}//while
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return false;
	}
	
	public Medico getInfoMedico(String id) {
		Medico m;
		try {
			BufferedReader archivo = new BufferedReader(new InputStreamReader(new FileInputStream(DIR), "UTF-8"));
			String line = archivo.readLine();
			while(line!=null) {
				String [] campos = line.split(SEPARADOR);
					if(campos[0].equals(id)) {	
						m = new Medico(campos[0], campos[1],campos[2],campos[3],campos[4],campos[5], Boolean.valueOf(campos[6]));
						archivo.close();
						return m;
					}else {
						line= archivo.readLine();
					}			
			}//while
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public boolean guardarMedico(Medico info) {
		try {
			BufferedReader archivo = new BufferedReader(new InputStreamReader(new FileInputStream(DIR), "UTF-8"));
		} catch (FileNotFoundException | UnsupportedEncodingException e) {
			try {
				PrintWriter archivo = new PrintWriter(DIR, "UTF-8");
			} catch (FileNotFoundException | UnsupportedEncodingException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		ArrayList<Medico> ListMedico = new ArrayList<Medico>();
		
		
		return true;
	}
	
	public Medico actualizarMedico(String id) {
		
		return null;
	}
	
	public Medico eliminarMedico(String id) {
		
		return null;
	}
	
}//class
