package listodoblementecircular;
//@ autor Kleyber Perez
class listodoblementecircular{
    int informacion;
    NodoDoble siguiente, anterior;
    NodoDoble previo;
        public static void main(String Valor[]) {
        //Autor: @Kleyber Perez
        System.out.println("Elemento aleatorio");
        listaDoble valor = new listaDoble();
          
          System.out.println("Elemento A: Kleyber");
     
          System.out.println("Elemento B: Pierina");
         
          System.out.println("Elemento C: Gabriela");
    
   
    }

    private static class listaDoble {

        public listaDoble() {
        }/*
        }*/
}

    private static class NodoDoble {

        private NodoDoble siguiente;
        private NodoDoble anterior;
        private String informacion;
        private NodoDoble previo;

        public NodoDoble() {
        }

        private NodoDoble(int dato) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

class ListaDoblementeEnlazadaCircular{
    NodoDoble inicio;
    
    public ListaDoblementeEnlazadaCircular(){
        inicio=null;
    }
    
    boolean estaVacia(){
        return inicio == null;
    }
    
    void insertarEnfrente(int dato){
        NodoDoble nodito=new NodoDoble(dato);
        if(estaVacia()==true){
            inicio=nodito;
            inicio.siguiente=inicio;
            inicio.anterior=inicio;
        }
        else{
            nodito.siguiente=inicio;
            inicio.anterior.siguiente=nodito;
            nodito.anterior=inicio.anterior;
            inicio.anterior=nodito;
        }
        inicio=nodito;
    }
    
    void insertarAtras(int dato){
        NodoDoble nodito=new NodoDoble(dato);
        if(estaVacia()==true){
            inicio=nodito;
            inicio.siguiente=inicio;
            inicio.anterior=inicio;
        }
        else{
            nodito.siguiente=inicio;
            inicio.anterior.siguiente=nodito;
            nodito.anterior=inicio.anterior;
            inicio.anterior=nodito;
        }
    }
    
    void eliminarEnfrente(){
        if(estaVacia()==true){
            System.out.println("Lista vacía, no se puede eliminar");
        }
        else if(inicio == inicio.siguiente){
            inicio=null;
        }
        else{
            NodoDoble auxiliar=inicio;
            System.out.println("El dato que fue eliminado es: "+inicio.informacion);
            inicio=inicio.siguiente;
            auxiliar.anterior.siguiente=inicio;
            inicio.anterior=auxiliar.anterior;
            auxiliar.anterior=null;
            auxiliar.siguiente=null;
        }
    }
    
    void eliminarAtras(){
        if(estaVacia() == true){
            System.out.println("Lista vacía, no se puede eliminar");
        }
        else if(inicio == inicio.siguiente){
            inicio=null;
        }
        else{
            NodoDoble auxiliar=inicio.anterior;
            System.out.println("El dato que fue eliminado es: ");
            auxiliar.anterior.siguiente=inicio;
            inicio.anterior=auxiliar.anterior;
            auxiliar.anterior=null;
            auxiliar.siguiente=null;
        }
    }
    
    void imprimirListaIzqDer(){//Impresion de inicio a fin
        if(estaVacia() == true){
            System.out.println("Lista vacía");
        }
        else if(inicio == inicio.siguiente){
           System.out.println(inicio.informacion);
        }
        else{
            NodoDoble auxiliar=inicio;
            do{
                System.out.println(auxiliar.informacion+" ");
                auxiliar=auxiliar.siguiente;
            }while(auxiliar != inicio);
        }
    }
    
    void imprimirListaDerIzq(){//Impresion de fin a inicio
        if(estaVacia() == true){
            System.out.println("Lista Vacia");
        }
        else if(inicio == inicio.siguiente){
           System.out.println(inicio.informacion);
        }
        else{
            NodoDoble auxiliar=inicio.previo;
            do{
                System.out.println(auxiliar.informacion+" ");
                auxiliar=auxiliar.previo;
            }while(auxiliar != inicio.previo);
        }
    }
   }
}