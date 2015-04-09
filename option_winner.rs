/// Assume: best_friend(), oldest_sister(), youngest_child()
/// each returns Option<Person>
fn winner(person: Person) -> Option<Person> {
  person.best_friend()      .and_then( |friend|
     friend.oldest_sister() .and_then( |sister|
     sister.youngest_child()
  ))
}
