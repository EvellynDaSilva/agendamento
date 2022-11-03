
package arquivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Arquivo {

   
    public static void main(String[] args) {
        try {
            //gravar();
            ler();
        } catch (Exception e) {
            System.out.println();
        }
     
    }
    
    private  static void gravar () throws IOException{
        //Passo 01 - quem é o arquivo, onde ele está?
        String arquivo = "C:\\Users\\22282219\\Java-Buffer\\teste-ds1t.txt";
        
        //Passo 02 - Criar um objeto Patc
        Path path = Paths.get(arquivo);
        BufferedWriter bw = null;
        
        try {
            //Passo 03 - Criar um escritor
             bw = Files.newBufferedWriter(
                    path,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            //Passo 04 - Passar o conteúdo que será escrito no arquivo
            bw.write("100;Jandira;SP");
            bw.newLine();
            bw.write("200;Itapevi;SP");
            bw.newLine();
            bw.write("300;Proto Alegre;RS");
            bw.newLine();
            bw.write("400;Natal;RN");
            bw.newLine();
             
            
            
            
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                    "O arquivo não foi encontrado");
        }finally{
            //Passo 05 - Fechar o arquivo
            if (bw !=null){
            bw.close();
        }
        }
    }
    public static void ler (){
        //Passo 01 - quem é o arquivo, onde ele está?
        String arquivo = "C:\\Users\\22282219\\Java-Buffer\\teste-ds1t.txt";
        
        //Passo 02 - Criar um objeto Patc
        Path path = Paths.get(arquivo);
        
        //Criar um leitor 
        
        try{
            BufferedReader br = Files.newBufferedReader(path);
            
        String linha = br.readLine();
        
            
        
        while(linha != null){
            String[] linhaVetor = linha.split(";");
            System.out.println(linhaVetor[0]);
            System.out.println(linhaVetor[1]);
            System.out.println(linhaVetor[2]);
            linha = br.readLine();
        }
            } catch (Exception e) {
                e.printStackTrace();
        }
       }
    }

