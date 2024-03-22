def nStarDiamond(n):
    # Upper half of the diamond
    for i in range(n):
        print(" " * (n - i - 1) + "*" * (2 * i + 1))

    # Lower half of the diamond
    for i in range(n - 2, -1, -1):
        print(" " * (n - i - 1) + "*" * (2 * i + 1))

def main():
    n = int(input())
    nStarDiamond(n)

if __name__ == "__main__":
    main()
