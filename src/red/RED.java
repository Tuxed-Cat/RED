package red;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Stroody Walker
 */
public class RED {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        try 
        {
            ServerSocket ss = null;
            ss = new ServerSocket(1234);
            
            Socket S;
            System.out.println("Esperando");
            S = ss.accept();
            System.out.println("Conectado");
            
            int dato;
            dato = S.getInputStream().read();
            System.out.println(dato);
            //Socket.getOutputStream().write('A'); //el que envia
            //S.getInputStream().read(); //el que recibe
            
        } 
        catch (IOException ex) 
        {
            System.getLogger(RED.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
    
}
