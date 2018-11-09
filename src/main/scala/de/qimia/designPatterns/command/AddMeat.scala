package de.qimia.designPatterns.command

class AddMeat(chef: Chef) extends Command {

  override def execute(): Unit = {
    chef.addOrder(OrderType.Meat)
  }
}
