package linked;

import list.EstruturaElementar;

public class ListaLigada implements EstruturaElementar{

    private No cabeca;
    private No proximNo;

    public ListaLigada() {
        cabeca = null; 
        proximNo = null; 
        

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

        

    return 0; 

    }

    @Override
    public int minimo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'minimo'");
    }

    @Override
    public int maximo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'maximo'");
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
        
   

    }

    @Override
    public void insereElementoPosicao(int valor, int buscaIndice) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void insereInicio(int valor) {

        if (cabeca == null){
            cabeca = new No(valor); 
        }
        else{
            No n = new No(valor);
            n.setProximo(cabeca);
        }     

    }

    @Override
    public void insereFim(int valor) {
        if(proximNo == null){
          proximNo = new No(valor); 

        }
        else{
            No n = proximNo;
            while(n.getProximo() != null){
                n = n.getProximo();
            }
            n.setProximo(new No(valor));
        }
    }

    @Override
    public void remove(int valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public void removeIndice(int indice) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeIndice'");
    }

    @Override
    public void removeInicio() {
        if(cabeca != null ){
            cabeca = cabeca.getProximo();
        }
    }

    @Override
    public void removeFim()  {
      if(proximNo == null){
        return;
      }
      if(proximNo.getProximo() == null){
        proximNo = null; 

      }
      else{
        proximNo.setProximo(proximNo);
      }
    
    }
}
