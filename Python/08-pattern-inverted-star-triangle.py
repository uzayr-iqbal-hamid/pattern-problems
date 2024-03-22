def nStarTriangle(n):
    for i in range(n, 0, -1):
        for j in range(n-i):
            print(" ", end="")

        for j in range(2*i-1):
            print("*", end="")

        for j in range(n-i):
            print(" ", end="")

        print()

def main():
    n = int(input())
    nStarTriangle(n)

if __name__ == "__main__":
    main()
