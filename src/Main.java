public class Main {
    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();

        cliente.nombre = "Pedro";
        cliente.edad = 35;
        cliente.telefono = 2355667;
        cliente.credito = 23456;
        System.out.println("Cliente");
        System.out.println("Hola, me llamo" +" "+ cliente.nombre + ", tengo " + cliente.edad + " años y mi telefono es " + cliente.telefono+ " .Mi credito disponible es " +"$"+cliente.credito);

        trabajador.nombre = "Marco";
        trabajador.edad = 25;
        trabajador.telefono = 2355667;
        trabajador.salario = 59403.23;
                System.out.println(" ");
                System.out.println("Trabajador");
        System.out.println("Mi nombre es"+" "+trabajador.nombre);
        System.out.println("Tengo"+" "+trabajador.edad+" "+"años");
        System.out.println("Mi numero de telefono es"+" "+trabajador.telefono);
        System.out.println("Mi salario es"+" "+"$"+trabajador.salario);

    }

}

    class Persona{
        int edad;
        String nombre;
        int telefono;
    }
    class Cliente extends Persona{
        int credito;
    }
    class Trabajador extends Persona{
        Double salario;
    }
