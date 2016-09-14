package practice

class Fib {
  def getFibValue(n: Int): Int = n match {
    case 0 => 0
    case 1 => 1
    case _ => getFibValue(n-1) + getFibValue(n-2)
  }
}

/*
If you're good with matrix multiplication you can bring the time cost down even further, to O(\lg{n})O(lgn). Can you figure out how?
 */