package edu.Carol.DIOJava;
public class MinhaClasse { //classe

    public static void main (String [] args) { //metodo da classe

        String primeiroNome = "Carol";
        String segundoNome = "Ramos";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);

        System.out.print(nomeCompleto);

        
    }
    
    public static String nomeCompleto (String primeiroNome, String segundoNome) { //outro método da classe
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
