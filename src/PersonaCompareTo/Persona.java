package PersonaCompareTo;

public class Persona implements Comparable<Persona>{
    private int id, edad;
    private String nombre;


    public Persona(int id, int edad, String nombre) {
        this.id = id;
        this.edad = edad;
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public int getId() {
        return this.id;
    }
    public int compareTo(Persona persona) {
        int resultado;
        if (this.id==persona.id) {
            resultado = 0;
        }else
        if (this.id> persona.id){
            resultado=1;
        }else {
            resultado = -1;
        }
        return resultado;
    }
    //otra forma más sencilla de implementar compareTo para identificadores numéricos
    public int compareTo2(Persona persona){
        return this.id-persona.id;
    }
}