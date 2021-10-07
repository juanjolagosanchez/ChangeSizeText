## Introducción 📖

Progama de hecho para deint en el curso 21-22, el programa consiste en dos activity, en la primera pedimos un dato
por pantalla y su tamaño, en la segunda activity se mostrará el resultado con el texto y el tamaño seleccionado.

## Programación ⌨️
En la fase de programación podemos ver en el ChangeSizeActivity el siguiente codigo

Para comenzar tenemos que crear un binding y enlazarlo a nuestro activity.
con una expresin lambda hacemos el proceso, primero creamos nuestro objeto bundle,
despues tenemos que añadir el mensaje a nuestro bundle, gracias a nuestro binding inicialmente creado podemos
pasarselo como parametro con el .getText y en skBar con el .getProgress();
por ultimo enviamos intent con el bundle, (importante usar en el intent el putExtras).
![Captura2](https://user-images.githubusercontent.com/72571218/136441194-f9589b9d-230b-4395-88da-2a70ee564904.PNG)

En mi activity ViewMessageActivity lo que hacemos es recoger los datos y usar las propiedades del binding para poder
manipular los datos , gracias al comando .setText, .setTextSize
![Captura](https://user-images.githubusercontent.com/72571218/136441006-d22f0883-7bfe-4190-984a-470c9a53a009.PNG)

Para el Uso de esta aplicacion hemos necesitado el uso de la clase User y Message Mostradas en las siguientes imagenes:
En la clase hemos implementado los get and set el constructor con parametros y el toString, 
¡Importante luego va a hacer falta hacer uso de la clase message que usa a la clase user y nos hace falta que sea Serializable si las dos clases no lo son nos dará un error!
![Captura3](https://user-images.githubusercontent.com/72571218/136442825-55678101-1559-4d6a-b185-26910b4890ca.PNG)
![Captura4](https://user-images.githubusercontent.com/72571218/136442827-5e834576-9eef-4da9-8b1e-c56f97861a12.PNG)
## Ciclo de vida de la aplicación ⌨️
Aquí podemos ver los metodos onStart, onResume, onPause, onStop, onDestroy para ver en cada momento cuando se activan
los metodos durante la ejecución del programa, Estos metos estan en la clase ChangeSizeTextActivity, ViewMessageActivity
![Captura8](https://user-images.githubusercontent.com/72571218/136444443-a4708bfc-bed5-4cda-8f9c-0ce9a38a2cef.PNG)




## Ejecutando las pruebas ⚙️

Aquí podemos ver el resultado de nuestra aplicación.
En las Imagnes podemos ver el uso de las etiquetas en diseño, EditText, seekBar y Button
En el EditText ponemos el texto que queramos, en el seekBar selecionamos el tamaño, y en boton con el que mostramos la otra activity
![Captura5](https://user-images.githubusercontent.com/72571218/136442816-96439e5f-bd04-4750-9554-c2ffbd3ff150.PNG)

A continuación vemos el resultado y el resultado con el teléfono rotado para ver que mantiene la información
![Captura6](https://user-images.githubusercontent.com/72571218/136442819-140ad8a1-935a-4282-b1a8-acce36f9378b.PNG)
![Captura7](https://user-images.githubusercontent.com/72571218/136442823-ac052f13-27b7-4204-9970-03cda066eaf9.PNG)

