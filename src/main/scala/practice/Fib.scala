package practice

class Fib {
  def getFibValue(n: Int): Int = n match {
    case 0 => 0
    case 1 => 1
    case _ => getFibValue(n-1) + getFibValue(n-2)
  }

  def getFibValueNR(n:Int) = {
    val nRange = 3 to n
    lazy val (a,b) = nRange.foldLeft((0,1))((z:Tuple2[Int,Int],f:Int) =>
      (z._2, z._1 + z._2))

    if (n == 0) 0
    else if (n == 1) 1
    else a+b
  }

  def getFibValueStream(n: Int): Int = {
    lazy val fibs: Stream[Int] = 1 #:: fibs.scanLeft(1)(_ + _)
    n match {
      case 0 => 0
      case _ =>   fibs.take(n).toList.last
    }
  }
}

/*
If you're good with matrix multiplication you can bring the time cost down even further, to O(\lg{n})O(lgn). Can you figure out how?
 */