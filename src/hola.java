public class hola {
    public static void main(String[] args) {
        System.out.println("Hola");
        Persona p = new Persona();
        System.out.println("Nombre: "+p.getName());
        System.out.println("Edad: "+p.getAge());
        p.setAge(25);
        System.out.println("Edad: "+p.getAge());


        Persona q=new Persona();
        System.out.println("Nombre Q: "+q.getName());
        System.out.println("Edad Q: "+q.getAge());
        q.setAge(42);
        System.out.println("Edad: "+q.getAge());

        Persona r=new Persona();
        System.out.println("Nombre R: "+r.getName());
        System.out.println("Edad R: "+r.getAge());
        q.setAge(42);
        System.out.println("Edad: "+r.getAge());

    }
}