package Punto.Clonable;

public class PruebaPunto {

    //Clonacion del punto
    public static void main(String args[]){
        PuntoClo miPunto = new PuntoClo(4,5);
        System.out.print("Punto recién creado:");
        System.out.println(miPunto.toString());

    //Voy a clonar mi punto
        PuntoClo miPunto2 = (PuntoClo) miPunto.clone();
        System.out.print("Punto clonado:");
        System.out.println(miPunto2.toString());

    //Creación del rectángulo
        Rectangulo miRectángulo = new Rectangulo(new PuntoClo(4,5),7,8);

    //clonación del rectángulo
        Rectangulo miRectángulo2= (Rectangulo) miRectángulo.clone();
        Rectangulo miRectángulo3= (Rectangulo) miRectángulo.cloneSuperficial();
        System.out.println("rectángulo original: "+ miRectángulo.toString());
        System.out.println("rectángulo clonado superfifial: "+ miRectángulo3.toString());
        System.out.println("rectángulo clonado en profundidad: "+ miRectángulo2.toString());





    }
}

