import scala.io.StdIn.readInt

object Calculator {
  def main(args: Array[String]): Unit = {
    println("### Calculadora de la Vida ###")
    println("Esta calculadora te indica cuánto dinero tienes en cada etapa de la vida, en base a tus ingresos y gastos MENSUALES.")
    val edad = leerInt("Ingresa tu edad: ")
    print( mensajeFinal( edad, sumaIngresosEgresos(edad) ) )
  }

  def leerInt(mensaje: String): Int = {
    print(mensaje)
    val edad = readInt()
    return edad
  }
  def mensajeFinal(edad: Int, dinero: Int): String = {
    return "A sus " + edad + " años, usted tiene $" + dinero
  }

  def sumaIngresosEgresos(edad: Int) : Int ={
    val suma = sumaIngresos(edad) - sumaEgresos(edad)
    return suma
  }

  def sumaIngresos(edad:Int) :Int={
    val suma = calcularMesada(edad) + calcularHerencia(edad) + calcularSubsidio(edad) +calcularSalario(edad) + calcularEmprendimiento(edad) + calcularIngresoPareja(edad)
      return suma
  }

  def sumaEgresos(edad: Int): Int = {
    val suma = calcularDeuda(edad) + calcularEgresoPareja(edad) + calcularEgresoHijos(edad)
      return suma
  }

  def calcularMesada(age:Int): Int ={
    if (age<24 && age>=18){
      val mesada = leerInt("Ingresa el valor de la mesada que recibes mensualmente: ")
      return mesada
    }
    else{
      return 0
    }
  }

  def calcularHerencia(age: Int): Int = {
    if (age < 80 && age > 18) {
      val herencia = leerInt("Ingresa el valor de la herencia que recibes mensualmente: ")
      return herencia
    }
    else {
      return 0
    }
  }

  def calcularSubsidio(age: Int): Int = {
    if (age < 80 && age > 57) {
      val subsidio = leerInt("Ingresa el valor de la jubilización o subsidio que recibes mensualmente: ")
      return subsidio
    }
    else {
      return 0
    }
  }

  def calcularSalario(age: Int): Int = {
    if (age < 62 && age > 18) {
      val salario = leerInt("Ingresa el valor del salario que recibes mensualmente: ")
      return salario
    }
    else {
      return 0
    }
  }

  def calcularEmprendimiento(age: Int): Int = {
    if (age < 80 && age > 18) {
      val emprendimiento = leerInt("Ingresa el valor que por tu emprendimiento recibes mensualmente: ")
      return emprendimiento
    }
    else {
      return 0
    }
  }

  def calcularIngresoPareja(age: Int): Int = {
    if (age < 80 && age > 30) {
      val ingresoPareja = leerInt("Ingresa el valor del dinero que ganas por tu pareja mensualmente: ")
      return ingresoPareja
    }
    else {
      return 0
    }
  }

  def calcularEgresoPareja(age: Int): Int = {
    if (age < 80 && age > 30) {
      val egresoPareja = leerInt("Ingresa el valor del dinero que inviertes en tu pareja mensualmente: ")
      return egresoPareja
    }
    else {
      return 0
    }
  }

  def calcularEgresoHijos(age: Int): Int = {
    if (age < 55 && age > 31) {
      val egresoHijos = leerInt("Ingresa el valor del dinero que inviertes en tus hijos mensualmente: ")
      return egresoHijos
    }
    else {
      return 0
    }
  }

  def calcularDeuda(age: Int): Int = {
    if (age < 80 && age > 24) {
      val deuda = leerInt("Ingresa el valor que pagas en deudas mensualmente: ")
      return deuda
    }
    else {
      return 0
    }
  }








}
