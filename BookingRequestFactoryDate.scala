def makeTimelyBookingDate(now: Date,
  optDateString: Option[String]): Error \/ Date = for {
  dateString <- optDateString.
                toRightDisjunction(Missing("date"))
    date <- Date.parse(dateString).leftMap(DateError)
    timelyDate <- timelyBookingDate(date, now)
} yield timelyDate
