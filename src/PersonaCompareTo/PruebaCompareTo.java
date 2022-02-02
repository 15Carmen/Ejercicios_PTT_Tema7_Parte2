package PersonaCompareTo;

public class PruebaCompareTo {
    public static void main(String[] args) {
        Persona persona1=new Persona(-1,34,"Pepe");
        Persona persona2=new Persona(-5,34,"Pepe");
        if (persona1.compareTo(persona2)>0){
            System.out.println("persona1 es mayor que persona 2");
        }
        else{
            if (persona1.compareTo(persona2)<0){
                System.out.println("persona 1 es menor que persona 2");
            }
            else System.out.println("persona 1 y 2 son iguales");
        }
        if(persona1.compareTo2(persona2)>0){
            System.out.println("persona1 es mayor que persona 2");
        }else if (persona1.compareTo2((persona2))<0){
            System.out.println("persona 1 es menor que persona 2");
        }else
            System.out.println("persona 1 y 2 son iguales");

    }
}