package de.qimia.designPatterns.factory

class ToyFactory {
def getToy(toyName:String):Toy=toyName.toLowerCase() match {
  case "duck" => new Duck()
  case "car" => new Car()
  case "doll" => new Doll()
  case _ => null
}
}
