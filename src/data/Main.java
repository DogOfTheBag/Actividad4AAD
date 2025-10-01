package data;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

// Realiza un programa que añada 10 caracteres a un fichero de texto.
//Y a continuación salta una linea con el método newLine().
public class Main {
    public static void main(String[] args) {
        //para darle mas chicha he decidido hacerlo con un for para que saque un fori de c y luego un array de chars
        String ruta = "C:\\Users\\alber\\Documents\\IntelIJ Projects\\Actividad4AAD\\res\\ejemplo.txt";
        char chars[] = {'A','L','B','E','R','T','O','W','A','Y'};
        //estaba intentando hacer esto con printWriter, que tambien se puede, pero el metodo newLine es privado ahi, por lo que se usa el bufferedWriter
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(ruta))){
            for (int i = 0; i < 10; i++) {
                writer.write('C');
            }
            writer.newLine();
            writer.write(chars);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}