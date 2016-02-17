/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodexadrez;

/**
 *
 * @author Bruno Bezerra Lima   RA: 248680
 */
public class MovimentoDaRainha 
{
    int VerificarMovimento(int x1,int y1,int x2,int y2) // Método para contar quantos movimentos a rainha faz para fazer a jogada dada pelo usuario.
    {
        int movimento = 2; // Máximo de movimentos que a rainha pode dar para chegar em qualquer lugar do tabuleiro.
        
        boolean horizontal = (x1 == x2 && y1 != y2); // Se X1 igual a X2 e Y1 diferente de Y2 contara como verdadeiro(true) o movimento horizontal.
        boolean vertical = (x1 != x2 && y1 == y2); // Se X1 diferente a X2 e Y1 igual de Y2 contara como verdadeiro(true) o movimento vertical.
        boolean diagonal = (Math.abs(x1-x2) == Math.abs(y1-y2)); // Se o módulo da diferença de X e Y forem iguais contará como verdadeiro(true) o movimento diagonal.
        
        if(x1==x2 && y1==y2) // Se a posição de (X1,Y1) igual a de (X2,Y2) então a rainha não saiu do lugar.
        {
            return movimento = 0; // Retornará que a rainha não deu nenhum movimento.
        }
        if(diagonal == true || horizontal == true || vertical == true) // Entrará na condição se um dos movimentos : horizontal, ou vertical ou diagonal for verdadeiro(true).
        {
            movimento = 1; // Retornará que a rainha fez 1 movimento.
        }
        
        return movimento; // Se nenhum dos "if"s anteriores for verdadeiro, retornará que a rainha fez 2 movimentos.
    }
}
