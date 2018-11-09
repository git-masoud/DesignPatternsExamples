package de.qimia.designPatterns.command

import scala.collection.mutable.ListBuffer


class Chef {
  var orders=ListBuffer[OrderType.Value]()

  def addOrder(orderType: OrderType.Value)={
    orders += orderType
  }

  def printOrders()={
    orders.foreach(println(_))
  }

}
object OrderType extends Enumeration {
  val Rice, Noodle, Chicken, Meat, Salad, Yogurt = Value
}
