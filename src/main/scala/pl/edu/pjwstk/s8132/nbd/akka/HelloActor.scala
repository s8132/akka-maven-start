package pl.edu.pjwstk.s8132.nbd.akka

import akka.actor.Actor

class HelloActor extends Actor{
  override def receive: Receive = {
    case "hello" => println("hello back at you")
    case _ => println("???")
  }
}
