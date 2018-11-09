package de.qimia.designPatterns.command

class Waiter {
  private var command:Command=null
 def order(command: Command)={
    this.command=command
    command.execute()
  }
}
