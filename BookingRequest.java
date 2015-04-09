public void check() {
  if (date == null)
    throw new IllegalArgumentException("date is missing");
  LocalDate parsedDate;
  try {
    parsedDate = LocalDate.parse(date);
  }
  catch (DateTimeParseException e) {
    throw new IllegalArgumentException("Invalid format for date", e);
  }
  if (parsedDate.isBefore(LocalDate.now()))
    throw new IllegalArgumentException("date cannot be before today");
  if (numberOfSeats == null)
    throw new IllegalArgumentException("number of seats cannot be null");
  if (numberOfSeats < 1)
    throw new IllegalArgumentException("number of seats must be positive");
}
