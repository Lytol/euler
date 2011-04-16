import System.Environment

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
                 let nf = take 1 [ x | x <- 2 : [3,5..(floor (sqrt (fromIntegral n)))], n `mod` x == 0 ]
                 if null nf
                   then n
                   else head nf
              
main = do
         args <- getArgs
         print (primeFactors (read (head args) :: Integer))
