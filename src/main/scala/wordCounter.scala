import scala.io.Source

object wordCounter extends App {
  val fileName = "C:\\Users\\l.balas\\Documents\\frenchpoem.txt"
  if (args(0) == "--words") {
    val wordList = Source.fromFile(fileName).getLines.flatMap(_.split("\\W+"))
    val wordCount = wordList.foldLeft(Map.empty[String, Int]) { (z, word) =>
      z + (word -> (z.getOrElse(word, 0) + 1))
    }
    wordCount.foreach(println)
    }
  else if (args(0) =="--lines"){
    val lines = Source.fromFile(fileName).getLines
    val charCount = lines.foreach(s=> println(s"$s : ${s.length}"))
    val wordList = Source.fromFile(fileName).getLines.flatMap(_.split("\\W+"))
    val wordCount = wordList.foldLeft(Map.empty[String, Int]) { (z, word) =>
      z + (word -> (z.getOrElse(word, 0) + 1))
    }
    wordCount.foreach(println)

  }
}
