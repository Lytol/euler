isPalindrome str = do
                     let half = div (length str) 2
                     (take half str) == (take half (reverse str))

main = do
         let products = [ x*y | x <- [100..999], y <- [100..999] ]
         let palindromes = [ x | x <- products, isPalindrome (show x) ]
         print (maximum palindromes)

