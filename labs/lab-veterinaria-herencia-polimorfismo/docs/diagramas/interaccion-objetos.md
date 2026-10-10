# Diagrama de Interacción Polimórfica

Interacción donde la clase `MainEv1` o `Veterinaria` llama al método `hacerSonido()` sobre una lista de tipo `Animal`, y cada subclase responde con su implementación particular.

```mermaid
graph LR
    MainEv1["MainEv1 / Veterinaria"] -->|atender / hacerSonido| Animal["Animal (Referencia general)"]
    Animal --> Perro["Perro ('Guau guau')"]
    Animal --> Gato["Gato ('Miau miau')"]
    Animal --> Tigre["Tigre ('Grrr')"]
    Animal --> Leon["Leon ('Roooar')"]