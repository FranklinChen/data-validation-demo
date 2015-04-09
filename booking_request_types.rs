pub struct BookingRequest {
  date: Date,
  seats: seats::Seats
}

pub enum Error {
  DateError(date::Error),
  SeatsError(seats::Error),
  DateBefore(Date, Date),
  Missing(String)
}
