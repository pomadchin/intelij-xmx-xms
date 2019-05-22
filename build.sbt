name := "intelij-xmx-xms"
version := "0.1.0-SNAPSHOT"
scalaVersion := "2.12.8"
crossScalaVersions := Seq("2.12.8", "2.11.12")

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "2.4.3" % Provided, 
  "org.scalatest"  %% "scalatest" % "3.0.7" % Test
)
