# 🧑🏻‍💻**Programación Orientada a Objetos - Actividad n° 2 - Java**

Este repositorio demuestra la aplicación práctica de la Programación Orientada a Objetos (POO) en Java a través de cuatro mini-proyectos. Cada uno se enfoca en un concepto clave, presentando su implementación y código correspondiente para facilitar el aprendizaje.

## 📚 **Tabla de Contenidos**

* 🧩 [Introducción a `toString()`](#parte-1-introducción-a-tostring)
* 🧩 [Implementación de librería Apache Commons Lang](#Parte-2-Implementación-de-librería-Apache-Commons-Lang)
* 🧩 [Palabra reservada `Static`](#parte-3-palabra-reservada-static)
* 🧩 [`Equals` y `HashCode`](#parte-4-equals-y-hashcode)
* 🏁 [Conclusión y aprendizaje](#conclusión-y-aprendizaje)

---

## 🧩**Parte 1: Introducción a `toString()`**

Este proyecto introduce el concepto y la utilidad del método `toString()` en Java, esencial para obtener una representación textual de nuestros objetos.

### 🎯 **Objetivo**

Comprender la limitación de la representación de objetos por defecto en Java y aprender a sobreescribir el método `toString()` para obtener una descripción en cadena clara y útil del estado de un objeto. Esto es crucial para la depuración (debugging) y el registro de información (logging). El proyecto utiliza la entidad `Persona` para ilustrar cómo una implementación personalizada de `toString()` mejora significativamente la legibilidad.

### 🛠️ **Estructura del Proyecto**

El proyecto se organiza de la siguiente manera:

* **`Entities/Persona.java`**: Define la entidad `Persona` con atributos básicos. Lo más importante aquí es la sobreescritura del método `toString()` para ofrecer una representación legible de los datos de una persona.

* **`POOEjercicio1.java`**: Clase principal con el método `main()`. En ella, se crean instancias de `Persona` y se imprimen en la consola para observar directamente el efecto de nuestro `toString()` personalizado.

### ✍️ **Uso del método `toString()`**

Por defecto, todo objeto en Java hereda el método `toString()` de la clase `Object`. Sin embargo, esta implementación base simplemente devuelve el nombre de la clase seguido de un símbolo `@` y el código hash del objeto en hexadecimal (ej. `poo.ejercicio1.Entities.Persona@1a46e30`). Esta representación, si bien identifica la clase y la ubicación en memoria del objeto, resulta poco útil para entender su estado interno durante la depuración o al generar logs informativos.

Para obtener una representación significativa, es fundamental **sobreescribir** (override) el método `toString()` en nuestras propias clases. Al hacerlo, podemos controlar qué atributos se muestran y cómo se formatean, facilitando la comprensión del objeto.

### 📝 **Ejemplo**

**`Persona.java`** (Representación personalizada)
```java
@Override
public String toString() {
	// Devolvemos una cadena que describe el objeto Persona de forma clara
	return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", tieneHijos=" + tieneHijos + '}';
}
```

### ✅ **Conclusión**

Sobreescribir toString() es una práctica fundamental en Java. Permite transformar nuestros objetos en representaciones textuales comprensibles, lo cual es invaluable para la depuración, el logging y, en general, para entender el estado de nuestras aplicaciones de manera más efectiva.

## 🧩**Parte 2: Implementación de librería Apache Commons Lang**

Este proyecto muestra cómo librerías externas pueden ayudarnos a escribir código más limpio y eficiente, centrándose en la generación de ``toString()`` con Apache Commons Lang.

### ✨ **Objetivo**

El objetivo principal es demostrar cómo utilizar la librería Apache Commons Lang, específicamente su clase ``ToStringBuilder``, para simplificar y estandarizar la implementación del método ``toString()``, reduciendo el código repetitivo (boilerplate) y ofreciendo estilos predefinidos.

### 🛠️ **Estructura del Proyecto**

* **`Entities/Domicilio.java`**: Define una entidad ``Domicilio``. Utiliza ``ToStringBuilder`` de Apache Commons Lang para su método ``toString()``.

* **`Entities/Persona.java`**: Entidad ``Persona`` que puede tener un ``Domicilio``. También podría usar ``ToStringBuilder`` (aunque el ejemplo se centra en ``Domicilio``).

* **`POOEj1Libraries.java`**: Clase principal que instancia objetos y muestra cómo ``ToStringBuilder`` facilita la creación de representaciones en cadena, incluso para objetos anidados.

### ✍️ **Uso del método ``toString()`` con Apache Commons Lang**
Apache Commons Lang es una librería popular que ofrece clases de utilidad para operaciones comunes. Su ``ToStringBuilder`` simplifica enormemente la creación de métodos ``toString()``. En lugar de concatenar manualmente strings y nombres de campos, esta clase proporciona una API fluida (fluent API) y configurable. Permite añadir campos fácilmente y elegir entre varios estilos de formato con mínimo esfuerzo.
### 📝 **Ejemplo**

`Domicilio.java` (Usando ``ToStringBuilder``)

```java
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Override
public String toString() {
	// Usamos ToStringBuilder para una implementación concisa y estilizada
	return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE) // Estilo corto
        	.append("calle", calle)
        	.append("ciudad", ciudad)
        	.toString();
}
```
`Main.java` (En ``POOEj1Libraries.java``)
```java
Domicilio domicilio = new Domicilio("Calle Falsa 123", "Springfield");
Persona persona1 = new Persona("Homero", "Simpson", 39, true, domicilio); // Ejemplo con domicilio
System.out.println(persona1); // Si Persona usa ToStringBuilder, incluirá Domicilio formateado
System.out.println(domicilio);
// Salida esperada para domicilio: Domicilio[calle=Calle Falsa 123,ciudad=Springfield]
```

### ✅ **Conclusión**

Librerías como Apache Commons Lang nos ahorran tiempo y esfuerzo en tareas repetitivas. ``ToStringBuilder`` es un excelente ejemplo de cómo podemos mejorar la calidad y legibilidad de nuestro código ``toString()`` con herramientas externas, haciéndolo más robusto y fácil de mantener.

## 🧩**Parte 3: Palabra reservada Static**

Este proyecto se enfoca en la palabra reservada ``static``, un concepto clave para entender cómo se comparten datos y comportamientos a nivel de clase en Java.

### ✨ **Objetivo**

Comprender el significado y uso de los miembros estáticos (atributos y métodos) en Java. Se busca clarificar que estos elementos pertenecen a la clase en sí, y no a una instancia particular, y explorar las implicaciones prácticas de este concepto.

### 🛠️ **Estructura del Proyecto**

* **`Entities/Auto.java`**: Contiene atributos de instancia (como ``patente``, ``marca``) y un atributo estático (``dto`` - descuento) y un método estático (``anularDescuento()``). El método de instancia ``precioPromocional()`` utiliza el descuento estático.

* **`POOEjercicio2.java`**: Clase principal (``main``) que crea varios objetos ``Auto``. Demuestra cómo el atributo ``dto`` es compartido por todas las instancias y cómo un método estático puede modificarlo afectando a todas ellas.

### ✍️ **Uso de Static**

Cuando un miembro de una clase (atributo o método) se declara como ``static``, significa que existe una única copia de ese miembro asociada con la clase, independientemente de cuántas instancias (objetos) de esa clase se creen.
- **Atributos estáticos**: Son compartidos por todos los objetos de la clase. Si un objeto modifica un atributo estático, el cambio es visible para todos los demás objetos.
- **Métodos estáticos**: Pueden ser llamados directamente usando el nombre de la clase, sin necesidad de crear un objeto. Solo pueden acceder a otros miembros estáticos de la clase directamente.
Se acceden utilizando el nombre de la clase (ej. ``NombreClase.miembroEstatico``). Aunque es posible acceder a ellos a través de una instancia, no es la forma recomendada porque puede generar confusión sobre si el miembro pertenece a la instancia o a la clase. Los miembros estáticos son útiles para definir constantes (ej. ``Math.PI``), métodos de utilidad (ej. ``Arrays.sort()``), o para llevar un conteo de instancias, entre otros.

### 📝 **Ejemplo**

``Auto.java`` (Con miembros estáticos)

```java
public class Auto {
    private String patente; // Atributo de instancia
    public static double dto = 10.0; // Atributo estático (descuento)

    // ... constructor y otros métodos ...

    public static void anularDescuento(){ // Método estático
        Auto.dto = 0;
    }

    public double precioPromocional() { // Método de instancia
        // Usa el atributo estático 'dto'
        return this.getPrecio() * (1 - Auto.dto / 100);
    }
}
```

``Main.java`` (En ``POOEjercicio2.java``)

```java
	System.out.println("Descuento inicial: " + Auto.dto + "%"); // Acceso al dto estático
	Auto auto1 = new Auto("XP21R", "Peugeot", 20500.0, "Azul");
	System.out.println("Precio promo auto1: " + auto1.precioPromocional());

	Auto.anularDescuento(); // Llamada al método estático
	System.out.println("Descuento después de anular: " + Auto.dto + "%");

	Auto auto2 = new Auto("AB12CD", "Fiat", 15000.0, "Rojo");
	System.out.println("Precio promo auto2 (sin descuento): " + auto2.precioPromocional());
```

### ✅ **Conclusión**

Los miembros ``static`` son una herramienta poderosa para modelar comportamientos y datos que son inherentes a la clase en su conjunto. Entender su funcionamiento es crucial para diseñar clases eficientes y para utilizar correctamente muchas de las utilidades proporcionadas por el JDK de Java.

## 🧩**Parte 4: ``Equals`` y ``HashCode``**

Este proyecto aborda dos métodos fundamentales de la clase ``Object``: ``equals()`` y ``hashCode()``. Su correcta implementación es vital para la comparación de objetos y el funcionamiento de colecciones.

### ✨ **Objetivo**

Demostrar la importancia de sobreescribir los métodos ``equals()`` y ``hashCode()`` para definir correctamente la igualdad lógica entre objetos. Se busca entender por qué la implementación por defecto no siempre es adecuada y cómo una implementación incorrecta puede afectar el comportamiento de estructuras de datos como ``HashSet`` y ``HashMap``.

### 🛠️ **Estructura del Proyecto**

* **`Entities/Domicilio.java`**: Entidad simple. En este ejemplo, su igualdad se basará en la referencia si no se sobreescribe ``equals()``.

* **`Entities/Persona.java`**: Define la entidad ``Persona``. Sobreescribe ``equals()`` y ``hashCode()`` para comparar personas basándose en sus atributos (``nombre``, ``edad``, ``domicilio``), no solo en su dirección de memoria.

* **`POOEjercicio3.java`**: Clase principal (``main``) que crea instancias de ``Persona`` y compara objetos para ilustrar el comportamiento de ``equals()`` y cómo ``hashCode()`` es consistente.

### ✍️ **Uso de ``Equals`` y ``HashCode``**

``equals(Object obj)``: Determina si dos objetos son "lógicamente iguales". Por defecto (en la clase ``Object``), ``equals()`` compara referencias de memoria (es decir, si dos variables apuntan al mismo objeto). Para la mayoría de las clases, querremos definir la igualdad basada en el contenido o estado de los objetos (ej. dos personas son iguales si tienen el mismo ``DNI``).

``hashCode()``: Devuelve un valor entero (el "código hash") para un objeto. Este método es usado por colecciones basadas en hash (como ``HashMap``, ``HashSet``) para almacenar y recuperar objetos eficientemente.

#### ***Contrato entre ``equals()`` y ``hashCode()``***:

1.  Si ``obj1.equals(obj2)`` es ``true``, entonces ``obj1.hashCode()`` debe ser igual a ``obj2.hashCode()``.
2.  Si ``obj1.equals(obj2)`` es ``false``, no es necesario que ``obj1.hashCode()`` sea diferente de ``obj2.hashCode()``. Sin embargo, para un mejor rendimiento de las tablas hash, es deseable que objetos distintos tengan códigos hash distintos.

Incumplir este contrato puede llevar a comportamientos inesperados cuando los objetos se almacenan en colecciones basadas en hash, como ``HashSet`` o ``HashMap``, donde un objeto podría "perderse" o no ser encontrado correctamente.

### 📝 **Ejemplo**

``Persona.java`` (Sobrescribiendo equals y hashCode)
```java
import java.util.Objects;

// ...
@Override
public int hashCode() {
    // Objects.hash calcula un hashCode basado en los atributos proporcionados
    return Objects.hash(nombre, edad, domicilio);
}

@Override
public boolean equals(Object obj) {
    if (this == obj) return true; // Misma referencia, son iguales
    if (obj == null || getClass() != obj.getClass()) return false; // Objeto nulo o de distinta clase, no son iguales
    Persona other = (Persona) obj; // Casting seguro después de getClass() check
    // Comparamos los atributos relevantes para la igualdad lógica
    return edad == other.edad &&
           Objects.equals(nombre, other.nombre) &&
           Objects.equals(domicilio, other.domicilio);
}
```

### ✅ **Conclusión**

Implementar ``equals()`` y ``hashCode()`` de manera correcta es esencial para que nuestros objetos se comporten como esperamos, especialmente cuando interactúan con el framework de colecciones de Java. Permite definir una noción de igualdad que va más allá de la identidad del objeto, basándose en su significado dentro del dominio del problema.

## ✅**Conclusión y aprendizaje**

Este repositorio ha explorado conceptos cruciales de la Programación Orientada a Objetos en Java que son fundamentales para el desarrollo de software de calidad:

La personalización de la representación de objetos con ``toString()`` (manual y con librerías) es vital para la depuración y la claridad del código.
El entendimiento y la aplicación de miembros ``static`` permiten gestionar eficientemente datos y comportamientos a nivel de clase.
La correcta implementación de ``equals()`` y ``hashCode()`` es imprescindible para definir la igualdad lógica entre objetos y asegurar el funcionamiento predecible y eficiente de las colecciones.

Dominar estos conceptos es fundamental para escribir código Java que no solo funcione, sino que también sea robusto, legible, eficiente y fácil de mantener, aprovechando plenamente los principios de la Programación Orientada a Objetos.
