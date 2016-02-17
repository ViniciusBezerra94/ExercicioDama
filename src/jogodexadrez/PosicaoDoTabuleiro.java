/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodexadrez;
import java.util.Scanner;

/**
 *
 * @author Bruno Bezerra Lima   RA: 248680
 */
public class PosicaoDoTabuleiro 
{
    public int Valores() //Método para inserir valores para posição inicial(X1,Y1), e para posição final(X2,Y2) da rainha no tabuleiro.
    {
        int aux = 0;
        Scanner entrada = new Scanner(System.in); // Classe Scanner para fazer entradas pelo usuario via teclado.
        
        try
        {
            while(aux!=1 && aux!=2 && aux!=3 && aux!=4 && aux!=5 && aux!=6 && aux!=7 && aux!=8 ) // Equanto o usuario nao entrar com a posição de 1 a 8, o laço continuara em execução.
            {
                aux = entrada.nextInt(); // Variavel "aux" vai receber o valor digitado pelo usuario.
                if(aux!=1 && aux!=2 && aux!=3 && aux!=4 && aux!=5 && aux!=6 && aux!=7 && aux!=8 ) // Se a entrada do usuario for diferente de 1 a 8 sera executado o "if".
                {
                    System.out.print("Digite uma posição de 1 a 8 por favor: "); // Será impresso uma mensagem.
                }                
            }
        }catch(java.util.InputMismatchException e) // Caso o usuario entre com caracteres, será ignorado o erro.
        {
            System.out.print("Digite uma posição de 1 a 8 por favor: "); // Será impresso uma mensagem.
            Valores(); // O método será chamado novamente caso o usuario tenha digitado algum caractere.
        }
        
        return aux;
    }
    
}
