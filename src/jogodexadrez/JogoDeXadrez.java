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
public class JogoDeXadrez 
{
    public static void main(String[] args) 
    {
        PosicaoDoTabuleiro posicao = new PosicaoDoTabuleiro();
        MovimentoDaRainha veri = new MovimentoDaRainha(); 
        
        System.out.print("Entre com a posicão de x1: ");
        int x1 = posicao.Valores();
        
        System.out.print("Entre com a posicão de y1: ");
        int y1 = posicao.Valores();
        
        System.out.print("Entre com a posicão de x2: ");
        int x2 = posicao.Valores();
        
        System.out.print("Entre com a posicão de y2: ");
        int y2 = posicao.Valores();
        
        System.out.println("Quantidade de MOvimento: " + veri.VerificarMovimento(x1, y1, x2, y2));
    }    
}
