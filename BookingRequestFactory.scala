def make(
  now: Date,
  optDateString: Option[String],
  optSeats: Option[Int]
): ValidationNel[Error, BookingRequest] = {
  val combinedBuilder =
    makeTimelyBookingDate(now, optDateString).
      validation.toValidationNel |@|
    makeSeats(optSeats).
      validation.toValidationNel

  combinedBuilder(BookingRequest(_, _))
}
