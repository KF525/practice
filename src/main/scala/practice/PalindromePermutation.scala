package practice

class PalindromePermutation {
  def isPalindromePermutation(string: String): Boolean = {
    val frequencies = string.groupBy(_.toChar).mapValues(_.size).values
    val oddFrequencies = frequencies.filter(frequency => frequency % 2 != 0)
    if (oddFrequencies.size > 1) false else true
  }

  def isPalindromePermutation2(string: String): Boolean = {
    var unpaired: Set[Char]= Set()
    val finalSet = palindromeHelper(unpaired, string)

    if (finalSet.size > 1) false else true
  }

  def palindromeHelper(unpaired: Set[Char], string: String): Set[Char] = {
    string.length match {
      case 0 => unpaired
      case _ =>
        val newSet = if (unpaired.contains(string.head)) {
        unpaired - string.head
      } else {
        unpaired + string.head
      }
        palindromeHelper(newSet, string.tail)
    }
  }
}
