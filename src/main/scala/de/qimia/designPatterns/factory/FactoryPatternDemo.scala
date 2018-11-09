package de.qimia.designPatterns.factory

object FactoryPatternDemo extends App {
val toyFactory=new ToyFactory()
  val duck=toyFactory.getToy("duck")
  val car=toyFactory.getToy("car")
  val doll=toyFactory.getToy("doll")
  duck.play()
  doll.play()
  car.play()
}
