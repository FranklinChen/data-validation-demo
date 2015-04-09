def timelyBookingDate(date: Date, now: Date):
    DateBefore \/ Date = {
  if (!date.isBefore(now))
    date.right
  else
    DateBefore(date, now).left
}
