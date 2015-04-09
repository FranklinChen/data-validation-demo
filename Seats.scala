case class Seats private(val num: Int) extends AnyVal

object Seats {
  sealed trait Error
  case class BadCount(num: Int) extends Error {
    override def toString =
      s"number of seats was $num, but must be positive"
  }

  def make(num: Int): BadCount \/ Seats = {
    if (num < 0)
      BadCount(num).left
    else
      Seats(num).right
  }
}
