case class BookingRequest private(
  val date: Date,
  val seats: Seats
)

sealed trait Error

// These wrap errors from other modules.
case class DateError(e: Date.Error) extends Error
case class SeatsError(e: Seats.Error) extends Error

// Our additional errors.
case class DateBefore(date1: Date, date2: Date) extends Error
case class Missing(label: String) extends Error
