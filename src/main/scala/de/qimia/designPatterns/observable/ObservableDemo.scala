package de.qimia.designPatterns.observable

object ObservableDemo {
  def main(args: Array[String]): Unit = {
    val redDress = new RedDress()
    val user1 = new User(redDress, "Melisa")
    val user2 = new User(redDress, "Julia")
    val user3 = new User(redDress, "Katherin")
    if (!redDress.isInStock()) {
      user1.subscibe()
      user2.subscibe()
      user3.subscibe()
    }
    redDress.setInStock(true)
  }

}
