package de.qimia.designPatterns.command

class AddNoodle(chef: Chef)  extends Command {
  override def execute(): Unit = {
    chef.addOrder(OrderType.Noodle)
  }
}