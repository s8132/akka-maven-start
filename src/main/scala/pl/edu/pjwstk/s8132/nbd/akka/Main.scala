package pl.edu.pjwstk.s8132.nbd.akka

import akka.actor.{Props, ActorSystem}

object Main extends App{
  val system = ActorSystem("HelloSystem")
  val helloActor = system.actorOf(Props[HelloActor], name = "helloactor")
  helloActor ! "hello"
  helloActor ! "witaj"
}