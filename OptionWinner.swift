/** Assume: bestFriend(), oldestSister(), youngestChild()
  each return Person? */
func winner(person: Person) -> Person? = {
  return person.bestFriend()?.
                oldestSister()?.
                youngestChild()
}
