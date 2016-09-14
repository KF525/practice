package practice

class Fib {
  def getFibValue(n: Int): Int = n match {
    case 0 => 0
    case 1 => 1
    case _ => getFibValue(n-1) + getFibValue(n-2)
  }
}
