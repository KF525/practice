package practice

class ArrayRotation {
  def findStartingPointP(chars: List[String]) = {
    findStartingPoint(new ComparingList(chars))
  }

  def findStartingPoint(c: ComparingList): Int = c.size match {
    case greater if c.size > 2 =>
      if (c.first < c.last) c.firstIndex
      else if (c.first < c.mid) {
        findStartingPoint(c.secondHalf)
      } else {
        findStartingPoint(c.firstHalf)
      }
    case 2 => if (c.first < c.last) c.firstIndex else c.lastIndex
    case 1 => c.lastIndex
    case _ => 0
  }
}

case class ComparingList(chars: List[String], firstIndex: Int, lastIndex: Int) {
  def this(chars: List[String]) = this(chars, 0, chars.size - 1)

  def midpoint = firstIndex + ((lastIndex - firstIndex) / 2)

  def first = chars(firstIndex)

  def last = chars(lastIndex)

  def mid = chars(midpoint)

  def secondHalf = ComparingList(chars, midpoint, lastIndex)

  def firstHalf = ComparingList(chars, firstIndex, midpoint)

  def size = (lastIndex - firstIndex) + 1
}
