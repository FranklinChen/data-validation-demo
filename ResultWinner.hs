-- | Assume: bestFriend, oldestSister, youngestChild
-- each returns 'Either MyError Person'
winner :: Person -> Either MyError Person
winner person = do
  friend <- person & bestFriend
  sister <- friend & oldestSister
  sister & youngestChild
