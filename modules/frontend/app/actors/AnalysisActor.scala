package actors

import akka.actor.{Actor, Props, ActorRef}


// our domain message protocol
case object Join
case object Leave
final case class ClientSentMessage(text: String)


object AnalysisActor {
  def props(out: ActorRef) = Props(classOf[AnalysisActor],out)
}

class AnalysisActor(out: ActorRef) extends Actor {
  def receive = {
    case msg: String =>
      out ! ("I received your message: " + msg)
  }
}
