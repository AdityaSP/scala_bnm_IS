import scala.io.Source
val lines = Source.fromFile("data.csv").getLines().toList
var teams = lines.filter(x => x.contains("info,team")).map(x => x.split(",")(2))

println("Match is between " + teams(0) + " V/S " +teams(1))




//var s = "1:2:3:4"
//
//s.split(":").foreach(x => println(x))






