data BookingRequest =
  BookingRequest { getDate :: Date.Date
                 , getSeats :: Seats.Seats
                 }

data Error =
    DateError Date.Error
  | SeatsError Seats.Error
  | Missing String       -- ^ label
  | DateBefore Date.Date -- ^ date that was attempted
               Date.Date -- ^ the current date at attempt
