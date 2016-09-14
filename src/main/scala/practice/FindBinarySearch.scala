package practice

class FindBinarySearch {
  def findInteger(orderedSet: OrderedSet, integer: Int): Boolean = orderedSet.set.size match {
    case greater if orderedSet.set.size >= 2 =>
      if (orderedSet.midpoint == integer) true
      else if (orderedSet.midpoint < integer) {
        findInteger(orderedSet.secondHalf, integer)
      } else {
        findInteger(orderedSet.firstHalf, integer)
      }
    case 1 => orderedSet.set.head == integer
    case _ => false
  }
}

case class OrderedSet(set: Set[Int], firstIndex: Int, lastIndex: Int) {
  def this(chars: Set[Int]) = this(chars, 0, chars.size - 1)

  def midpoint = firstIndex + ((lastIndex - firstIndex) / 2)

  def first = set(firstIndex)

  def last = set(lastIndex)

  def mid = set(midpoint)

  def secondHalf = OrderedSet(set, midpoint, lastIndex)

  def firstHalf = OrderedSet(set, firstIndex, midpoint)

  def size = (lastIndex - firstIndex) + 1
}
