/// Assume: best_friend(), oldest_sister(), youngest_child()
/// each returns Result<Person, MyError>
fn winner(person: Person) -> Result<Person, MyError> {
  let friend = try!(person.best_friend());
  let sister = try!(friend.oldest_sister());
  sister.youngest_child()
}
