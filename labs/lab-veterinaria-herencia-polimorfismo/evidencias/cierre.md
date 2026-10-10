# Cierre y Reflexión del Aprendizaje - Laboratorio Veterinaria

## 1. Comparación entre Algoritmo Inicial y Solución Final
- **Algoritmo Inicial:** Se enfocaba en estructuras estáticas o condicionales rígidas para tratar a cada animal por separado.
- **Solución Final:** Implementa una arquitectura orientada a objetos escalable mediante una jerarquía de clases (`Animal` -> `Mascota`/`Salvaje` -> `Perro`, `Gato`, `Tigre`, `Leon`).

## 2. Conceptos Clave Aplicados
- **Herencia:** Reutilización de atributos y métodos comunes (`nombre`, `edad`, `peso`, `comer()`) definidos en la clase base `Animal`.
- **Constructor Chaining (`super()`):** Delegación de la inicialización de atributos hacia las clases superiores en la jerarquía.
- **Polimorfismo:** Procesamiento uniforme mediante referencias `List<Animal>`, permitiendo que cada subclase ejecute su propia implementación sobrescrita de `hacerSonido()`.

## 3. Posibles Mejoras Futuras
- Convertir la clase `Animal` en una clase abstracta o interfaz para forzar la implementación del método `hacerSonido()`.
- Incorporar persistencia de datos (base de datos o lectura de archivos) para gestionar los pacientes de la veterinaria de forma dinámica.