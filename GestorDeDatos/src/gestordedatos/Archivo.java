package gestordedatos;
import java.io.*;
import javax.swing.JOptionPane;

public class Archivo {
    
    File archivo;
    public void crearArchivo(){
        try {
            archivo= new File("ListaContactos.txt");
            if (archivo.createNewFile()){
                JOptionPane.showMessageDialog(null,"Archivo Creado");   
            }
        }  catch (IOException e){
            System.out.println(e);
        }
    }
    public void escribirEnArchivo(Contacto contacto){
        try{
            FileWriter escritura = new FileWriter(archivo,true);
            escritura.write(contacto.getIdentificacion()+" - "+contacto.getNombre()+ " - "+contacto.getApellido()+"\r\n");
            escritura.close();
        }catch (IOException e){
            System.out.println(e);
        }    
    }
}
