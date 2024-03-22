def nStarTriangle(n):
    # Upper half of the triangle
    for i in range(n):
        print("*" * (i + 1) + " " * (n - i - 1))

    # Lower half of the triangle
    for i in range(n - 1, 0, -1):
        print("*" * i + " " * (n - i))

def main():
    n = int(input())
    nStarTriangle(n)

if __name__ == "__main__":
    main()
