import java.net._
import java.io._
import scala.io._



val s = new Socket(InetAddress.getByName("localhost"), 9999)
lazy val in = new BufferedSource(s.getInputStream()).getLines()
val out = new PrintStream(s.getOutputStream())

out.println("Hello, world!")
out.flush()
println("received: " + in.next())

s.close()