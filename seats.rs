pub struct Seats {
  num: i32 // private
}

pub enum Error {
  BadCount(i32)
}

impl Seats {
  pub fn make(num: i32) -> Result<Seats, Error> {
    if num <= 0 {
      Err(Error::BadCount(num))
    } else {
      Ok(Seats { num: num })
    }
  }
}
