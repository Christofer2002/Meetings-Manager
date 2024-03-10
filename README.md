# Meetings Manager

Meetings Manager es una aplicación web diseñada para ayudar a los usuarios a gestionar sus reuniones de manera eficiente. La aplicación ofrece una interfaz intuitiva y amigable que permite a los usuarios crear, visualizar y editar reuniones de forma sencilla.

## Principales Funcionalidades

- Inicio de Sesión y Cierre de Sesión: Los usuarios pueden iniciar sesión en la aplicación utilizando sus credenciales. Una vez autenticados, pueden acceder a todas las funcionalidades de la aplicación. Además, tienen la opción de cerrar sesión cuando lo deseen.

- Visualización de Lista de Reuniones: Después de iniciar sesión, los usuarios pueden ver una lista de todas las reuniones que han registrado previamente. Esta lista se muestra en la página principal de la aplicación y proporciona detalles básicos sobre cada reunión, como el título, la fecha y la hora.

- Visualización de Detalles de Reunión: Al hacer clic en una reunión específica de la lista, los usuarios pueden ver los detalles completos de esa reunión, incluida una lista de contactos asociados. Esta vista detallada proporciona información adicional sobre la reunión y permite a los usuarios realizar cambios si es necesario.

- Creación de Nueva Reunión: Los usuarios tienen la opción de crear una nueva reunión haciendo clic en un botón de agregar reunión. Esto abrirá una ventana emergente donde pueden ingresar los detalles de la reunión, como el título, la fecha, la hora y la lista de contactos. La lista de contactos se puede configurar seleccionando contactos existentes o agregando nuevos contactos manualmente.

- Gestión de Lista de Contactos: Durante la creación de una nueva reunión, los usuarios pueden agregar o eliminar contactos de la lista de contactos asociada a esa reunión. Esto les permite personalizar la lista de asistentes según sea necesario.

## Tecnologías Utilizadas

- Frontend: React.js
- Backend: Spring Boot (Java)
- Base de Datos: MySQL (compatible con PHPMyAdmin)
- Autenticación: JSON Web Tokens (JWT)
- API REST para la comunicación entre frontend y backend.

## Requisitos Previos

Asegúrese de tener instalados los siguientes componentes antes de comenzar:

- Node.js y npm (https://nodejs.org/)
- Java Development Kit (JDK) 11 (https://adoptopenjdk.net/)
- MySQL (https://dev.mysql.com/downloads/)
- PHPMyAdmin (https://www.phpmyadmin.net/)

## Pasos de Instalación

### Backend (Spring Boot)

1. Clonar el repositorio

```bash
git clone https://github.com/Christofer2002/Meetings-Manager.git
cd BackendMeetingsManager
````

2. Configuración de la Base de Datos

Actualice las configuraciones de la base de datos en src/main/resources/application.properties.

3. Ejecutar la aplicación

```bash
/mvnw spring-boot:run
````
El backend estará disponible en http://localhost:8080.

### Frontend (React)
1. En el directorio raíz del proyecto, navegue al directorio del frontend.
   
```bash
cd FrontendMeetingsManager
```
2. Instalar dependencias
   
```bash
npm install
```
3. Configurar la URL del backend
   
Actualice la URL del backend en el archivo src/config.js según la URL donde se esté ejecutando el backend.

5. Ejecutar la aplicación

```bash
npm start
```
La aplicación estará disponible en http://localhost:3000.

### Uso de la Aplicación
- Acceda a la aplicación desde su navegador utilizando la URL proporcionada después de ejecutar el frontend.
- Inicie sesión con las credenciales proporcionadas o cree una nueva cuenta.
- Explore las diversas funciones de gestión de inventario, informes de ventas y más.

### Contribuciones y Problemas
¡Las contribuciones son bienvenidas! Si encuentra algún problema o tiene ideas para mejoras, abra un problema en el repositorio.

### Licencia
- Este proyecto está bajo la Licencia MIT - vea el archivo LICENSE para más detalles.
