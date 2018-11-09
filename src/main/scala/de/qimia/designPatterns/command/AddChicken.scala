package de.qimia.designPatterns.command

class AddChicken(chef: Chef)  extends Command {

  override def execute(): Unit = {
    chef.addOrder(OrderType.Chicken)
  }
}