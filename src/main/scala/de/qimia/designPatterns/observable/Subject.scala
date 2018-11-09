package de.qimia.designPatterns.observable

trait Subject {
  def notifyObservers()
  def attach(o: Observer)
  def detach(o: Observer)

}
