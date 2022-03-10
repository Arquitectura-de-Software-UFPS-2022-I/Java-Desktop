# Java-Desktop
## _Aplicación Java Desktop que conecta con la APIREST de Django_


# Java-Desktop - Introduccion
El Presente Proyecto open-source permite firmar un documento PDF, mediante la solicitud de la firma manuscrita de una o varias personas.
| Requerimientos | Descripcion  |
| ------------ | ------------ |
|  1 | Registrarse en la aplicación para poder usarla  |
|  2 | Registrar una firma, lo que consiste en subir una imagen. Es deseable una funcionalidad inteligente que verifique si la imagen corresponde a una firma.  |
|  3 | Subir un documento PDF y solicitar la firma de usuarios registrados en la plataforma. La solicitud es notificada al correo electrónico y en la aplicación debe existir una sección de solicitudes pendientes por firma y solicitudes firmadas.  |
|  4 | Firmar un documento PDF para el cual se ha solicitado la firma. La aplicación debe permitir visualizar el PDF, insertar la firma y guardarlo. |
|5|Debe quedar el registro histórico de las firmas.|

## Librerias

Se utilizadon las siguientes librerias para el desarrollo de la API:

- [ItexPDF](https://itextpdf.com/es) - Lectura de PDF
- [Gson](https://github.com/google/gson) - Mapeo de Json a Objetos

## Instalación

Requiere [Java 8](https://www.java.com/es/download/ie_manual.jsp) para ejecutar.

Archivo de configuración [parametros.properties](https://github.com/Arquitectura-de-Software-UFPS-2022-I/Java-AppCore/blob/main/src/resources/parametros.properties).

```properties
BASE = http://52.240.59.172:8000
```

## Modelos

Dentro del paquete models.

| DTO | Descripción |
| ------ | ------ |
| FileDto | Modelo generico para almacenar la información de los archivos que estásn subidos |
| FirmaDto | Modelo que retorna la api de validar la firma, para verificar su autenticidad |
| SignatureRequestDto | Solicitudes para firmar documentos |
| SignatureRequestUserDto | Solicitudes de usuarios para firmar documento asignado |
| UserDto | Modelo de cuentas de usuarios |

## Servicios

Dentro del paquete services.impl

| Service | Descripción |
| ------ | ------ |
| ApiService | Servicio centralizado para obtener los subservicios ofrecidos por la api para administrar los DTO |

## Autor(es)

**Omar Ramón Montes - Desarrollador**

-   <https://github.com/1151704>

## Institución Académica

**[Programa de Ingeniería de Sistemas]** de la **[Universidad Francisco de Paula Santander]**

[Programa de Ingeniería de Sistemas]: https://ingsistemas.cloud.ufps.edu.co/
[Universidad Francisco de Paula Santander]: https://ww2.ufps.edu.co/

## Licencia
El código fuente se publica bajo la [MIT License](https://github.com/Arquitectura-de-Software-UFPS-2022-I/Java-AppCore/blob/main/LICENSE).