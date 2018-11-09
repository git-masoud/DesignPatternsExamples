package de.qimia.designPatterns.command

class AddRice (chef: Chef) extends Command {
  override def execute(): Unit = {
    chef.addOrder(OrderType.Rice)
  }
}