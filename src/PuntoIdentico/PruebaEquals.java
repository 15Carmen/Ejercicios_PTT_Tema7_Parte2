package PuntoIdentico;

public class PruebaEquals {

        public static void main(String[] args) {
            PuntoId pto1=new PuntoId(1.5, 3.4);
            PuntoId pto2=new PuntoId(1.5, 1.4);
            PuntoId pto3=new PuntoId(1.5, 3.4);
            System.out.println("comparo los puntos 1 y 2");
            System.out.println("Código Hash pto1: " +pto1.hashCode());
            System.out.println("código Hash pto2: " +pto2.hashCode());
            System.out.println("toString de pto1: "+ pto1.toString());
            System.out.println("toString de pto2: "+ pto2.toString());
            System.out.println("¿Son iguales pto1 y pto2?" + pto1.equals(pto2));
            System.out.println("\n");
            System.out.println("comparo los puntos 1 y 3");
            System.out.println("Código Hash pto1: " +pto1.hashCode());
            System.out.println("código Hash pto3: " +pto3.hashCode());
            System.out.println("toString de pto1: "+ pto1.toString());
            System.out.println("toString de pto3: "+ pto3.toString());
            System.out.println("¿Son iguales pto1 y pto3?" + pto1.equals(pto3));

        }
    }
