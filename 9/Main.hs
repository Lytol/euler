tupleProduct (x,y,z) = x*y*z

main = do
         let correctTuple = head [ (a,b,c) | c <- [1..998], b <- [1..c], a <- [1..b], a*a + b*b == c*c , a+b+c == 1000]
         print (tupleProduct correctTuple)
