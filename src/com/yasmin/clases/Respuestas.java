package com.yasmin.clases;
import java.util.StringTokenizer;
/**
 * Clase que contiene las respuestas correctas del test y 
 * las posibles opciones que tiene el usuario para responder
 * @author Yasmín
 */
public class Respuestas {
    String [] respuestas= {
      "Bender B. Rodriguez",
      "Mutantes",
      "Holófonor",
      "Richard Nixon",
      "Kiff",
      "Cubert",
      "Omicron persei 8",
      "Lucy Liu",
      "Ser humorista",
      "5. desde 1999 hasta 2003"
    };
    String [] opciones ={
      "Unidad de doblaje Bender,Bender a secas,Bender 722,Bender B. Rodriguez",
      "Extraterrestres venidos del espacio,Mutantes,Humanos normales,Están muertos", 
      "Triángulo,No toca ningún instrumento,Flauta del futuro,Holófonor",     
      "Richard Nixon,George W. Bush,Bill Clinton,Fishy Joes",
      "Fry,Kiff,Zapp Brunigan,Hermes",
      "Hubert,Wernstrum,Cubert,Scruffy",
      "Decapodian 7,Caca perro 6,Omicron persei 8,Tatooine",
      "Angelina Jolie,Pamela Anderson,Sofia Loren,Lucy Liu",
      "Ser el lider de la Tierra,Ser humorista,Ser un importante medico,Comer más de dos veces por semana",
      "5. desde 1999 hasta 2003,3. desde el 2000 hasta el 2002,Empezó en el 2001 y sigue emitiendose,6. desde el 2000 hasta el 2005",
    };
    
    /**
     * Método que devuelve las respuestas correctas del test
     * @param posicion Lugar dentro del Array de cada respuesta correcta
     * @return Retorna el Array de respuestas correctas
     */
    public String getRespuesta(int posicion){
        return respuestas[posicion];
    }
    
    /**
     * Separa las cadenas de String que contiene el Array
     * @param cadena Caracteres que queremos separar
     * @param separar Delimitador del String cadena
     * @return Retorna los valores de las posibles opciones
     */
    public String [] separarOpciones(String cadena, String separar){
        StringTokenizer sep = new StringTokenizer(cadena,separar);
        String [] aux = new String [4]; //Obtiene los valores de las posibles opciones
        int i = 0;
        while(sep.hasMoreTokens()){ //Obtiene los valores de StringTokenizer
            aux [i] = sep.nextToken();
            i++;
        }
        return aux;
    }
    /**
     * Asigna las opciones al JFrame
     * @param posicion Posicion del Array
     * @return Retorna las opciones ya separadas por el método separarOpciones
     */
    public String [] setOpciones(int posicion){
        String op = opciones[posicion]; 
        String [] op2 = separarOpciones(op,","); //Separa las opciones que están dentro del Array cuando haya una coma
        return op2;
    }
    
   
}