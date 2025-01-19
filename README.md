# INSTRUCCIONES

El juego de Siete y Media enfrenta al jugador contra la banca. El jugador es quien toma las decisiones, mientras que la banca actúa automáticamente según las reglas. En la baraja utilizada para este juego no hay 8s ni 9s. Los valores de las cartas son los siguientes: el 10 representa la sota, el 11 el caballo y el 12 el rey. Las figuras (sota, caballo y rey) valen medio punto, mientras que el resto de las cartas tienen su valor numérico correspondiente.

El juego se juega en dos turnos: el turno del jugador y el turno de la banca, siendo el turno del jugador el primero. Durante su turno, el jugador puede pedir cartas a la banca, una a una, hasta que decida plantarse o se pase de 7 y medio. Si la suma de las cartas del jugador supera los 7.5 puntos, el jugador pierde automáticamente, ya que se "pasa de siete y medio".

Si el jugador no se pasa, la banca comienza a sacar cartas. La banca está obligada a sacar cartas hasta igualar o superar al jugador en puntos, pero sin pasarse de 7.5. En este proceso, si la banca consigue empatar o superar la puntuación del jugador sin pasarse de 7.5, la banca gana. Sin embargo, si la banca se pasa de 7.5, pierde y el jugador gana. La banca no puede plantarse en ningún momento y debe seguir sacando cartas hasta que consiga igualar o superar al jugador, o se pase.

Al final, el objetivo del jugador es acercarse lo máximo posible a 7.5 sin exceder ese límite, mientras que la banca trata de superar al jugador sin pasarse.

>El proyecto está organizado en dos carpetas principales:
>
>-**recursos**: Contiene las clases que definen la lógica del juego, como las cartas, el mazo y la gestión de las puntuaciones:
>
>- Carta.java: Representa una carta de la baraja española.
>- Baraja.java: Contiene la lógica para barajar y repartir las cartas.
>- Palo.java: Representa los palos de las cartas.
>
>-**sieteymedia**: Contiene la lógica del propio juego:
>
>- GameController.java: Clase principal para controlar el flujo del juego, el main que se ejecuta.