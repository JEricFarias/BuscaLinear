package buscalinear;

/**
 *
 * @author EricFarias
 * @since 07/03/20016
 */
public class BuscaLinear<T>{
    /**
     * Metodo estatico que retorna um indice de um vetor caso haja o valor especificado pelo usuário
     * caso o valor especificado não esteja contido dentro do vetor é retornado -1.
     * 
     * @param valor representa um valor inteiro que será buscado dento do vetor.
     * @param vetor vetor que sera vasculhado para saber se valor esta contido ou não nesse vetor
     * 
     * @return o indice de que possui o valor especificado, caso o valor não exista é retornado o valor -1
     */
    public int buscar(Object valor, Object []vetor){
        if(valor != null){
            for(int i = 0; i < vetor.length; i++){
                if(vetor[i].equals(valor)){
                    return i;
                }
            }
        }
        return -1;
    }
}
