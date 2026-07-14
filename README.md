# LlanquihueDefinitiveApp

![Java](https://img.shields.io/badge/Java-23-orange?style=flat-square)
![Maven](https://img.shields.io/badge/Maven-Build-blue?style=flat-square)
![License](https://img.shields.io/badge/License-MIT-green?style=flat-square)

Aplicación Java desarrollada como evaluación formativa en la asignatura DOO1 (Diseño Orientado a Objetos) del DUOC UC. Sistema de gestión de servicios turísticos de la región del lago Llanquihue.

---

## 📋 Tabla de Contenidos

- [Descripción](#descripción)
- [Características](#características)
- [Requisitos Previos](#requisitos-previos)
- [Instalación](#instalación)
- [Estructura del Proyecto](#estructura-del-proyecto)
- [Documentación de Clases](#documentación-de-clases)
- [Uso](#uso)
- [Construcción y Empaquetamiento](#construcción-y-empaquetamiento)
- [Documentación](#documentación)
- [Autor](#autor)
- [Licencia](#licencia)

---

## 📝 Descripción

**LlanquihueDefinitiveApp** es una aplicación Java que forma parte de la evaluación formativa 4 de la asignatura DOO1. El proyecto implementa principios de Diseño Orientado a Objetos para gestionar y mostrar distintos servicios turísticos disponibles en la región del lago Llanquihue.

Servicios incluidos (ejemplos):

- **Excursiones Culturales:** Tours a lugares históricos con guías especializados.
- **Paseos Lacustres:** Experiencias en embarcaciones por el lago Llanquihue.
- **Rutas Gastronómicas:** Itinerarios culinarios con múltiples paradas.

**Institución:** DUOC UC  
**Asignatura:** DOO1 - Diseño Orientado a Objetos  
**Evaluación:** Formativa 4

---

## ✨ Características

- ✅ Desarrollo con Java 23
- ✅ Gestión de dependencias con Maven
- ✅ Documentación automática con Javadoc
- ✅ Código fuente organizado por paquetes (`ui`, `model`, `data`)
- ✅ Configuración UTF-8 para manejo de caracteres
- ✅ Compilación optimizada con las últimas versiones de Java
- ✅ Clases comentadas con Javadoc para mejor comprensión
- ✅ Patrón de herencia con clase base `ServicioTuristico`

---

## 🔧 Requisitos Previos

Antes de ejecutar el proyecto, asegúrate de tener instalado:

- **Java Development Kit (JDK):** Versión 23 o superior
  - Descarga desde: https://www.oracle.com/java/technologies/downloads/

- **Maven:** Versión 3.6.0 o superior
  - Descarga desde: https://maven.apache.org/download.cgi
  - Verifica la instalación: `mvn --version`

- **Git:** Para clonar el repositorio
  - Descarga desde: https://git-scm.com/

---

## 📥 Instalación

### 1. Clonar el Repositorio

```bash
git clone https://github.com/NicoC-XXVIII/LlanquihueDefinitiveApp.git
cd LlanquihueDefinitiveApp
```

### 2. Verificar la Estructura

```bash
ls -la
```

Deberías ver:
```
.gitignore
pom.xml
src/
README.md
```

### 3. Instalar Dependencias y Compilar

```bash
mvn clean install
```

---

## 🏗️ Estructura del Proyecto

```
LlanquihueDefinitiveApp/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── cl/
│   │           └── duoc/
│   │               └── doo1/
│   │                   ├── ui/                # Capa de Presentación
│   │                   │   └── Main.java
│   │                   ├── model/             # Modelos de Datos
│   │                   │   ├── ServicioTuristico.java      (Clase Base)
│   │                   │   ├── ExcursionCultural.java      (Hereda de ServicioTuristico)
│   │                   │   ├── PaseoLacustre.java          (Hereda de ServicioTuristico)
│   │                   │   └── RutaGastronomica.java       (Hereda de ServicioTuristico)
│   │                   └── data/              # Capa de Datos
│   │                       └── GestorServicios.java
│   └── test/                                  # (Opcional) Pruebas unitarias
├── pom.xml                                    # Configuración Maven
├── .gitignore                                 # Archivos ignorados por Git
└── README.md                                  # Este archivo
```

---

## 📚 Documentación de Clases

### Paquete `model` - Modelos de Datos

#### **ServicioTuristico.java** (Clase Base)
Clase abstracta que define la estructura común para todos los servicios turísticos.

**Atributos:**
- `nombre`: Nombre del servicio turístico
- `duracionHoras`: Duración en horas del servicio
- `precio`: Precio en pesos chilenos

**Métodos:**
- `ServicioTuristico()`: Constructor que inicializa los atributos
- `getNombre()`: Retorna el nombre del servicio
- `getDuracionHoras()`: Retorna la duración en horas
- `getPrecio()`: Retorna el precio
- `mostrarInfo()`: Método virtual que muestra información del servicio

---

#### **ExcursionCultural.java**
Representa una excursión a lugares históricos con guías especializados.

**Atributos Adicionales:**
- `lugarHistorico`: Nombre del lugar histórico a visitar
- `numeroGuias`: Cantidad de guías que acompañan la excursión

**Métodos:**
- `ExcursionCultural()`: Constructor que inicializa todos los atributos
- `mostrarInfo()`: Sobrescribe el método para mostrar información específica de excursiones

---

#### **PaseoLacustre.java**
Representa un paseo en embarcación por el lago Llanquihue.

**Atributos Adicionales:**
- `tipoEmbarcacion`: Tipo de embarcación (Ferri, Kayak, etc.)
- `clima`: Condiciones climáticas esperadas
- `horario`: Horario del paseo (Mañana, Tarde, Noche)
- `distanciaKm`: Distancia total del recorrido en kilómetros

**Métodos:**
- `PaseoLacustre()`: Constructor que inicializa todos los atributos
- `mostrarInfo()`: Sobrescribe el método para mostrar información específica de paseos

---

#### **RutaGastronomica.java**
Representa un itinerario culinario con múltiples paradas gastronómicas.

**Atributos Adicionales:**
- `numeroDeParadas`: Cantidad de establecimientos gastronómicos incluidos
- `tipo`: Descripción del tipo de comida (ej: "Almuerzo y postre")

**Métodos:**
- `RutaGastronomica()`: Constructor que inicializa todos los atributos
- `mostrarInfo()`: Sobrescribe el método para mostrar información específica de rutas gastronómicas

---

### Paquete `data` - Capa de Datos

#### **GestorServicios.java**
Gestor responsable de cargar y mostrar los servicios turísticos disponibles.

**Métodos:**
- `cargarServicios()`: Crea una lista con instancias de todos los servicios disponibles
- `mostrarServicios()`: Obtiene todos los servicios y muestra su información en consola

---

### Paquete `ui` - Interfaz de Usuario

#### **Main.java**
Clase principal de la aplicación. Punto de entrada del programa.

**Métodos:**
- `main(String[] args)`: Método principal que inicia la aplicación y muestra los servicios disponibles

---

## 🚀 Uso

### Compilar el Proyecto

```bash
mvn clean compile
```

### Ejecutar la Aplicación

```bash
mvn exec:java -Dexec.mainClass="cl.duoc.doo1.ui.Main"
```

O si el JAR está empaquetado:

```bash
java -jar target/LlanquihueDefinitiveApp-1.0-SNAPSHOT.jar
```

### Ejecutar Pruebas (si existen)

```bash
mvn test
```

### Generar Documentación Javadoc

```bash
mvn javadoc:jar
```

La documentación generada estará disponible en: `target/apidocs/index.html`

---

## 📦 Construcción y Empaquetamiento

### Crear JAR Ejecutable

```bash
mvn clean package
```

El archivo JAR se generará en: `target/LlanquihueDefinitiveApp-1.0-SNAPSHOT.jar`

### Propiedades de Compilación

- **Java Source:** 23
- **Java Target:** 23
- **Encoding:** UTF-8

---

## 📚 Documentación

### Javadoc Integrado

Esta aplicación genera automáticamente documentación Javadoc con Maven. Para acceder:

1. Ejecutar: `mvn javadoc:jar`
2. Abrir: `target/apidocs/index.html` en tu navegador

### Convenciones de Código

El proyecto sigue las convenciones estándar de Java:

- **Nombres de Clases:** PascalCase (`ServicioTuristico`)
- **Nombres de Métodos:** camelCase (`mostrarInfo()`)
- **Nombres de Variables:** camelCase (`lugarHistorico`)
- **Constantes:** UPPER_SNAKE_CASE (`MAX_SERVICIOS`)
- **Comentarios:** Javadoc para clases y métodos públicos

---

## 👤 Autor

**Autor:** NicoC-XXVIII  
**Institución:** DUOC UC  
**Asignatura:** DOO1 - Diseño Orientado a Objetos

---

## 📄 Licencia

Este proyecto está disponible bajo la Licencia MIT. Consulta el archivo `LICENSE` para más detalles.

---

## 🤝 Contribuciones

Este es un proyecto de evaluación académica. Las contribuciones externas no están permitidas salvo indicación explícita del autor.

---

## 📞 Soporte

Para preguntas o problemas relacionados con este proyecto:

- 📧 Usa GitHub Issues en este repositorio
- 🏫 Consulta con tu profesor en la asignatura DOO1

---

## 🔄 Historial de Cambios

| Versión | Fecha | Descripción |
|---------|-------|-------------|
| 1.0-SNAPSHOT | 14-07-2026 | Actualización de documentación y formato del README
| 1.0-SNAPSHOT | 06-07-2026 | Actualización de documentación y comentarios en clases
| 1.0-SNAPSHOT | 28-06-2026 | Versión inicial del proyecto

---

**Última actualización:** 14 de julio de 2026
