# generics-coringasDelimitados

## **Problema 1**

#### Vamos fazer um método para retornar a soma das áreas de uma lista de figuras.

Nota 1: soluções impróprias:<br/> 
```
      public double totalArea(List<Shape> list)
      public double totalArea(List<?> list) 
```
        
Nota 2: não conseguiremos adicionar elementos na lista do método

## **Problema 2**

#### Vamos fazer um método que copia os elementos de uma lista para uma outra lista que pode ser mais genérica que a primeira.

      ```
              List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
              List<Double> myDoubles = Arrays.asList(3.14, 6.28);
              List<Object> myObjs = new ArrayList<Object>();
             
             
             copy(myInts, myObjs);
             
             copy(myDoubles, myObjs);
              
    ```





