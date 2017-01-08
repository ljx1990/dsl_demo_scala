name := "RemotingExampleRemoteNode"

version := "1.0"

scalaVersion := "2.11.3"

resolvers += "Typesafe Repository" at "http://121.40.184.179:8081/nexus/content/groups/public/"

libraryDependencies ++= Seq(
  "com.typesafe.akka" % "akka-actor" % "2.0.2",
  "com.typesafe.akka" % "akka-remote" % "2.0.2",
  "com.typesafe.akka" % "akka-kernel" % "2.0.2"
)
