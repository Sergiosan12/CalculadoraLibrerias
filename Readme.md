## Examen Calculadora

1. En primer lugar, se crea una nueva rama "raices" en el proyecto de calculadora ya hecho en clase y nos ponemos a trabajar en esta nueva rama.
2. A continuación, se hace una nueva variable para la raiz y se realiza las operaciones necesarias en el switch para que de bien el resultado, controlando los errores.
3. Para las raíces cuadrada y cúbica se hace con "Math.sqrt" y "Math.cbrt" dependiendo de si el indice que enviamos es 2 o 3, en caso de que sea cualquier otro que de un error de que no se puede realizar la operacion. Hago un cast a float.
4. Hago un commit de lo hecho hasta ahora.
5. Ahora hago que se pueda calcular cualquier tipo de raiz independientemente del índice. Esto lo consigo inviertiendo la función potencia "Math.pow". Se hace la potencia del radicando al índice invertido (1/ind).
6. Se realiza un commit y se hace un merge squash a la rama principal para tener todo en el mismo commmit en la main.
7. Se crea un paquete donde va a estar la libreria jar.
8. Después se crea el jar para que se pueda usar como una libreria. Esto se hace desde ProjectStructure>Artifacts>Jar>From modules with dependencies. Y donde la main class lo dejamos vacío para que se pueda usar como una librería. Luego vamos a Build>Build Artifacts para acabar de crear el Jar.
9. Por último, etiqueto el último commit y creo la release en github con la libreria.