# Polimorfismo
class Persona():
    def __init__(self):
        self.cedula = 13765890

    def mensaje(self):
        print(f"mensaje desde la clase Persona. Cédula {self.cedula}")


class Obrero(Persona):
    def __init__(self):
        self.__especialista = 1

    def mensaje(self):
        print(
            f"mensaje desde la clase Obrero. Especialidad {self.__especialista}")


nuevaPersona = Persona()
nuevaPersona.mensaje()

obrero_planta = Obrero()
obrero_planta.mensaje()
