# isa-factorial
Proyecto de prueba para el factorial.

## Requisitos
- Python 3.11+
- Pytest
- Java JDK 11+


## Preparación del entorno

### Python
1. Clonar este repositorio: `git clone https://github.com/jmhorcas/isa-factorial.git`
2. Desplazarse a la carpeta del proyecto:
   `cd isa-factorial/python-factorial`
3. Crear entorno virtual: `python -m venv env` (esto crea una carpeta `env` para el entorno virtual)
4. Activar el entorno virtual:
    - En Windows: `.\env\Scripts\Activate`
    - En Linux: `. env/bin/activate`
5. Instalar dependencias: `pip install -r requirements.txt`

## Ejecución

### Python
- Ejecutar la aplicación: `python main.py <número>`
- Ejecutar los tests: `pytest -v`
- Ejecutar los tests con informe de cobertura: `pytest -v --cov=factorial --cov-report=html tests/`
