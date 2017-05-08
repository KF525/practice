package practice

class EggDrop {
  def findFloor(floor: Int, eggs: Int): (Int, Int) = {
    val startingFloor = 11 //try more
    val firstDrop = 1

    findFloorHelper(startingFloor, startingFloor, eggs, floor, firstDrop)
  }

  def findFloorHelper(currentFloor: Int,
                      previousFloor: Int,
                      numberOfEggs: Int,
                      eggBreakFloor: Int,
                      numberOfDrops: Int): (Int, Int) = {
    (currentFloor, numberOfEggs) match {
      case d if currentFloor == previousFloor-1 && numberOfEggs <= 1 =>
        (currentFloor, numberOfDrops)
      case a if currentFloor < eggBreakFloor && numberOfEggs == 2 =>
        findFloorHelper(currentFloor + 11, currentFloor, numberOfEggs, eggBreakFloor, numberOfDrops+1)
      case b if currentFloor > eggBreakFloor && numberOfEggs == 2 =>
        findFloorHelper(previousFloor+1, currentFloor, 1, eggBreakFloor, numberOfDrops+1)
      case c if currentFloor < eggBreakFloor && numberOfEggs == 1 =>
        findFloorHelper(currentFloor + 1, previousFloor,numberOfEggs, eggBreakFloor, numberOfDrops+1)
    }
  }
}

//case g if numberOfEggs == 0 =>
//(previousFloor, numberOfDrops)
//case a if currentFloor == 99 && currentFloor < eggBreakFloor =>
//(currentFloor+1, numberOfDrops)
//case b if currentFloor < eggBreakFloor && numberOfEggs == 2 =>
//findFloorHelper(currentFloor + 11, currentFloor, numberOfEggs, eggBreakFloor, numberOfDrops + 1)
//case startBinary if currentFloor > eggBreakFloor && numberOfEggs == 2 =>
//val newFloor = previousFloor + (currentFloor - previousFloor)/2
//val x = if (newFloor < eggBreakFloor) currentFloor-1 else previousFloor + 1
//findFloorHelper(newFloor, x, numberOfEggs - 1, eggBreakFloor, numberOfDrops + 1)
//case c if currentFloor < eggBreakFloor && numberOfEggs == 1 =>
//findFloorHelper(currentFloor+1, previousFloor, numberOfEggs, eggBreakFloor, numberOfDrops+1)
//case d if currentFloor > eggBreakFloor && numberOfEggs == 1 =>
//findFloorHelper(previousFloor+1, previousFloor, numberOfEggs-1, eggBreakFloor, numberOfDrops+1)
//case e if currentFloor == previousFloor && numberOfEggs == 1 =>
//(currentFloor, numberOfDrops)
//case f if currentFloor == 99 && numberOfEggs == 2 =>
//(currentFloor, numberOfDrops) //assuming it will break at some point
//case h if currentFloor == eggBreakFloor && numberOfEggs == 1 =>
//findFloorHelper(currentFloor+1, currentFloor, numberOfEggs, eggBreakFloor, numberOfDrops+1)
//case i if currentFloor > eggBreakFloor && numberOfEggs == 1 =>
//(currentFloor-1, numberOfDrops)