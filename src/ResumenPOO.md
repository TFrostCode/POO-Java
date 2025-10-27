
    Herencia:   Dada una clase padre (Persona) vamos a tener otras clases hijas (Gerente, Empleado, etc)
                que van a heredad los atributos, métodos, contructores, etc
                de esa clase padre. 
                Sirve para no repetir tanto codigo.
                Algo que nos puede ayudar a entender cuando es una herencia se usa 
                " es un / una" e.g. "Gerente es una persona".

    Polimorfismo: Una funcion que tenga el mismo nombre pero que haga algo diferente en diferentes clases.
                    Un ejemplo clásico es el método toString().

    Abstraccion: Clases o métodos que no van a ser instanciados, utilizado como 
                    una "plantilla". Por ejemplo se crea el metodo 
                    private abstract double sueldo() en persona que no lo utiliza como tal
                    pero todas las clases hijas si deben implementar obligatoriamente.