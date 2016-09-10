package practice

trait ArrayRotation {
  def chars: List[String]

  def firstC: Int

  def lastC: Int

  def findStartingPoint(chars: List[String], firstC: Int, lastC: Int): Int = {
    if (lastC - firstC >= 2) {

      val midpoint = firstC + ((lastC - firstC)/ 2)

      if (chars(firstC) < chars(midpoint)) {
        findStartingPoint(chars, midpoint + 1, lastC)
      } else {
        findStartingPoint(chars, firstC, midpoint)
      }
    }
    else if(lastC - firstC == 1) {
      if (chars(firstC) < chars(lastC)) firstC
      else lastC
    }
    else if(lastC - firstC == 0) {lastC}
    else 0
  }
}

case class ComparingList(first: Int, last: Int, midpoint: Int)

object ArrayRotation {
  def apply(charList: List[String]) = new ArrayRotation {
    val chars = charList
    val firstC = 0
    val lastC = chars.size - 1
  }
}


/*
a, b, c, d, t, x, z
x, a, b, c, d, t, u
d, t, x, a, b, c, d
*/
