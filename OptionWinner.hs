-- | Assume: bestFriend, oldestSister, youngestChild
-- each returns 'Maybe Person'
winner :: Person -> Maybe Person
winner person = do
  friend <- person & bestFriend
  sister <- friend & oldestSister
  sister & youngestChild
