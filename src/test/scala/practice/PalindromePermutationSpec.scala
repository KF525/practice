package practice

import org.scalatest.{FlatSpec, Matchers}

class PalindromePermutationSpec extends FlatSpec with Matchers {
  val palindromePermutation = new PalindromePermutation
  "isPalindromePermutation" should "return true if a string is a permutation of a palindrome" in {
    palindromePermutation.isPalindromePermutation("civic") shouldBe true
    palindromePermutation.isPalindromePermutation("ccivi") shouldBe true
  }
  it should "return false if a string is not a permutation of a palindrome" in {
    palindromePermutation.isPalindromePermutation("civil") shouldBe false
    palindromePermutation.isPalindromePermutation("clivi") shouldBe false
  }
  "isPalindromePermutation2" should "return true if a string is a permutation of a palindrome" in {
    palindromePermutation.isPalindromePermutation2("civic") shouldBe true
    palindromePermutation.isPalindromePermutation2("ccivi") shouldBe true
  }
  it should "return false if a string is not a permutation of a palindrome" in {
    palindromePermutation.isPalindromePermutation2("civil") shouldBe false
    palindromePermutation.isPalindromePermutation2("clivi") shouldBe false
  }
}
