primeFactors :: Integer -> [Integer]
primeFactors n = do
             let x = nextFactor n
             if x == n
               then [n]
               else x : primeFactors (div n x)

nextFactor :: Integer -> Integer
nextFactor 1 = 1
nextFactor 2 = 2
nextFactor n = do
                 let nf = take 1 [ x | x <- [2..(div n 2)], n `mod` x == 0 ]
                 if null nf
                   then n
                   else head nf
              
main = print (primeFactors 600851475143)
