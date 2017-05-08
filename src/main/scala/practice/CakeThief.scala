package practice

case class Cake(weight: Int, value: Int) {
  def ratio: Int = this.value / this.weight
}

case class Cakes(tipe: Cake, num: Int) {
  def weight: Int = this.num * this.tipe.weight
  def value: Int = this.num * this.tipe.value
}

case class DuffleBag(weight: Int, value: Int) {
  def maxNumber(cake: Cake) = this.weight / cake.weight

  def addCakes(cakes: Cakes): DuffleBag = {
    DuffleBag(this.weight - cakes.weight, this.value + cakes.value)
  }

  def update(cake: Cake): DuffleBag =
    this.addCakes(Cakes(cake, this.maxNumber(cake)))
}

//TODO: what if two have the same ratio?
class CakeThief {
  def greedyFillDuffle(cakes: List[Cake], duffle: DuffleBag): Int = {
    val cakesOrderedByRatio = cakes.sortBy(_.ratio).reverse
    cakesOrderedByRatio.foldLeft(duffle)((bag, cake) => bag.update(cake)).value
  }
}