import akka.actor.ActorSystem

class IssueWithExtendsSpec extends org.specs2.mutable.Specification {

  // No logic required except instantiation of ActorSystem instance
  val testSystem = ActorSystem("extendsSpecSystem")

}
