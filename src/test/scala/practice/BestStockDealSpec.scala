package practice

import org.scalatest.{FlatSpec, Matchers}

class BestStockDealSpec extends FlatSpec with Matchers{
  "BestStockDeal" should "return the best profit possible" in {
    val stockFinder = new StockFinder { }

    stockFinder.returnBestDeal(List(1,6,2,3,8)) shouldBe 7
    stockFinder.returnBestDeal(List()) shouldBe 0
    stockFinder.returnBestDeal(List(8,7,2,1)) shouldBe -1
    stockFinder.returnBestDeal(List(2,9,1,3,7)) shouldBe 7
  }
}
