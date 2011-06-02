sumOfSquares n = sum [x*x | x <- [1..n]]

squareOfSum n = do
                  let sumTo = sum [1..n]
                  sumTo * sumTo

main = do
         print (squareOfSum 100 - sumOfSquares 100)
