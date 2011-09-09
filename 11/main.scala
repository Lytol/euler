import scala.io.Source
import scala.collection.mutable.ListBuffer

object Euler11 {
  def main(args: Array[String]) {
    val grid = Grid.fromFile(args(0))
    println((grid.horizontalProducts ++ grid.verticalProducts ++ grid.diagonalLRProducts ++ grid.diagonalRLProducts).max)
  }
}

class Grid(data: List[List[Int]]) {
  def valueAt(x:Int, y:Int): Int = data(x)(y)

  def horizontalProducts(): List[Int] = {
    var list = new ListBuffer[List[Int]]()
    for(i <- 0 to 19)
      for(j <- 0 to 16) {
        list += data(i).slice(j,j+4)
      }
    list.map(l => l.product).toList
  }

  def verticalProducts(): List[Int] = {
    var list = new ListBuffer[List[Int]]()
    for(i <- 0 to 16)
      for(j <- 0 to 19) {
        list += valueAt(i,j) :: valueAt(i+1,j) :: valueAt(i+2,j) :: valueAt(i+3,j) :: Nil
      }
    list.map(l => l.product).toList
  }

  def diagonalLRProducts(): List[Int] = {
    var list = new ListBuffer[List[Int]]()
    for(i <- 0 to 16)
      for(j <- 0 to 16) {
        list += valueAt(i,j) :: valueAt(i+1,j+1) :: valueAt(i+2,j+2) :: valueAt(i+3,j+3) :: Nil
      }
    list.map(l => l.product).toList
  }

  def diagonalRLProducts(): List[Int] = {
    var list = new ListBuffer[List[Int]]()
    for(i <- 0 to 16)
      for(j <- 3 to 19) {
        list += valueAt(i,j) :: valueAt(i+1,j-1) :: valueAt(i+2,j-2) :: valueAt(i+3,j-3) :: Nil
      }
    list.map(l => l.product).toList
  }
}

object Grid {
  def fromFile(filename: String) = {
    val gridData = ListBuffer[List[Int]]()
    for(line <- Source.fromFile(filename).getLines())
       gridData += line.split(" ").map(s => s.toInt).toList
    new Grid(gridData.toList)
  }
}

