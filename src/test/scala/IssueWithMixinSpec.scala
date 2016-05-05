import akka.actor.ActorSystem
import akka.testkit.TestKit

class IssueWithMixinSpec extends TestKit(ActorSystem("mixinSpecSystem")) with org.specs2.mutable.SpecificationLike {

  // No logic required except the above instantiation of ActorSystem instance

}
