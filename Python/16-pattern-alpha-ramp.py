def alphaRamp(n):
    ch = 'A'
    for i in range(n):
        for j in range(i + 1):
            print(ch, end=" ")
        ch = chr(ord(ch) + 1)
        print()

n = int(input())
alphaRamp(n)
