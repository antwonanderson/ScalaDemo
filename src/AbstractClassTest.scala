/**
  * Created by scuanieg on 6/3/2016.
  */
abstract class AbstractClassTest[+T] {
  val element: T
}

abstract class SeqBuffer[U, +T <: Seq[U]] extends AbstractClassTest[T] {
  def length = element.length
}

object AbstractTypeTest2 extends App {
  def newIntSeqBuf(e1: Int, e2: Int): SeqBuffer[Int, Seq[Int]] =
    new SeqBuffer[Int, List[Int]] {
      val element = List(e1, e2)
    }
  val buf = newIntSeqBuf(7, 8)
  println("length = " + buf.length)
  println("content = " + buf.element)
}

