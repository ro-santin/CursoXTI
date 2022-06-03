package cursoxti;

import java.util.Random;

public class SorteadorCartas {
    public static void main (String[] args){
        
        String [] faces = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};
        String [] nipes = {"Ouro", "Espada", "Copas", "Paus"};
        
        Random r = new Random();
        
        int indiceFaces = r.nextInt(faces.length);
        String face = faces[indiceFaces];
        //Pode ser substituido pelo código abaixo:
        //String face = faces[r.nextInt(faces.length)];
        
        int indiceNipes = r.nextInt(nipes.length);
        String nipe = nipes[indiceNipes];
        //Pode ser substituido pelo código abaixo:
        //String nipe = nipes[r.nextInt(nipes.length)];
        
        String carta = face  + "  " + nipe ;
        System.out.println(carta);
        
    }
}
