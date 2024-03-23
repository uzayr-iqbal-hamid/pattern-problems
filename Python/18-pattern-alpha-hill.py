def alphaTriangle(n):
    for i in range(n):
        ch = chr(ord('A') + (n - 1))

        for j in range(i + 1):
            print(ch, end=" ")
            ch = chr(ord(ch) - 1)
        
        for j in range(n - i - 1):
            print(" ", end="")
        
        print()

n = int(input())
alphaTriangle(n)
