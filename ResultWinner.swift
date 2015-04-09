/** Assume: bestFriend(), oldestSister(), youngestChild()
  each return Either<MyError, Person> */
func winner(person: Person) -> Either<MyError, Person> = {
  return person.bestFriend() .flatMap { friend in
    friend.oldestSister()    .flatMap { sister in
    sister.youngestChild()
  }}
}
