# LlanquihueDefinitiveApp

![Java](https://img.shields.io/badge/Java-23-orange?style=flat-square)
![Maven](https://img.shields.io/badge/Maven-Build-blue?style=flat-square)
![License](https://img.shields.io/badge/License-MIT-green?style=flat-square)

Aplicación Java profesional desarrollada como evaluación formativa en la asignatura DOO1 (Diseño Orientado a Objetos) del DUOC UC.

---

## 📋 Tabla de Contenidos

- [Descripción](#descripción)
- [Características](#características)
- [Requisitos Previos](#requisitos-previos)
- [Instalación](#instalación)
- [Estructura del Proyecto](#estructura-del-proyecto)
- [Uso](#uso)
- [Construcción y Empaquetamiento](#construcción-y-empaquetamiento)
- [Documentación](#documentación)
- [Autor](#autor)

---

## 📝 Descripción

**LlanquihueDefinitiveApp** es una aplicación Java que forma parte de la evaluación formativa 4 de la asignatura DOO1. El proyecto implementa principios de Diseño Orientado a Objetos para resolver problemas específicos de la región de Llanquihue.

**Institución:** DUOC UC  
**Asignatura:** DOO1 - Diseño Orientado a Objetos  
**Evaluación:** Formativa 4

---

## ✨ Características

- ✅ Desarrollo con Java 23
- ✅ Gestión de dependencias con Maven
- ✅ Documentación automática con Javadoc
- ✅ Código fuente organizado por paquetes
- ✅ Configuración UTF-8 para manejo de caracteres
- ✅ Compilación optimizada con las últimas versiones de Java

---

## 🔧 Requisitos Previos

Antes de ejecutar el proyecto, asegúrate de tener instalado:

- **Java Development Kit (JDK):** Versión 23 o superior
  - Descarga desde: [oracle.com/java](https://www.oracle.com/java/technologies/downloads/)
  
- **Maven:** Versión 3.6.0 o superior
  - Descarga desde: [maven.apache.org](https://maven.apache.org/download.cgi)
  - Verifica la instalación: `mvn --version`

- **Git:** Para clonar el repositorio
  - Descarga desde: [git-scm.com](https://git-scm.com/)

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
```

### 3. Instalar Dependencias

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
│   │               └── doo1/          # Código fuente principal
│   └── test/                          # (Opcional) Pruebas unitarias
├── pom.xml                             # Configuración Maven
├── .gitignore                          # Archivos ignorados por Git
└── README.md                           # Este archivo
```

### Organización de Paquetes

El código fuente está organizado bajo el paquete base: `cl.duoc.doo1`

```
cl.duoc.doo1/
├── [clases principales]
├── [utilitarios]
└── [modelos de datos]
```

---

## 🚀 Uso

### Compilar el Proyecto

```bash
mvn clean compile
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

- **Nombres de Clases:** PascalCase (`MiClase`)
- **Nombres de Métodos:** camelCase (`miMetodo()`)
- **Nombres de Variables:** camelCase (`miVariable`)
- **Constantes:** UPPER_SNAKE_CASE (`MI_CONSTANTE`)

---

## 👤 Autor

**Autor:** NicoC-XXVIII  
**Institución:** DUOC UC  
**Asignatura:** DOO1 - Diseño Orientado a Objetos

---

## 📄 Licencia

Este proyecto está disponible bajo la Licencia MIT. Para más información, consulta el archivo LICENSE (si está disponible).

---

## 🤝 Contribuciones

Este es un proyecto de evaluación académica. Las contribuciones externas no están permitidas.

---

## 📞 Soporte

Para preguntas o problemas relacionados con este proyecto:

- 📧 Contacta a través de GitHub Issues
- 🏫 Consulta con tu profesor en la asignatura DOO1

---

## 🔄 Historial de Cambios

| Versión | Fecha | Descripción |
|---------|-------|-------------|
| 1.0-SNAPSHOT | 28-06-2026 | Versión inicial del proyecto |

---

**Última actualización:** 28 de junio de 2026
