fibs = 1:1:zipWith (+) fibs (tail fibs)

fibList n = takeWhile (<n) fibs
              
main = print ( sum [x | x <- fibList 4000000, x `mod` 2 == 0] )
