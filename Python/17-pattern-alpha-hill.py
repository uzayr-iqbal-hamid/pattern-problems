def alphaHill(n):
    for i in range(n):
        for j in range(n - i - 1):
            print(" ", end="")
        
        ch = 'A'
        middle = (2 * i + 1) // 2
        for j in range(1, 2 * i + 2):
            print(ch, end=" ")
            if j <= middle:
                ch = chr(ord(ch) + 1)
            else:
                ch = chr(ord(ch) - 1)
        
        for j in range(n - i - 1):
            print(" ", end="")
        
        print()

n = int(input())
alphaHill(n)
