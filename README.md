Preguntas:
1.	¿Qué sucede si intento acceder directamente al atributo nombre desde el método main?
R: Si el atributo nombre es privado, se genera un error de compilación

2.	¿Qué ventaja tiene utilizar métodos getter para mostrar información?
R: Permite leer el atributo privado desde fuera de la clase y mantiene el encapsulamiento y permite hacer modificaciones

3.	¿Cómo garantizan los métodos setter un cambio controlado en los datos?
R: Encapsula el acceso a los atributos privados y sólo permite modificar a través de este método, permite actualizar e implementar lógicas de validación.

4.	¿Qué pasa si no creo métodos setter, se pueden cambiar los datos desde afuera?
R: No se podrá modificar el atributo desde fuera de la clase

5.	¿Por qué es recomendable tener atributos privados?
R: Para asegurar la protección de datos y mejorar el diseño orientado a objetos; para encapsular la información, controlar el acceso y modificación  de la información mediante getters y setters, ayudan a prevenir modificaciones accidentales y facilitan la mantenibilidad del código. 

-------------------------------------------------------------------

1. ¿Qué ocurre si declaras un atributo como `private`?
A)	Solo se puede acceder desde métodos dentro de su propia clase.


2.	¿Para qué sirve un método getter?
A)	Obtener el valor de un atributo privado desde fuera de la clase.


3.	¿Qué opción es verdadera sobre métodos privados?
A)	Son accesibles únicamente dentro de la misma clase.


4.	¿Es obligatorio tener un constructor en una clase?
A)	No, pero si no se define, Java genera uno por defecto.


5.	¿Qué hace un constructor sin parámetros?
A)	Inicializa los atributos con valores predefinidos.


6.	¿Qué es verdadero sobre constructores con parámetros?
A)	Permiten asignar valores al momento de crear el objeto.


7.	¿Cuál es el uso principal de la palabra clave `this`?
A)	Referirse a los atributos de la clase actual.


8.	¿Cómo puedes acceder a un atributo privado desde el `main()`?
A)	A través de métodos getter y setter públicos.


9.	¿Se puede enviar valores desde el `main()` a atributos privados?
A)	Sí, usando setters o constructores con parámetros.
   

10.	¿Qué opción representa una buena práctica al trabajar con atributos privados?
A)	Utilizar getters y setters para acceder o modificar valores.


11.	¿Qué ocurre si no defines ningún constructor?
A)	Java genera un constructor vacío por defecto.


12.	¿Qué permite un constructor con parámetros?
A)	Inicializar atributos con valores desde la creación del objeto.


13.	¿Qué ocurre si defines un constructor con parámetros y NO defines un constructor sin parámetros?
A)	Solo se puede crear el objeto con datos.


14.	¿Qué ventaja tiene usar `this` dentro del constructor?
A)	Evita conflictos de nombres entre atributos y parámetros.


15.	¿Un método puede tener parámetros y ser privado?
A)	Sí, cualquier método puede tener parámetros y ser privado.


16.	¿Qué sucede si defines dos constructores: uno sin parámetros y otro con parámetros?
A)	Puedes crear objetos de ambas formas.


17.	¿Se puede sobrecargar métodos dentro de la misma clase?
A)	Sí, si los métodos tienen diferentes parámetros.


18.	¿Cuál es el principal objetivo de los métodos getter y setter?
A)	Controlar acceso y modificación de atributos privados. 

19.	¿Qué tipo de métodos son los getter y setter?
A)	Públicos para acceder/controlar atributos privados.


20.	¿Por qué es mejor tener atributos privados y exponerlos mediante métodos?
A)	Evita accesos no deseados y permite validación antes de modificar.

