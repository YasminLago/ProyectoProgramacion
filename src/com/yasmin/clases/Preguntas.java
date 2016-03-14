package com.yasmin.clases;

/**
 * Clase que contiene el array de preguntas 
 * @author Yasmín
 */
public class Preguntas {
    String [] preguntas={
        "¿Cuál es el nombre completo de Bender?",
        "¿Cómo son los padres de Leela?",
        "¿Qué instrumento le gusta tocar a Fry?",
        "¿Quién es el presidente de la Tierra?",
        "¿Quién es el novio de Amy en la mayor parte de la serie?",
        "¿Cómo se llama el clon del profesor Farnsworth?",
        "¿Cómo se llama el planeta en el que reina Lrr?",
        "¿De qué actriz crea un robot Fry?",
        "¿Cuál era el sueño del doctor Zhoidberg?",
        "¿Cuántos años se emitió Futurama?"
    };
    
    /**
     * Método que devuelve el Array preguntas
     * @param posicion Lugar dentro del Array de cada pregunta
     * @return Devuelve la posicion del array
     */
    public String getPregunta(int posicion){
        return preguntas[posicion];
    }
}

