package linked;

import java.util.Scanner;

import list.EstruturaElementar;

public class ListaLigada implements EstruturaElementar{

    private No cabeca;
    

    public ListaLigada() {
        cabeca = null; 
    }

    @Override
    public boolean buscaElemento(int valor) {
        No atual = cabeca;
    
        while (atual != null) {
            if(atual.getValor() == valor){
                return true;
            }
            atual = atual.getProximo();
        }
        return false;
    }
    
    @Override
    public int buscaIndice(int valor) {
        No atual = cabeca;
        int contador = 0;  
        while (atual != null) {
            if(contador == valor){
                return atual.getValor();
            }
            atual = atual.getProximo();
            contador ++; 
        }
        return -1;
    }
    

        
 

    

    @Override
    public int minimo() {
        No atual = cabeca;
        int minimo = cabeca.getValor();
        

         while (atual != null) {
            if(atual.getValor() < minimo){
                minimo = atual.getValor();
            }
            atual = atual.getProximo();
        }
        return minimo;

    }
        
    

    @Override
    public int maximo() {
           No atual = cabeca;
        int maximo = cabeca.getValor();
        

         while (atual != null) {
            if(atual.getValor() > maximo){
                maximo = atual.getValor();
            }
            atual = atual.getProximo();
        }
        return maximo;
    }

    @Override
    public int predecessor(int valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'predecessor'");
    }

    @Override
    public int sucessor(int valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sucessor'");
    }

    @Override
    public void insereElemento(int valor) {
        insereInicio(valor);

        
}

    @Override
    public void insereElementoPosicao(int valor, int buscaIndice) {
        insereElemento(valor);
        buscaIndice(0);

    }

    @Override
    public void insereInicio(int valor) {

        if (cabeca == null){
            cabeca = new No(valor); 
        }
        else{
            No n = new No(valor);
            n.setProximo(cabeca);
            cabeca = n; 
        }     

    }

    @Override
    public void insereFim(int valor) {
        No novo = new No(valor);
        if(cabeca == null){
            cabeca = novo;
            return;
        }
        No andandoNo = cabeca;
        while(andandoNo != null){
            if(andandoNo.getProximo() == null){
                andandoNo.setProximo(novo);
                return;
            }
            andandoNo = andandoNo.getProximo();
            
        }
    }

    @Override
    public void remove(int valor) {
          if(cabeca == null){
            return;
        }
           No atual = cabeca;
           if(cabeca.getValor() == valor ){
            removeInicio();
            return;
           }
          
        while (atual != null) {
            if(atual.getProximo() == null){
                break;
            }
            if(atual.getProximo().getValor() == valor){
                atual.setProximo(atual.getProximo().getProximo());
                return;
            }
            atual = atual.getProximo();
        
        }
  
    }
    

    @Override
    public void removeIndice(int indice) {
        No anterior = null;
         No atual = cabeca;
        int contador = 0;  
        while (atual != null) {
            if(contador == indice){
                cabeca = atual.getProximo();
            }
            else{
                anterior.setProximo(atual.getProximo());
            }

            anterior = atual;
            atual = atual.getProximo();
            contador ++; 
        }
        return;
    }
    
    
       
    

    @Override
    public void removeInicio() {
        if(cabeca != null ){
            cabeca = cabeca.getProximo();
        }
    }

    @Override
    public void removeFim()  {
        if(cabeca == null){
            return;
        }
           No atual = cabeca;
          
        while (atual != null) {
            if(atual.getProximo() == null){
                break;
            }
            if(atual.getProximo().getProximo() == null){
                atual.setProximo(null);
            }
            atual = atual.getProximo();
        
        }
  

    }
}