public class PilhaArray<E> implements Pilha {
    protected E[] S;
    protected int top = -1;
    protected int capacity;

    public PilhaArray(int cap){
        capacity = cap;
        S = (E[]) new Object[capacity];
    }
    
    public int size() {
        return top +1;
    }

    
    public boolean isEmpty() {
        return top < 0; 
    }

    
    public Object top() throws PilhaVaziaExcecao {
        if(isEmpty()){
            throw new PilhaVaziaExcecao("Pilha vazia");
        }
        return S[top];
        
       
    }

    
    public void push(Object o){
        {
            E elem = (E) o;
            top++;
            S[top] = elem;
        }
    }

    
    public Object pop() throws PilhaVaziaExcecao {
        if (isEmpty()){
            throw new PilhaVaziaExcecao("Pilha vazia");

        }
        E elem = S[top];
        S[top] = null;
        top--;
        return elem;
       
    }
    
}
