package de.qimia.designPatterns.command

class AddSalad(chef: Chef) extends Command {
  override def execute(): Unit = {
    chef.addOrder(OrderType.Salad)
  }
}
