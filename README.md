Ejercicio 11 - Configuración General de una Biblioteca

Explicación del programa

En este ejercicio se creó una clase llamada ConfiguracionBiblioteca que aplica el patrón Singleton para centralizar la configuración de la institución y compartir una única instancia entre los módulos de préstamos y consultas sin utilizar librerías externas ni imports.
La clase cuenta con:
- Una variable estática privada llamada instancia.
- Atributos privados (nombre, maxLibros y plazoDevolucion) con sus respectivos getters y setters validados.
- Un constructor privado que inicializa los valores por defecto de la biblioteca.
- Un método estático público llamado getInstancia() que devuelve siempre la misma referencia única.

Luego, dentro del método main, se simulan los dos módulos obteniendo referencias al Singleton:
ConfiguracionBiblioteca moduloPrestamos = ConfiguracionBiblioteca.getInstancia();
ConfiguracionBiblioteca moduloConsultas = ConfiguracionBiblioteca.getInstancia();

Finalmente, se utilizó System.out.println() para comprobar que ambas referencias apuntan al mismo objeto, realizar modificaciones desde un módulo y reflejarlas instantáneamente en el otro.

Lógica utilizada

La lógica del programa consiste en:
- Bloquear la instanciación externa directa mediante un constructor privado.
- Controlar el acceso global y la sincronización de atributos mediante getInstancia().
- Aplicar validaciones en los métodos de modificación (setters) para rechazar nombres vacíos o valores numéricos menores o iguales a cero, asegurando la integridad del estado compartido.

Resultado de la ejecución

La ejecución del programa muestra en la consola lo siguiente:
¿Es la misma instancia?: true

Configuración inicial (desde Consultas):
Nombre: Biblioteca Central
Máx. libros: 3
Plazo: 15 días

Modificando configuración desde Préstamos...
Error: El máximo de libros debe ser mayor a cero.

Verificando cambios (desde Consultas):
Nombre: Biblioteca Municipal
Máx. libros: 5
Plazo: 30 días

Captura de pantalla

<img width="938" height="536" alt="image" src="https://github.com/user-attachments/assets/96208c0c-8cda-4248-8117-12c5e2388dd3" />
