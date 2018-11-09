package de.qimia.designPatterns.command

object Customer{
  def main(args: Array[String]): Unit = {
    val waiter = new Waiter()
    val chef = new Chef()
    val addRice = new AddRice(chef)
    val addMeat = new AddMeat(chef)
    val addSalad = new AddSalad(chef)
    waiter.order(addRice)
    waiter.order(addMeat)
    waiter.order(addSalad)
    chef.printOrders()
  }
}
