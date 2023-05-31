# Documentación del proyecto: Práctica de segregación de interfaces en un juego de combate

## Segregación de interfaces

En este proyecto, se ha aplicado el principio de segregación de interfaces, que es uno de los principios del diseño de software SOLID. El principio de segregación de interfaces establece que los clientes no deben depender de interfaces que no utilizan por completo. En lugar de tener interfaces monolíticas con muchos métodos, se deben crear interfaces más pequeñas y específicas que se ajusten a las necesidades de los clientes individuales.

En este caso, se han definido dos interfaces: `Interfaces.Daño` y `Interfaces.Combate`. La interfaz `Interfaces.Daño` define un único método `recibirAtaque(int ataque)` que representa la capacidad de un objeto para recibir daño de un ataque. La interfaz `Interfaces.Combate` extiende la interfaz `Interfaces.Daño` e introduce el método `atacar()`, que representa la capacidad de un objeto para realizar un ataque. Esta segregación de interfaces permite que los clientes del código (como el personaje y los enemigos) dependan solo de los métodos relevantes para ellos.

La implementación de estas interfaces en las clases `Clases.Personaje`, `Clases.MobHostil` y `Clases.MobPacifico` cumple con el principio de segregación de interfaces al proporcionar solo los métodos necesarios para cada tipo de objeto. Esto facilita la extensibilidad del código, ya que es posible agregar nuevos personajes y enemigos sin tener que modificar las interfaces existentes o los clientes que dependen de ellas.

