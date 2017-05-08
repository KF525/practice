package practice

import org.scalatest.{FlatSpec, Matchers}

class RecursivePermutationSpec extends FlatSpec with Matchers{
  val recursivePermutation = new RecusivePermutation

  "getPermutations" should "return all permutations of a string" in {
    val expectedPermutations = Set("abc", "acb", "bac", "bca", "cab", "cba")
    //recursivePermutation.getPermutations("abc") shouldBe expectedPermutations
  }
}
