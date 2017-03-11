
name := "ptesting"

version := "1.0"

scalaVersion := "2.11.8"



sparkVersion := "2.1.0"

sparkComponents ++= Seq("sql","hive")

spName := "milinkp/ptesting"

credentials += Credentials(Path.userHome / ".ivy2" / ".sbtcredentials") // A file containing credentials

licenses += "Apache-2.0" -> url("http://opensource.org/licenses/Apache-2.0")
