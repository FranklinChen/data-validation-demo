def makeSeats(optSeats: Option[Int]):
    Error \/ Seats = for {
  num <- optSeats.toRightDisjunction(Missing("seats"))
  validSeats <- Seats.make(num).leftMap(SeatsError)
} yield validSeats
