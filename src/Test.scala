/**
  * Created by scuanieg on 6/3/2016.
  * Call-By-Name mechanism passes a code block to the callee and each time the
  * calle accesses the parameter, the code blck is executed and the value is calculated
  */
object Test {
  def main(args: Array[String]) {

    var countNumber = 10;
    while ( countNumber > 0 ) {
      delayed(time());
      countNumber -= 1
      println("countNumber is: " + countNumber);
    }

    var x = 10;
    if( x < 20 ) {
      println("This is if statement")
    }

    println( "muliplier(1) value = " +  multiplier(1) )
    println( "muliplier(2) value = " +  multiplier(2) )
  }

  var factor = 3
  val multiplier = (i:Int) => i * factor

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
