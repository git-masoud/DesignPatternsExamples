package de.qimia.designPatterns.observable

import scala.collection.mutable.ListBuffer

class RedDress extends Subject {
  private var users = new ListBuffer[Observer]()
  private var inStock = false

  def isInStock() = inStock

  def setInStock(boolean: Boolean) = {
    inStock = boolean
    if (inStock) notifyObservers()
  }


  override def notifyObservers(): Unit = for (user <- users) user.update()

  override def attach(user: Observer): Unit = {
    this.users += user
  }

  override def detach(user: Observer): Unit = {
    this.users -= user
  }
}
