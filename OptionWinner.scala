/** Assume: bestFriend(), oldestSister(), youngestChild()
  each returns Option[Person] */
def winner(person: Person): Option[Person] = for {
  friend <- person.bestFriend()
  sister <- friend.oldestSister()
  child <- sister.youngestChild()
} yield child
