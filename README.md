# Algoritmos de Planificación de CPU

Trabajo Práctico de la materia **Sistemas Operativos** — Universidad Nacional de Luján (UNLu).

**Alumno:** Juan Espinosa Dennler
**Legajo:** 195160

## Descripción

Implementación en Java de simuladores de los principales algoritmos de planificación de procesos, que calculan tiempo de retorno y tiempo de espera (individual y medio) para un conjunto de procesos definido por su tiempo de llegada y tiempo de servicio.

## Algoritmos implementados

- **FCFS** (First Come, First Served)
- **SJF No Apropiativo** (Shortest Job First)
- **SJF Apropiativo** (SRTF — Shortest Remaining Time First)
- **Round Robin**, con dos variantes:
  - (a) Tiempo de conmutación = 0
  - (b) Tiempo de conmutación = Q/10

## Estructura del proyecto

```
src/
├── Proceso/
│   ├── Proceso.java            # Modelo de proceso y cálculo de métricas
│   └── CargadorProcesos.java   # Carga de procesos por consola o de ejemplo
├── Algoritmos/
│   ├── FCFS.java
│   ├── SJFNoApropiativo.java
│   ├── SJFApropiativo.java
│   └── RoundRobin.java
└── Main.java                   # Menú interactivo por consola
```

## Cómo ejecutar

1. Clonar el repositorio.
2. Abrir el proyecto en IntelliJ IDEA (o compilar manualmente con `javac`).
3. Ejecutar `Main.java`.
4. Elegir la forma de carga de procesos (ejemplo predefinido o carga manual por consola).
5. Elegir el algoritmo a ejecutar desde el menú. Para Round Robin, se solicita el quantum y el tiempo de conmutación.

## Métricas calculadas

Para cada proceso:

- **Tiempo de retorno** = Tiempo de finalización − Tiempo de llegada
- **Tiempo de espera** = Tiempo de retorno − Tiempo de servicio

Además, se calcula el **tiempo medio de retorno** y el **tiempo medio de espera** sobre el conjunto de procesos.
