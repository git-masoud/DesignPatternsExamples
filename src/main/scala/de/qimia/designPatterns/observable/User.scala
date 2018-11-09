package de.qimia.designPatterns.observable

class User(subject: Subject, name: String) extends Observer {

  override def update() = {
    buyDress()
    unSubscibe()
  }

  def buyDress(): Unit = {
    println(name + " says: Finally I got the dress.")
  }

  def subscibe() = subject.attach(this)

  def unSubscibe() = subject.detach(this)
}
