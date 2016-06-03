/**
  * Created by scuanieg on 6/3/2016.
  * Call-By-Name mechanism passes a code block to the callee and each time the
  * calle accesses the parameter, the code blck is executed and the value is calculated
  */
object Test {
  def main(args: Array[String]) {
    delayed(time());
  }

  def time() = {
    println("Getting time in nano seconds")
    System.nanoTime
  }
  def delayed( t: => Long ) = {
    println("In delayed method")
    println("Param: " + t)
    t
  }
}
