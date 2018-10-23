import java.net._
import java.io._
import scala.io._

val getUserInput = () => {
  val userIn = scala.io.StdIn.readLine()

  val url = raw"(^http.*)".r
  val result = url.findFirstIn(userIn).getOrElse(false)
  if(result != false){
      println(result)
  }
  println(result)
}


getUserInput()