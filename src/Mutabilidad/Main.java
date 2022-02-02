package Mutabilidad;

import java.time.LocalDate;

public class Main {

        //el tipo int es mutable
        //el tiempo Integer es Inmutable

    public static void main(String[] args) {
        LocalDate fecha3;
        fecha3=LocalDate.now();
        System.out.println("hash de fecha 3: " +fecha3.hashCode());
        LocalDate fecha4 = fecha3.plusDays(10);
        System.out.println("hash de fecha 3: " +fecha3.hashCode());
        System.out.println("el hasH antes y despues de la operacion es el mismo porque usamos otro LocalDate");
        fecha3=fecha3.plusDays(5);
        System.out.println("el hasH ha cambiado porque hemos usado el mismo LocalDate");
        System.out.println("hash de fecha 3: " +fecha3.hashCode());


        Integer a = 3235;
        Integer b = a;
        //a++; con esto da falso ambos
        Boolean e = (a==b);
        System.out.println(e);
        Boolean f = a.equals(b);
        System.out.println(f);



    }

}