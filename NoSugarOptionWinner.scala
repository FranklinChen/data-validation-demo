/** Assume: bestFriend(), oldestSister(), youngestChild()
  each returns Option[Person] */
def unsweetWinner(person: Person): Option[Person] =
  person.bestFriend()   .flatMap( friend =>
  friend.oldestSister() .flatMap( sister =>
  sister.youngestChild()
  ))
