# specs2-issue-478
Demo of Akka ActorSystem config errors present in the latest version of the Specs2 library (v3.8).

Link to github issue (issue 478): [https://github.com/etorreborre/specs2/issues/478](https://github.com/etorreborre/specs2/issues/478)

Two different error reproductions are provided.
- IssueWithMixinSpec.scala: Using a SpecificationLike mix-in while creating an ActorSystem via extending the TestKit(ActorSystem("")) abstract class.
- IssueWithExtendsSpec.scala: Extending the Specification abstract class while instantiating an ActorSystem in the test body.

build.sbt provides the dependencies to reproduce both a working and broken
 use-case scenario via the different Specs2 versions. There is also a
 "latest.release" version for Akka dependencies as well as an older Akka
 version to demonstrate there is consistent behavior across Akka versions,
 and the bug is only introduced when using the newer version of Specs2
 (regardless of which available Akka version is specified).

To reproduce, simply run the "sbt test" task while having the "latest.integration" Specs2 version uncommented in the build.sbt file.
