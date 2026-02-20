# isa-factorial
Proyecto de prueba para el factorial.

## Requisitos

### Versión Python
- Python 3.13+
- pytest
- coverage
- pytest-cov

### Versión Java
- Java JDK 18+
- Maven
- JUnit
- Jacoco


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

### Java
1. Compilar con Maven: `mvn clean compile`


## Ejecución

### Python
- Ejecutar la aplicación: `python main.py <número>`
- Ejecutar los tests: `pytest -v`
- Ejecutar los tests con informe de cobertura: `pytest -v --cov=factorial --cov-report=html tests/`

### Java
- Ejecutar la aplicación: Clic en Run usando el IDE.
- Ejecutar los tests con informe de cobertura (previamente configurado en pom.xml): `mvn test`
