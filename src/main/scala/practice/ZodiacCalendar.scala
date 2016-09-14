package practice

class ZodiacCalendar {
  def findChineseZodiac(year: Int): (Element, Animal) = {
    val startYear = 1924
    val difference = year - startYear

    val elements = List(Wood, Fire, Earth, Metal, Water)
    val animals = List(Rat, Ox, Tiger, Rabbit, Dragon, Snake, Horse, Goat, Monkey, Rooster, Dog, Pig)

    val animalList = AnimalList(animals, 0, animals.length - 1)

    val animal = findAnimal(animalList, difference)
    val element = findElement(elements, year%10)
    (element, animal)
  }

  def findAnimal(animalList: AnimalList, difference: Int): Animal = difference match {
    case 0 => animalList.animals(animalList.currentPointer)
    case _ =>
      if (animalList.currentPointer == animalList.listLength)
        findAnimal(animalList.copy(currentPointer = 0), difference - 1)
      else
        findAnimal(animalList.copy(currentPointer = animalList.currentPointer + 1), difference - 1)
  }

  def findElement(elementList: List[Element], digit: Int) = digit match {
    case 0 | 1 => Metal
    case 2 | 3 => Water
    case 4 | 5 => Wood
    case 6 | 7 => Fire
    case 8 | 9 => Earth
  }
}

case class AnimalList(animals: List[Animal], currentPointer: Int, listLength: Int)

sealed trait Element
case object Wood extends Element
case object Fire extends Element
case object Earth extends Element
case object Metal extends Element
case object Water extends Element

sealed trait Animal
case object Rat extends Animal
case object Ox extends Animal
case object Tiger extends Animal
case object Rabbit extends Animal
case object Dragon extends Animal
case object Snake extends Animal
case object Horse extends Animal
case object Goat extends Animal
case object Monkey extends Animal
case object Rooster extends Animal
case object Dog extends Animal
case object Pig extends Animal