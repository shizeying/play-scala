import scala.Console.in

name := "play.start"
 
version := "1.0" 
      
lazy val `play-start` = (project in file(".")).enablePlugins(PlayScala)



scalaVersion := "2.12.12"

libraryDependencies ++= Seq( jdbc , ehcache , ws , specs2 % Test , guice )


      