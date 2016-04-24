name := """mailSample"""

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "org.apache.commons" % "commons-email" % "1.4",
  "junit"             % "junit"           % "4.12"  % "test"
)
