/** Assume: bestFriend(), oldestSister(), youngestChild()
  each returns MyError \/ Person */
def winner(person: Person): MyError \/ Person = for {
  friend <- person.bestFriend()
  sister <- friend.oldestSister()
  child <- sister.youngestChild()
} yield child
