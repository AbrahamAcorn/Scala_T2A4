object Pacientes {
  class Paciente {
    var name = "pepe"
    var ap1 = "Suarez"
    var ap2 = "Martinez :v"
    var edad = 23
    var fechas = List("01-02-2018","11-11-2018","03-11-2019","05-12-2019","31-10-2019")
    var horas = List("21:04","22:08","17:00","15:33","17:21")
    var lv = List(2,5,3,1,2)
    var temper = List(22.2,12.4,55.4,12.4,11.9)
    var humed = List(21.2,44.2,55.2,12.7,55.2)

    def promedioBienestar():Double = {
      lv.sum.toDouble / lv.length.toDouble
    }

    def temperaturaMayor():Unit = {
      var mayor = 0.0
      var lvMayor = 0
      var fechaMayor = ""


      for( i <- 0 until temper.length){
        if (temper(i) > mayor)
        {
          mayor = temper(i)
          lvMayor = lv(i)
          fechaMayor = fechas(i)
        }
      }

      println("La Temperatura mayor registrada es de: "+mayor+" Se registro en: "+fechaMayor+" y el nivel de bienestar es de: "+lvMayor)

    }

    def temperaturaMenor():Unit = {
      var menor = 1000000.0
      var lvMenor = 0
      var fechaMenor = ""


      for( i <- 0 until temper.length){
        if (temper(i) < menor)
        {
          menor = temper(i)
          lvMenor = lv(i)
          fechaMenor = fechas(i)
        }
      }

      println("La Temperatura mayor registrada es de: "+menor+" Se registro en: "+fechaMenor+" y el nivel de bienestar es de: "+lvMenor)

    }

  }

  def main(args: Array[String]): Unit = {
    val pac = new Paciente
    println("Promedio de Nivel de Bienestar para el paciente"+pac.name+" es de :"+pac.promedioBienestar())
    pac.temperaturaMayor()
    pac.temperaturaMenor()
  }
}
