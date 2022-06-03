package cursoxti;
/**
 * Write once Rum AnyWhere --> Escreva uma vez, rode em qualquer lugar
 * @author Administrator
 */
public class Aula1 {

    public static void main(String[] args) {
        
//        String nome = "nome de alguém";
//        double idade = 35.55;
//        boolean casado = true;
//        System.out.println(nome +"\n"+ idade +"\n"+ casado);
        
        Double preco = new Double("12.45");
        double d = preco.doubleValue();
        int i = (int) preco.doubleValue();
        byte b = preco.byteValue();
        int i2 = Integer.valueOf("1001101", 2);
        
        System.out.println(i2);
        
        
    }
    
}
