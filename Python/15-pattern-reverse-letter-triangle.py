def nLetterTriangle(n):
    for i in range(n, 0, -1):
        for ch in range(ord('A'), ord('A') + i):
            print(chr(ch), end=" ")
        print()

n = int(input())
nLetterTriangle(n)
