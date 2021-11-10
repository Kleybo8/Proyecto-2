public class MyClass {

    /**
     *
     * @param Valor
     */
    public static void main(String Valor[]) {
        //Autor: @Kleyber Perez
        System.out.println("Valor");
        listaDoble valor = new listaDoble();
          
          System.out.println("Valor mas alto 100");
     
          System.out.println("valor mas bajo 1");
         
          System.out.println("valor medio 50");
     
    }
}
class Nodo{
    private int elemento1;
    private int elemento2;
    private Nodo siguiente;
    private Nodo anterior;

public Nodo (int elem1,int elem2, Nodo sig, Nodo ant){
    elemento1 = elem1;
    elemento2 = elem2;
    siguiente = sig;
    anterior=ant;
}
public int getElemento1(){
    return elemento1;
}
public int getElemento2(){
    return elemento2;
}
public Nodo getSig(){
    return siguiente;
}
public Nodo getAnt(){
    return anterior;
}
public void setElemento1(int elem1){
    elemento1 = elem1;
}
public void setElemento2(int elem2){
    elemento2 = elem2;
}
public void setSig(Nodo sig){
    siguiente = sig;
}
public void setAnt(Nodo ant){
    anterior= ant;
}   
}

class listaDoble{
    private Nodo primero;
    private Nodo ultimo;
    private final int numElem; 
public listaDoble(){ 
    ultimo=null;
    primero = null;
    numElem = 0;
}

public void insertar(int elem1,int elem2){
     Nodo nuevo = new Nodo(elem1,elem2, null,null);
   //Insertar primer elemento de la lista
   
    if (primero == null){
        primero=nuevo;
        ultimo=nuevo;
    
        
    }
    //Insertar Segundo Elemento
    else if (primero.getSig()==null){
         //orden ascendente puntero primero
        if (primero.getElemento1()<elem1){
            primero.setSig(nuevo);
        }else{
            nuevo.setSig(primero);
            primero=nuevo;
        }
        //orden descendente puntero último
        if ( ultimo.getElemento2()>elem2){
            ultimo.setAnt(nuevo);
            
        }else{
            nuevo.setAnt(ultimo);
            ultimo=nuevo;
        }
    }
    //insertar elementos sucesivos
    else{
         
             Nodo actual = primero;
             //como primer elemento ascendente
            if (primero.getElemento1()>elem1){
            nuevo.setSig(primero);
            primero=nuevo;
            }
            else{
                while (actual.getSig()!=null ){

                if(actual.getSig().getElemento1() > elem1)
                {
                    nuevo.setSig(actual.getSig());
                   
                    actual.setSig(nuevo);
                   
                    actual=nuevo.getSig();
                    
                }else{
                actual = actual.getSig();
            }
                }
                //como ultimo elemento Ascendente
            if (actual.getSig()==null && actual.getElemento1()<elem1){
            actual.setSig(nuevo);
            }
            }
            actual=ultimo;
            // Como primer elemento Descendente
            if (ultimo.getElemento2()<elem2){
                nuevo.setAnt(ultimo);
                ultimo=nuevo;
            }else{
                while (actual.getAnt()!=null ){
                
                
                if(actual.getAnt().getElemento2() < elem2)
                {
                    nuevo.setAnt(actual.getAnt());
                    actual.setAnt(nuevo);
                    actual=nuevo.getAnt();
                               
                }else{
                actual = actual.getAnt();
                }
                }
                //como ultimo elementoDescendente
            if (actual.getAnt()==null && actual.getElemento2()>elem2){
                actual.setAnt(nuevo);
            
            }
        }
        }
    }


public void listar(){
     Nodo actual = primero;
   
    System.out.println("Listar desde primero");
     while (actual.getSig()!= null){
        System.out.println(actual.getElemento1()+"--"+actual.getElemento2());
        actual = actual.getSig();
    
    }
    System.out.println(actual.getElemento1()+"--"+actual.getElemento2());
    
    actual = ultimo;
   System.out.println("Lista que permite determinar valor alto, bajo y medio");
    
     while (actual.getAnt()!= null){
        System.out.println(actual.getElemento1()+"--"+actual.getElemento2());
        actual = actual.getAnt();
    
    }
    System.out.println(actual.getElemento1()+"--"+actual.getElemento2());
    
   
}

    void insertar(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
